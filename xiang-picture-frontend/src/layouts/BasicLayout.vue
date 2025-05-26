<template>
  <div id="basicLayout">
    <a-layout style="min-height: 100vh">
      <a-layout-header class="header">
        <GlobalHeader />
      </a-layout-header>
      <a-layout>
        <GlobalSider class="sider" />
        <a-layout-content class="content">
          <router-view />
        </a-layout-content>
      </a-layout>
      <a-layout-footer class="footer">
        <!--        <a href="https://www.codefather.cn" target="_blank"> 程序员祥子 </a>-->
      </a-layout-footer>
    </a-layout>
  </div>
</template>

<script setup lang="ts">
import GlobalHeader from '@/components/GlobalHeader.vue'
import GlobalSider from '@/components/GlobalSider.vue'
</script>

<style scoped>
#basicLayout .header {
  padding-inline: 20px;
  margin-bottom: 1px;
  background: white;
  color: unset;
}

#basicLayout .content {
  padding: 28px;
  margin-bottom: 50px;
  background: linear-gradient(to right, #fefefe, #fff);
}

#basicLayout .sider {
  padding-top: 20px;
  border-right: 0.5px solid #eee;
  background: #fff;
}

#basicLayout .footer {
  padding: 16px;
  position: fixed;
  bottom: 0;
  left: 0;
  right: 0;
  background: #efefef;
  text-align: center;
}

#basicLayout :deep(.ant-menu-root) {
  border-bottom: none !important;
  border-inline-end: none !important;
}
</style>
