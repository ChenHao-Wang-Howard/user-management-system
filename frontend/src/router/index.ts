import { createRouter, createWebHistory } from 'vue-router'
import Register from '../views/RegisterView.vue'
import Login from '../views/LoginView.vue'
import UserProfile from '../views/UserProfile.vue'

const routes = [
  { path: '/register', component: Register },
  { path: '/login', component: Login },
  {
    path: '/user/:id',
    component: UserProfile,
    props: true // 自動將 route.params 作為 props 傳遞給 UserProfile 組件
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
