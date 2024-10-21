import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import tushufenlei from '@/views/modules/tushufenlei/list'
    import jiaonafajin from '@/views/modules/jiaonafajin/list'
    import yonghu from '@/views/modules/yonghu/list'
    import tushujieyue from '@/views/modules/tushujieyue/list'
    import messages from '@/views/modules/messages/list'
    import tushuguihai from '@/views/modules/tushuguihai/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'
    import discusstushuxinxi from '@/views/modules/discusstushuxinxi/list'
    import tushuxinxi from '@/views/modules/tushuxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
          ,{
	path: '/tushufenlei',
        name: '图书分类',
        component: tushufenlei
      }
          ,{
	path: '/jiaonafajin',
        name: '缴纳罚金',
        component: jiaonafajin
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/tushujieyue',
        name: '图书借阅',
        component: tushujieyue
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/tushuguihai',
        name: '图书归还',
        component: tushuguihai
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/discusstushuxinxi',
        name: '图书信息评论',
        component: discusstushuxinxi
      }
          ,{
	path: '/tushuxinxi',
        name: '图书信息',
        component: tushuxinxi
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
