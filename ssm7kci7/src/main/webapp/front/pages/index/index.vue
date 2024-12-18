<template>
<view class="content">
	<view :style='{"width":"100%","padding":"0 0 40rpx","background":"#fff","height":"auto"}'>
		<swiper :style='{"width":"100%","background":"#fff","height":"360rpx"}' class="swiper" :indicator-dots='false' :autoplay='true' :circular='false' indicator-active-color='#000000' indicator-color='rgba(0, 0, 0, .3)' :duration='500' :interval='5000' :vertical='false'>
			<swiper-item :style='{"width":"100%","backgroundSize":"100% 100%","backgroundImage":"url(http://codegen.caihongy.cn/20221031/e8e574a8846342f9968f75b31741fdc2.png)","height":"360rpx"}' v-for="(swiper,index) in swiperList" :key="index" @tap="onSwiperTap(swiper)">
				<image :style='{"border":"4rpx solid #34ab82","width":"90%","margin":"32rpx auto","objectFit":"cover","display":"block","height":"260rpx"}' mode="aspectFill" :src="baseUrl+swiper.img"></image>
				<view v-if="false" :style='{"width":"100%","padding":"0 8rpx","lineHeight":"60rpx","fontSize":"28rpx","color":"#333","background":"#fff"}'>{{ swiper.title }}</view>
			</swiper-item>
		</swiper>


		<!-- menu -->
		<view v-if="true" class="menu" :style='{"padding":"0","margin":"0","flexWrap":"wrap","background":"0","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
            <block v-for="item in menuList" v-bind:key="item.roleName">
                <block v-if="role==item.roleName" v-bind:key="index" v-for=" (menu,index) in item.frontMenu">
                    <block v-bind:key="sort" v-for=" (child,sort) in menu.child">
                        <block v-bind:key="sort2" v-for=" (button,sort2) in child.buttons">
                            <view :style='{"width":"23%","padding":"12rpx 0","margin":"10rpx 0","height":"auto"}' class="menu-list" v-if="button=='查看' && child.tableName!='yifahuodingdan' && child.tableName!='yituikuandingdan' &&child.tableName!='yiquxiaodingdan' && child.tableName!='weizhifudingdan' && child.tableName!='yizhifudingdan' && child.tableName!='yiwanchengdingdan' " @tap="onPageTap2('../'+child.tableName+'/list')">
                                <view class="iconarr" :class="child.appFrontIcon" :style='{"padding":"0","margin":"0px auto","color":"#266b51","borderRadius":"100%","background":"0","display":"block","width":"64rpx","lineHeight":"64rpx","fontSize":"64rpx","height":"64rpx"}'></view>
                                <view :style='{"padding":"0","margin":"12rpx auto 0","color":"#333","textAlign":"center","width":"100%","lineHeight":"28rpx","fontSize":"28rpx"}'>{{child.menu.split("列表")[0]}}</view>
                            </view>
                        </block>
                    </block>
                </block>
            </block>
		</view>
		<!-- menu -->
		
		
		<!-- 关于我们 -->
		<view :style='{"border":"2rpx solid #d8f0e7","padding":"24rpx","margin":"24rpx","borderRadius":"16rpx 16rpx","flexWrap":"wrap","background":"#e4f4ec","display":"flex","width":"calc(100% - 48rpx)","position":"relative","justifyContent":"space-between","height":"auto"}'>
		  <view :style='{"width":"100%","margin":"0 0 24rpx","fontSize":"36rpx","color":"#333","textAlign":"center"}'>{{aboutUsDetail.title}}</view>
		  <view :style='{"margin":"0 0 20rpx","color":"#999","textAlign":"center","display":"none","width":"100%","lineHeight":"1.5","fontSize":"32rpx"}'>{{aboutUsDetail.subtitle}}</view>
		  <view :style='{"width":"100%","padding":"0","flexWrap":"wrap","justifyContent":"space-between","display":"flex","height":"auto"}'>
		    <img :style='{"width":"100%","margin":"0","objectFit":"cover","height":"auto"}' v-if="aboutUsDetail.picture1" :src="baseUrl+aboutUsDetail.picture1">
		    <img :style='{"width":"25%","margin":"0","objectFit":"cover","display":"none","height":"100%"}' v-if="aboutUsDetail.picture2" :src="baseUrl+aboutUsDetail.picture2">
		    <img :style='{"margin":"0 10rpx","objectFit":"cover","flex":1,"display":"none","height":"160rpx"}' v-if="aboutUsDetail.picture3" :src="baseUrl+aboutUsDetail.picture3">
		  </view>
		  <view :style='{"padding":"16rpx","margin":"0 0 20rpx 0","overflow":"hidden","color":"#fff","background":"#4f977e","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textIndent":"2em","height":"240rpx"}' v-html="aboutUsDetail.content"></view>
		  <view :style='{"width":"50%","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"160rpx"}' />
		  <view :style='{"width":"50%","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"160rpx"}' />
		</view>

		<!-- 商品推荐 -->
		<!-- 商品推荐 -->
		
		

		<!-- 商品列表 -->
										<view class="listBox list">
			<view v-if="true && 1 == 1" class="idea listIdea" :style='{"padding":"0","margin":"0 auto","overflow":"hidden","flexWrap":"wrap","background":"0","display":"flex","width":"90%","justifyContent":"space-between","height":"120rpx"}'>
				<view :style='{"width":"100%","fontSize":"24rpx","color":"#266b51","height":"70%"}' class="box box1">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></view>
				<view :style='{"width":"100%","fontSize":"24rpx","color":"#266b51","height":"30%"}' class="box box2">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></view>
				<view :style='{"width":"20%","background":"#fff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		  
			<view class="title" :style='{"padding":"0 24rpx","margin":"12rpx auto","top":"0","left":"5%","display":"flex","width":"90%","position":"absolute","justifyContent":"space-between"}'>
				<view :style='{"fontSize":"40rpx","lineHeight":"88rpx","color":"#000","fontWeight":"600"}'>图书馆</view>
				<text :style='{"color":"#266b51","fontSize":"32rpx","lineHeight":"88rpx"}' @tap="onPageTap('tushuguan')">查看更多</text>
			</view>
			
			<view v-if="true && 1 == 2" class="idea listIdea" :style='{"padding":"0","margin":"0 auto","overflow":"hidden","flexWrap":"wrap","background":"0","display":"flex","width":"90%","justifyContent":"space-between","height":"120rpx"}'>
				<view :style='{"width":"100%","fontSize":"24rpx","color":"#266b51","height":"70%"}' class="box box1">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></view>
				<view :style='{"width":"100%","fontSize":"24rpx","color":"#266b51","height":"30%"}' class="box box2">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></view>
				<view :style='{"width":"20%","background":"#fff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
		  		  <!-- 样式1 -->
		  <view class="list-box style1" :style='{"padding":"24rpx","margin":"0","flexWrap":"wrap","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
			<view @tap="onDetailTap('tushuguan',product.id)" v-for="(product,index) in hometushuguanlist" :key="index" class="list-item" :style='{"border":"2rpx solid #d8f0e7","margin":"0 0 32rpx","backgroundColor":"#e9f8f1","borderRadius":"16rpx","flexWrap":"wrap","display":"flex","width":"48%","position":"relative","justifyContent":"space-between","height":"auto"}'>
			                			  <view :style='{"padding":"4rpx 20rpx","whiteSpace":"nowrap","overflow":"hidden","color":"#333","width":"70%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","order":"1"}' class="list-item-title ">{{product.mingcheng}}</view>
			  			  			  			                			  <view :style='{"padding":"4rpx 20rpx","whiteSpace":"nowrap","overflow":"hidden","color":"#333","width":"70%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","order":"1"}' class="list-item-title ">{{product.dizhi}}</view>
			  			  			  			                			  			  <image :style='{"padding":"0","margin":"20rpx","objectFit":"cover","borderRadius":"40rpx","display":"block","width":"calc(100% - 40rpx)","height":"300rpx","order":"0"}' class="list-item-image" mode="aspectFill" v-if="product.tupian.substring(0,4)=='http'" :src="product.tupian"></image>
			  <image :style='{"padding":"0","margin":"20rpx","objectFit":"cover","borderRadius":"40rpx","display":"block","width":"calc(100% - 40rpx)","height":"300rpx","order":"0"}' class="list-item-image" mode="aspectFill" v-else :src="product.tupian?baseUrl+product.tupian.split(',')[0]:''"></image>
			  			  			                			  <view :style='{"padding":"4rpx 20rpx","whiteSpace":"nowrap","overflow":"hidden","color":"#333","width":"70%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","order":"1"}' class="list-item-title ">{{product.guimo}}</view>
			  			  			  			                			  			  			                			  			  			                			  			  			  			</view>
		  </view>
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
			<view v-if="true && 1 == 3" class="idea listIdea" :style='{"padding":"0","margin":"0 auto","overflow":"hidden","flexWrap":"wrap","background":"0","display":"flex","width":"90%","justifyContent":"space-between","height":"120rpx"}'>
				<view :style='{"width":"100%","fontSize":"24rpx","color":"#266b51","height":"70%"}' class="box box1">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></view>
				<view :style='{"width":"100%","fontSize":"24rpx","color":"#266b51","height":"30%"}' class="box box2">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></view>
				<view :style='{"width":"20%","background":"#fff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																																																		<!-- 商品列表 -->
		
		
		<!-- 新闻资讯 -->
																																						<view class="listBox news">
			<view v-if="true && 1 == 1" class="idea newsIdea" :style='{"padding":"0","margin":"0 auto","overflow":"hidden","flexWrap":"wrap","background":"0","display":"flex","width":"90%","justifyContent":"space-between","height":"120rpx"}'>
				<view :style='{"width":"100%","fontSize":"24rpx","color":"#266b51","height":"70%"}' class="box box1">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></view>
				<view :style='{"width":"100%","fontSize":"24rpx","color":"#266b51","height":"30%"}' class="box box2">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></view>
				<view :style='{"width":"20%","background":"#fff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<view class="title" :style='{"padding":"0 24rpx","margin":"10rpx auto","top":"0","left":"5%","display":"flex","width":"90%","position":"absolute","justifyContent":"space-between"}'>
				<view :style='{"fontSize":"40rpx","lineHeight":"88rpx","color":"#000","fontWeight":"600"}'>公告信息</view>
				<text :style='{"color":"#266b51","fontSize":"32rpx","lineHeight":"88rpx"}' @tap="onPageTap('news')">查看更多</text>
			</view>
			
			<view v-if="true && 1 == 2" class="idea newsIdea" :style='{"padding":"0","margin":"0 auto","overflow":"hidden","flexWrap":"wrap","background":"0","display":"flex","width":"90%","justifyContent":"space-between","height":"120rpx"}'>
				<view :style='{"width":"100%","fontSize":"24rpx","color":"#266b51","height":"70%"}' class="box box1">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></view>
				<view :style='{"width":"100%","fontSize":"24rpx","color":"#266b51","height":"30%"}' class="box box2">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></view>
				<view :style='{"width":"20%","background":"#fff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
					  
						
						
		  <!-- 样式4 -->
		  		  
		  <!-- 样式5 -->
		  		  
		  <!-- 样式6 -->
		  		  
		  <!-- 样式7 -->
		  		  
		  <!-- 样式8 -->
		  		  
		  <!-- 样式9 -->
		  		  <view class="news-box6" :style='{"width":"100%","padding":"24rpx","margin":"0","height":"auto"}'>
			<view @tap="onNewsDetailTap(item.id)" v-for="(item,index) in news" :key="index" class="list-item" :style='{"padding":"8rpx 24rpx 8rpx 80rpx","margin":"0 0 20rpx","borderColor":"#d8f0e7","borderRadius":"16rpx","background":"radial-gradient(circle, rgba(246,251,249,1) 0%, rgba(237,250,244,1) 100%)","borderWidth":"2rpx 2rpx 4rpx 2rpx","width":"100%","position":"relative","borderStyle":"solid","height":"auto"}'>
			  <view :style='{"border":"2rpx solid #4f977e","padding":"0","margin":"-24rpx 0 0 16rpx","color":"#4f977e","textAlign":"center","borderRadius":"100%","top":"50%","left":"0","width":"40rpx","lineHeight":"40rpx","fontSize":"28rpx","position":"absolute","height":"40rpx"}' class="num">
			    <view style="width: 100%;height: 100%;position: absolute;left: 0;top: 0;" :style="{transform: 'rotate('+(-index*60)+'deg)'}" class="dian">
			      <view :style='{"transform":"translateX(-50%)","borderRadius":"100%","top":"-8rpx","left":"50%","background":"red","width":"0","position":"absolute","height":"0"}'></view>
			    </view>{{ index + 1 < 10 ? '0'+(index+1) : index+1 }}
			  </view>
			  <view class="item-list-body" :style='{"width":"100%","margin":"0","background":"none","height":"auto"}'>
				<view :style='{"width":"100%","padding":"4rpx 20rpx","lineHeight":"1.4","fontSize":"28rpx","color":"#333"}' class="title ">{{item.title}}</view>
				<view :style='{"padding":"4rpx 20rpx","overflow":"hidden","color":"#666","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","height":"48rpx"}' class="desc ">{{item.introduction}}</view>
			  </view>
			</view>
		  </view>
		  			
			<view v-if="true && 1 == 3" class="idea newsIdea" :style='{"padding":"0","margin":"0 auto","overflow":"hidden","flexWrap":"wrap","background":"0","display":"flex","width":"90%","justifyContent":"space-between","height":"120rpx"}'>
				<view :style='{"width":"100%","fontSize":"24rpx","color":"#266b51","height":"70%"}' class="box box1">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></view>
				<view :style='{"width":"100%","fontSize":"24rpx","color":"#266b51","height":"30%"}' class="box box2">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></view>
				<view :style='{"width":"20%","background":"#fff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																						<!-- 新闻资讯 -->
				
		<!-- 系统简介 -->
		<view :style='{"padding":"16rpx","margin":"24rpx auto 0px auto ","borderRadius":"16rpx","flexWrap":"wrap","background":"#e4f4ec","display":"flex","width":"calc(100% - 48rpx)","justifyContent":"space-between","height":"400rpx"}'>
		  <view :style='{"padding":"0","margin":"16rpx 0 0 0","color":"#333","textAlign":"center","background":"none","width":"48rpx","lineHeight":"48rpx","fontSize":"44rpx"}'>{{systemIntroductionDetail.title}}</view>
		  <view :style='{"margin":"0 0 20rpx","color":"#999","textAlign":"center","display":"none","width":"0%","lineHeight":"1.5","fontSize":"32rpx"}'>{{systemIntroductionDetail.subtitle}}</view>
		  <view :style='{"padding":"0","margin":"0","borderRadius":"16rpx","flexWrap":"wrap","background":"none","display":"flex","width":"30%","height":"auto"}'>
		    <img :style='{"width":"100%","margin":"0","objectFit":"cover","borderRadius":"16rpx","display":"block","height":"auto"}' v-if="systemIntroductionDetail.picture1" :src="baseUrl+systemIntroductionDetail.picture1">
		    <img :style='{"margin":"0 10rpx","objectFit":"cover","flex":1,"display":"none","height":"160rpx"}' v-if="systemIntroductionDetail.picture2" :src="baseUrl+systemIntroductionDetail.picture2">
		    <img :style='{"margin":"0 10rpx","objectFit":"cover","flex":1,"display":"none","height":"160rpx"}' v-if="systemIntroductionDetail.picture3" :src="baseUrl+systemIntroductionDetail.picture3">
		  </view>
		  <view :style='{"padding":"0px","margin":"0","overflow":"hidden","color":"rgb(102, 102, 102)","background":"none","width":"58%","lineHeight":"48rpx","fontSize":"28rpx","textIndent":"2em","height":"336rpx"}' v-html="systemIntroductionDetail.content"></view>
		  <view :style='{"width":"50%","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"160rpx"}' />
		  <view :style='{"width":"50%","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"160rpx"}' />
		</view>

	</view>
