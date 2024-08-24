// UserProfile.vue
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
    props: ['id', 'username', 'password'],
    data() {
        return {
            user: {}
        };
    },
    async created() {
        try {
            const username = this.$route.query.username;
            const password = this.$route.query.password;

            console.log('Fetching user data with ID:', this.id);
            console.log('Using credentials - Username:', this.username, 'Password:', this.password);

            const response = await getUserById(this.id, this.username, this.password);
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
