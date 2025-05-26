import { fileURLToPath, URL } from 'node:url'

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import vueDevTools from 'vite-plugin-vue-devtools'

// https://vite.dev/config/
export default defineConfig({
  //vite脚手架自带的代理，开发阶段可以用
  // server: {
  //   proxy: {
  //     '/api': {
  //       target: 'http://localhost:8123',
  //     },
  //   },
  // },
  plugins: [vue(), vueDevTools()],
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url)),
    },
  },
  // server: {
  //   host: 'localhost',
  //   proxy: {
  //     '/xiang_picture': {
  //       target: 'https://xiangzi-1331802974.cos.ap-guangzhou.myqcloud.com',
  //       changeOrigin: true,
  //       rewrite: (path) => path.replace(/^\/xiang_picture/, ''),
  //     },
  //   },
  // },
})
