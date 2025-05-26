import { useLoginUserStore } from '@/stores/useLoginUserStore'
import { message } from 'ant-design-vue'
import router from '@/router'

/**
 * 全局权限校验 每次路由跳转前都会执行
 */
router.beforeEach(async (to, from, next) => {
  const loginUserStore = useLoginUserStore()
  let loginUser = loginUserStore.loginUser
  // 确保页面刷新，首次加载时，能够等后端返回用户信息后再校验权限
  await loginUserStore.fetchLoginUser()
  loginUser = loginUserStore.loginUser
  const toUrl = to.fullPath

  // 自定义的前端权限校验规则，我这里如果是 /admin 开头的路由，必须登录且角色为 admin 才能访问
  if (toUrl.startsWith('/admin')) {
    if (!loginUser || loginUser.userRole !== 'admin') {
      message.error('未登录或者没有权限')
      next(`/user/login?redirect=${to.fullPath}`)
      return
    }
  }
  next()
})
