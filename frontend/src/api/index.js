import axios from 'axios'
import { useTokenStore } from '@/stores/auth'

const API_URL = 'http://localhost:8080/api/users'

// 創建一個新的 Axios 實例
const apiClient = axios.create({
  baseURL: API_URL,
  headers: {
    'Content-Type': 'application/json'
  }
})

// 設置 Axios 請求攔截器
apiClient.interceptors.request.use(
  (config) => {
    const authStore = useTokenStore()
    const token = authStore.token

    // 檢查請求的 URL 是否為登入或註冊
    if (token && !config.url.endsWith('/login') && !config.url.endsWith('/register')) {
      config.headers.Authorization = `Bearer ${token}` // 僅在非登入和註冊請求時添加 token
    }

    return config
  },
  (error) => {
    return Promise.reject(error)
  }
)

// 使用新的 Axios 實例
export const registerUser = (user) => {
  return apiClient.post('/register', user)
}

export const loginUser = async (user) => {
  const authStore = useTokenStore()
  try {
    const response = await apiClient.post('/login', user)
    const token = response.data.jwtToken // 提取 jwtToken
    if (token) {
      authStore.setToken(token) // 儲存 token
    } else {
      console.error('登入成功但沒有返回 jwtToken')
    }
    return response
  } catch (error) {
    console.error('登入失敗:', error)
    throw error
  }
}

export const getUserById = (id) => {
  return apiClient.get(`/${id}`)
}
