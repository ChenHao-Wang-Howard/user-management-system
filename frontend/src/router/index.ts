import { createRouter, createWebHistory, type RouteLocationNormalized } from 'vue-router'
import Register from '../views/RegisterView.vue'
import Login from '../views/LoginView.vue'
import UserProfile from '../views/UserProfile.vue'

const routes = [
  { path: '/register', component: Register },
  { path: '/login', component: Login },
  {
    path: '/user/:id',
    component: UserProfile,
    props: (route: RouteLocationNormalized) => ({
      id: route.params.id,
      username: route.query.username,
      password: route.query.password
    })
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
