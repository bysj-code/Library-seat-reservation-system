<template>
	<view class="content">
		<view :style='{"width":"100%","padding":"0 0 160rpx","position":"relative","background":"#fff","height":"100%"}'>
			<view :style='{"padding":"0 24rpx 8rpx","margin":"0 0 32rpx 0","background":"#e4f4ec","display":"flex","width":"100%","position":"relative","height":"300rpx"}' @tap="onPageTap('../user-info/user-info')" class="header" v-bind:class="{'status':isH5Plus}">
				<view :style='{"boxShadow":"2rpx 4rpx 8rpx #ddd","margin":"30rpx auto","alignItems":"center","borderRadius":"400rpx","background":"radial-gradient(circle, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 100%)","display":"flex","width":"100%","height":"80%"}' v-if="tableName=='yonghu'" class="userinfo">
					<image :style='{"padding":"0","boxShadow":"0px 4rpx 2rpx #ddd","margin":"0","borderRadius":"20rpx 0 0 20rpx","objectFit":"cover","width":"30%","height":"100%"}' :src="user.touxiang?baseUrl+user.touxiang:'/static/gen/upload.png'"></image>
					<view :style='{"margin":"0 20rpx","flex":"1","flexDirection":"column","display":"flex","width":"100%","justifyContent":"center","height":"100%"}' class="info">
						<view :style='{"width":"100%","lineHeight":"36rpx","fontSize":"28rpx","color":"#266b51"}'>{{user.zhanghao}}<text v-if="user.vip&& user.vip=='是'">(VIP)</text></view>
					</view>
				</view>
				<view :style='{"alignItems":"center","display":"flex","width":"112rpx","position":"absolute","right":"50rpx","justifyContent":"center","height":"100%"}' class="setting">
					<view :style='{"border":"0","width":"64rpx","lineHeight":"64rpx","fontSize":"64rpx","color":"#000","borderRadius":"0"}' class="cuIcon-settings"></view>
				</view>
			</view>
		
		
			<view :style='{"width":"100%","padding":"0 24rpx 160rpx","flexWrap":"wrap","background":"#fff","display":"flex","height":"auto"}' class="list">

				<block v-for="item in menuList" v-bind:key="item.roleName">
					<block v-if="role==item.roleName" v-bind:key="index" v-for=" (menu,index) in item.backMenu">
						<block v-bind:key="sort" v-for=" (child,sort) in menu.child">
							<view :style='{"borderColor":"#c9f2e4","margin":"0 0 16rpx","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="child.tableName!='yifahuodingdan' && child.tableName!='yituikuandingdan' &&child.tableName!='yiquxiaodingdan' && child.tableName!='weizhifudingdan' && child.tableName!='yizhifudingdan' && child.tableName!='yiwanchengdingdan' && child.tableName!='exampaper' && child.tableName!='examquestion' " @tap="onPageTap('../'+child.tableName+'/list?userid='+user.id)" class="li" hover-class="hover">
								<view v-if="false" :style='{"width":"64rpx","lineHeight":"64rpx","fontSize":"64rpx","color":"rgba(0, 186, 189, 1)"}' :class="child.appFrontIcon"></view>
								<view :style='{"width":"100%","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","flex":"1"}' class="text">{{child.menu}}</view>
								<view v-if="true" :style='{"width":"28rpx","margin":"0 16rpx 0 0","lineHeight":"28rpx","fontSize":"28rpx","color":"#999"}' class="cuIcon-right"></view>
							</view>
						</block>
					</block>
				</block>

				<view @tap="onPageTap('../forum-add-or-update/forum-add-or-update')" :style='{"borderColor":"#c9f2e4","margin":"0 0 16rpx","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="li"
				 hover-class="hover">
					<view v-if="false" :style='{"width":"64rpx","lineHeight":"64rpx","fontSize":"64rpx","color":"rgba(0, 186, 189, 1)"}' class="cuIcon-scan"></view>
					<view class="text" :style='{"width":"100%","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","flex":"1"}'>我要发贴</view>
					<view v-if="true" :style='{"width":"28rpx","margin":"0 16rpx 0 0","lineHeight":"28rpx","fontSize":"28rpx","color":"#999"}' class="cuIcon-right"></view>
				</view>
				<view @tap="onPageTap('../forum-my/forum-my')" :style='{"borderColor":"#c9f2e4","margin":"0 0 16rpx","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="li"
				 hover-class="hover">
					<view v-if="false" :style='{"width":"64rpx","lineHeight":"64rpx","fontSize":"64rpx","color":"rgba(0, 186, 189, 1)"}' class="cuIcon-scan"></view>
					<view class="text" :style='{"width":"100%","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","flex":"1"}'>我的发贴</view>
					<view v-if="true" :style='{"width":"28rpx","margin":"0 16rpx 0 0","lineHeight":"28rpx","fontSize":"28rpx","color":"#999"}' class="cuIcon-right"></view>
				</view>
				<view @tap="onPageTap('../messages/list')" :style='{"borderColor":"#c9f2e4","margin":"0 0 16rpx","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="li" hover-class="hover">
					<view v-if="false" :style='{"width":"64rpx","lineHeight":"64rpx","fontSize":"64rpx","color":"rgba(0, 186, 189, 1)"}' class="cuIcon-message"></view>
					<view class="text" :style='{"width":"100%","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","flex":"1"}'>留言反馈</view>
					<view v-if="true" :style='{"width":"28rpx","margin":"0 16rpx 0 0","lineHeight":"28rpx","fontSize":"28rpx","color":"#999"}' class="cuIcon-right"></view>
				</view>

			</view>
		</view>
	</view>
</template>
<script>
	import menu from '@/utils/menu'
	export default {
		data() {
			return {
				isH5Plus: true,
				user: {},
				tableName:'',
				role: '',
				menuList: [],
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
			};
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
		},
		async onShow(){
            uni.removeStorageSync("useridTag");
			this.role = uni.getStorageSync("role");
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.user = res.data;
			this.tableName = table;
			let menus = menu.list();
			this.menuList = menus;
		},
		methods: {
			onPageTap(url) {
                uni.setStorageSync("useridTag",1);
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
		height: calc(100vh - 94px);
		box-sizing: border-box;
	}
</style>
