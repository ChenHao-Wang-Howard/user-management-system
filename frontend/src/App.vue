<script setup lang="ts">
import { RouterView } from 'vue-router';
</script>

<template>
  <div id="app">
    <header>
      <h1>User Management System</h1>
    </header>
    <RouterView />
  </div>
</template>

<style scoped>
#app {
  text-align: center;
}

header {
  padding: 20px;
  background-color: #f5f5f5;
}

h1 {
  margin: 0;
  font-size: 24px;
}
</style>
