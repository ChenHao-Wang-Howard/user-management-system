import { defineStore } from 'pinia'
import { ref } from 'vue'

// 使用 Token Store
export const useTokenStore = defineStore(
  'auth',
  () => {
    // 初始化 token 為空字串或 null
    const token = ref('')

    // 設定 token 的方法
    const setToken = (newToken: string) => {
      token.value = newToken
      console.log('Token set to:', newToken) // 顯示 token 值
    }

    // 清除 token 的方法
    const clearToken = () => {
      token.value = ''
    }

    // 返回 token 和方法
    return { token, setToken, clearToken }
  },
  {
    persist: true // pinia-plugin-persistedstate
  }
)
