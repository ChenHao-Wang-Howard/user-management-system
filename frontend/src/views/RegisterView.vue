<template>
    <div>
        <h2>註冊</h2>
        <form @submit.prevent="register">
            <input v-model="user.username" placeholder="用戶名" required />
            <input v-model="user.password" type="password" placeholder="密碼" required />
            <input v-model="user.email" type="email" placeholder="電子郵件" required />
            <button type="submit">註冊</button>
        </form>
    </div>
</template>

<script>
import { registerUser } from '../api';

export default {
    data() {
        return {
            user: {
                username: '',
                password: '',
                email: ''  // 新增的電子郵件欄位
            }
        };
    },
    methods: {
        async register() {
            try {
                const response = await registerUser(this.user);
                alert('註冊成功！');
            } catch (error) {
                console.error('註冊失敗:', error);
            }
        }
    }
};
</script>
