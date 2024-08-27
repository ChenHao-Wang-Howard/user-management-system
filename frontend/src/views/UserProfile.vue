<template>
    <div>
        <h2>用戶信息</h2>
        <p>用戶名: {{ user.username }}</p>
        <p>電子郵件: {{ user.email }}</p>
    </div>
</template>

<script>
import { getUserById } from '../api';

export default {
    props: ['id'],
    data() {
        return {
            user: {}
        };
    },
    async created() {
        console.log('User profile get ID:', this.id);
        try {
            const response = await getUserById(this.id); // 使用攔截器自動添加 token
            console.log('API Response:', response);
            this.user = response.data;
        } catch (error) {
            console.error('Error fetching user data:', error);
            console.log('Error details:', {
                message: error.message,
                response: error.response,
                status: error.response?.status,
                headers: error.response?.headers,
                data: error.response?.data
            });
        }
    }
};
</script>