</view>
</template>

<script>
    import menu from '@/utils/menu'
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {
				options2: {
					effect: 'flip',
					loop : true
				},
				options3: {
					effect: 'cube',
					loop : true,
					cubeEffect: {
						shadow: true,
						slideShadows: true,
						shadowOffset: 20,
						shadowScale: 0.94,
					}
				},
				rows: 2,
				column: 4,
				iconArr: [
				  'cuIcon-same',
				  'cuIcon-deliver',
				  'cuIcon-evaluate',
				  'cuIcon-shop',
				  'cuIcon-ticket',
				  'cuIcon-cascades',
				  'cuIcon-discover',
				  'cuIcon-question',
				  'cuIcon-pic',
				  'cuIcon-filter',
				  'cuIcon-footprint',
				  'cuIcon-pulldown',
				  'cuIcon-pullup',
				  'cuIcon-moreandroid',
				  'cuIcon-refund',
				  'cuIcon-qrcode',
				  'cuIcon-remind',
				  'cuIcon-profile',
				  'cuIcon-home',
				  'cuIcon-message',
				  'cuIcon-link',
				  'cuIcon-lock',
				  'cuIcon-unlock',
				  'cuIcon-vip',
				  'cuIcon-weibo',
				  'cuIcon-activity',
				  'cuIcon-friendadd',
				  'cuIcon-friendfamous',
				  'cuIcon-friend',
				  'cuIcon-goods',
				  'cuIcon-selection'
				],
                role : '',
                aboutUsDetail: {},
                systemIntroductionDetail: {},
                menuList: [],
                swiperMenuList:[],
                user: {},
                tableName:'',

				//轮播
				swiperList: [],
				hometushuguanlist: [],
				news: [],
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
        async onLoad(){
            this.role = uni.getStorageSync("role");
            let table = uni.getStorageSync("nowTable");
            let res = await this.$api.session(table);
            this.user = res.data;
            this.tableName = table;
            let menus = menu.list();
            this.menuList = menus;
            this.menuList.forEach((item,key) => {
                if(this.role==item.roleName) {
                    item.frontMenu.forEach((item2,key2) => {
                        if(item2.child[0].buttons.indexOf("查看")>-1) {
                            this.swiperMenuList.push(item2);
                        }
                    })
                }
            })
        },
		async onShow() {
            let res;
			// 轮播图
			let swiperList = []
			res = await this.$api.page('config', {
				page: 1,
				limit: 5
			});
			for (let item of res.data.list) {
				if (item.name.indexOf('picture') >= 0 && item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						img: item.value,
                        title: item.name
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}
            this.getAboutUs();
            this.getSystemIntroduction();
			// 公告信息
			res = await this.$api.list('news', {
				page: 1,
				limit: 6
			});
			this.news = res.data.list


			res = await this.$api.list('tushuguan', {
				page: 1,

				limit: 4
			});
			this.hometushuguanlist = res.data.list
		},

		methods: {

			//轮播图跳转
			onSwiperTap(e) {

			},
            async getAboutUs() {
                let res = await this.$api.info('aboutus', 1)
                this.aboutUsDetail = res.data;
            },
            async getSystemIntroduction() {
                let res = await this.$api.info('systemintro', 1)
                this.systemIntroductionDetail = res.data;
            },
			// 新闻详情
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			// 推荐列表点击详情
			onDetailTap(tableName, id) {
				this.$utils.jump(`../${tableName}/detail?id=${id}`)
			},
			onPageTap(tableName){

				uni.navigateTo({
					url: `../${tableName}/list`,
					fail: function(){
						uni.switchTab({
							url: `../${tableName}/list`
						});
					}
				});
				// this.$utils.jump(`../${tableName}/list`)
			},
            onPageTap2(url) {
                uni.setStorageSync("useridTag",0);
                uni.navigateTo({
                    url: url,
                    fail: function() {
                        uni.switchTab({
                            url: url
                        });
                    }
                });
            }
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
