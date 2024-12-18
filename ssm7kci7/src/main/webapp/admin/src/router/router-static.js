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
    import aboutus from '@/views/modules/aboutus/list'
    import qiantuixinxi from '@/views/modules/qiantuixinxi/list'
    import tushuguan from '@/views/modules/tushuguan/list'
    import storeup from '@/views/modules/storeup/list'
    import forum from '@/views/modules/forum/list'
    import zuoweixinxi from '@/views/modules/zuoweixinxi/list'
    import yuyuexuanzuo from '@/views/modules/yuyuexuanzuo/list'
    import systemintro from '@/views/modules/systemintro/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discusstushuguan from '@/views/modules/discusstushuguan/list'
    import messages from '@/views/modules/messages/list'
    import qiandaoxinxi from '@/views/modules/qiandaoxinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
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
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/qiantuixinxi',
        name: '签退信息',
        component: qiantuixinxi
      }
      ,{
	path: '/tushuguan',
        name: '图书馆',
        component: tushuguan
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/forum',
        name: '论坛管理',
        component: forum
      }
      ,{
	path: '/zuoweixinxi',
        name: '座位信息',
        component: zuoweixinxi
      }
      ,{
	path: '/yuyuexuanzuo',
        name: '预约选座',
        component: yuyuexuanzuo
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/discusstushuguan',
        name: '图书馆评论',
        component: discusstushuguan
      }
      ,{
	path: '/messages',
        name: '留言反馈',
        component: messages
      }
      ,{
	path: '/qiandaoxinxi',
        name: '签到信息',
        component: qiandaoxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
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
    name: '系统首页',
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
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
