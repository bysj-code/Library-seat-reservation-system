
<template>
<view>
<mescroll-uni @init="mescrollInit" :up="upOption" :down="downOption" @down="downCallback" @up="upCallback">
	<view class="content">
		<view class="container" :style='{"width":"100%","padding":"0","position":"relative","background":"#fff","height":"100%"}'>
						<swiper :style='{"width":"100%","background":"#fff","height":"360rpx"}' class="swiper" :indicator-dots='false' :autoplay='true' :circular='false' indicator-active-color='#000000' indicator-color='rgba(0, 0, 0, .3)' :duration='500' :interval='5000' :vertical='false'>
				<swiper-item :style='{"width":"100%","backgroundSize":"100% 100%","backgroundImage":"url(http://codegen.caihongy.cn/20221031/e8e574a8846342f9968f75b31741fdc2.png)","height":"360rpx"}' v-for="(swiper,index) in swiperList" :key="index">
					<image :style='{"border":"4rpx solid #34ab82","margin":"32rpx auto","objectFit":"cover","borderRadius":"16rpx","display":"block","width":"90%","height":"260rpx"}' mode="aspectFill" v-if="swiper.substring(0,4)=='http'" :src="swiper"></image>
					<image :style='{"border":"4rpx solid #34ab82","margin":"32rpx auto","objectFit":"cover","borderRadius":"16rpx","display":"block","width":"90%","height":"260rpx"}' mode="aspectFill" v-else :src="baseUrl+swiper"></image>
				</swiper-item>
			</swiper>
									            <view :style='{"width":"100%","padding":"32rpx 24rpx 24rpx 24rpx","background":"#fff","height":"auto"}' class="detail-content">
				<view :style='{"margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","justifyContent":"space-between","height":"auto"}' class="detail-list-item price priceFavor">
					<view :style='{"margin":"0 16rpx 0 0","lineHeight":"80rpx","fontSize":"48rpx","color":"#4f977e","display":"block"}' v-if="storeupFlag==1" class="cuIcon-favorfill" @click="shoucang"></view>
					<view :style='{"margin":"0 16rpx 0 0","lineHeight":"80rpx","fontSize":"48rpx","color":"#4f977e","display":"block"}' v-if="storeupFlag==0" class="cuIcon-favor" @click="shoucang"></view>
				</view>

				<view :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="detail-list-item title">
					<view :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}' class="lable">名称：</view>
					<view :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}' class="text">{{detail.mingcheng}}</view>
				</view>
				<view :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="detail-list-item title">
					<view :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}' class="lable">地址：</view>
					<view :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}' class="text">{{detail.dizhi}}</view>
				</view>
				<view :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="detail-list-item title">
					<view :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}' class="lable">规模：</view>
					<view :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}' class="text">{{detail.guimo}}</view>
				</view>

				<view class="detail-list-item" :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}'>容纳人数：</view>
					<view  class="text" :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}'>{{detail.rongnarenshu}}</view>
				</view>
				<view class="detail-list-item" :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}'>成立日期：</view>
					<view  class="text" :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}'>{{detail.chengliriqi}}</view>
				</view>



				<view class="detail-list-item" :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}'>简介</view>
					<view class="text" :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}'>{{detail.jianjie}}</view>
				</view>




				<view class="time-content" :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}'>
					<view class="comoment-header" :style='{"border":"2rpx solid #c9f2e4","boxShadow":"rgb(0 0 0 / 30%) 0px 0px 0px","borderRadius":"16rpx","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
						<view :style='{"padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333"}'>评论</view>
						<view :style='{"padding":"0 20rpx","borderColor":"#c9f2e4","borderRadius":"0 16rpx 16rpx 0","background":"#f3fcf8","borderWidth":"0 0 0 2rpx","display":"flex","borderStyle":"solid"}' @click="onCommentTap" class="btn-comment-content" style="display: flex;align-items: center;">
							<view :style='{"margin":"0 8rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333"}' class="cuIcon-add"></view>
							<view :style='{"color":"#333","lineHeight":"80rpx","fontSize":"28rpx"}'>添加评论</view>
						</view>
					</view>
				
					<view :style='{"border":"2rpx solid #c9f2e4","boxShadow":"0 0px 0px rgb(0 0 0 / 30%)","padding":"24rpx","margin":"24rpx 0 0 0","borderRadius":"16rpx","background":"#f3fcf9","width":"100%","height":"auto"}' v-for="(item,index) in commentList" v-bind:key="index" class="cu-item comment-item">
						<view :style='{"width":"100%","display":"flex","height":"auto"}'>
							<image :style='{"width":"60rpx","margin":"0 8rpx 0 0","borderRadius":"100%","display":"block","height":"60rpx"}' v-if="item.avatarurl" mode="aspectFill" :src="baseUrl+item.avatarurl"></image>
							<view :style='{"color":"#333","lineHeight":"60rpx","fontSize":"28rpx"}' class="text-grey">{{item.nickname}}</view>
						</view>
						<view :style='{"margin":"8rpx 0","lineHeight":"1.5","fontSize":"28rpx","color":"#666"}' class="text-gray text-content text-df">
							{{item.content}}
						</view>
						<view :style='{"color":"#999","lineHeight":"24rpx","fontSize":"24rpx"}' class="margin-top-sm text-gray text-df">{{item.addtime}}</view>
						<view v-if="item.reply" :style='{"margin":"8rpx 0","lineHeight":"1.5","fontSize":"28rpx","color":"#666"}' class="text-gray text-content text-df">
							回复:{{item.reply}}
						</view>
					</view>
				</view>

				<view class="bottom-content bg-white tabbar border shop" :style='{"width":"100%","padding":"10rpx 24rpx","flexWrap":"wrap","background":"#f3fcf9","display":"flex","height":"auto"}'>

					<button :style='{"border":"0","padding":"0 20rpx","margin":"0","color":"rgb(255, 255, 255)","background":"rgb(255, 170, 51)","width":"auto","fontSize":"28rpx","height":"80rpx"}' v-if="userid&&isAuth('tushuguan','座位')" @tap="onAcrossTap('zuoweixinxi','','','')" class="cu-btn bg-brown round shadow-blur" >座位</button>
					<button :style='{"border":"0","padding":"0 20rpx","margin":"0","color":"rgb(255, 255, 255)","background":"rgb(255, 170, 51)","width":"auto","fontSize":"28rpx","height":"80rpx"}' v-if="!userid&&isAuthFront('tushuguan','座位')" @tap="onAcrossTap('zuoweixinxi','','','')" class="cu-btn bg-brown round shadow-blur" >座位</button>
				</view>
			</view>

		</view>
	</view>
</mescroll-uni>
</view>
</template>

<script>
	export default {
		data() {
			return {
				btnColor: ['#409eff','#67c23a','#909399','#e6a23c','#f56c6c','#356c6c','#351c6c','#f093a9','#a7c23a','#104eff','#10441f','#a21233','#503319'],
				id: '',
                userid: '',
				detail: {},
				swiperList: [],
				commentList: [],
				mescroll: null, //mescroll实例对象
				downOption: {
					auto: false //是否在初始化后,自动执行下拉回调callback; 默认true
				},
				upOption: {
					noMoreSize: 3, //如果列表已无数据,可设置列表的总数量要大于半页才显示无更多数据;避免列表数据过少(比如只有一条数据),显示无更多数据会不好看; 默认5
					textNoMore: '~ 没有更多了 ~',
				},
				hasNext: true,
				user: {},
				storeupFlag: 0,
				count: 0,
				timer: null
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		async onLoad(options) {
			this.id = options.id;
            if(options.userid) {
                this.userid = options.userid;
            }
		},
		async onShow(options) {
			// 渲染数据
			this.init();
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			this.btnColor = this.btnColor.sort(()=> {
				return (0.5-Math.random());
			});
			this.getStoreup();
			let cleanType = uni.getStorageSync('discusstushuguanCleanType')
			if(cleanType){
				uni.removeStorageSync('discusstushuguanCleanType')
				this.mescroll.num = 1
				this.upCallback(this.mescroll)
			}
		},
		destroyed: function() {
			//window.clearInterval(this.inter);
		},
		methods: {
			// 支付
			onPayTap(){
				uni.setStorageSync('paytable','tushuguan');
				uni.setStorageSync('payObject',this.detail);
				this.$utils.jump('../pay-confirm/pay-confirm?type=1')
			},
            onDetailTap(item) {
                uni.setStorageSync("useridTag",this.userid);
                this.$utils.jump(`./detail?id=${item.id}&userid=`+this.userid)
            },
			// 收藏
			async getStoreup() {
				let params = {
					page: 1,
					limit: 1,
					refid : this.id,
					tablename : 'tushuguan',
					userid: this.user.id,
					type: 1,
				}
				let res = await this.$api.list(`storeup`, params);
				this.storeupFlag = res.data.list.length;
			},
			async shoucang(){
				let _this = this;
				let params = {
					page: 1,
					limit: 1,
					refid : _this.detail.id,
					tablename : 'tushuguan',
					userid: _this.user.id,
					type: 1,
				}
				let res = await _this.$api.list(`storeup`, params);
				if (res.data.list.length == 1) {
					let storeupId = res.data.list[0].id;
					uni.showModal({
						title: '提示',
						content: '是否取消',
						success: async function(res) {
							if (res.confirm) {
								await _this.$api.del('storeup', JSON.stringify([storeupId]));
								_this.$utils.msg('取消成功');
								_this.getStoreup();
							}
						}
					});
					return;
				}
				uni.showModal({
					title: '提示',
					content: '是否收藏',
					success: async function(res) {
						if (res.confirm) {
							await _this.$api.add('storeup', {
								userid: _this.user.id,
								name: _this.detail.mingcheng,
								picture: _this.swiperList[0],
								refid: _this.detail.id,
								tablename: 'tushuguan',
                                type: 1
							});
							_this.$utils.msg('收藏成功');
							_this.getStoreup();
						}
					}
				});
			},
			// 跨表
			onAcrossTap(tableName,crossOptAudit,statusColumnName,tips,statusColumnValue){
				uni.setStorageSync('crossTable','tushuguan');
				uni.setStorageSync(`crossObj`, this.detail);
				uni.setStorageSync(`statusColumnName`, statusColumnName);
				uni.setStorageSync(`statusColumnValue`, statusColumnValue);
				uni.setStorageSync(`tips`, tips);
				if(statusColumnName!=''&&!statusColumnName.startsWith("[")) {
					var obj = uni.getStorageSync('crossObj');
					for (var o in obj){
						if(o==statusColumnName && obj[o]==statusColumnValue){
							this.$utils.msg(tips);
							return
						}
					}
				}
				this.$utils.jump(`../${tableName}/add-or-update?cross=true`);
			},
			// 获取详情
			async init(){
				let res = await this.$api.info('tushuguan', this.id);
				this.detail = res.data;
				// 轮播图片
				this.swiperList = this.detail.tupian ? this.detail.tupian.split(",") : [];
			},

			// mescroll组件初始化的回调,可获取到mescroll对象
			mescrollInit(mescroll) {
				this.mescroll = mescroll;
			},

			/*下拉刷新的回调 */
			downCallback(mescroll) {
				this.hasNext = true
				mescroll.resetUpScroll()
			},

			/*上拉加载的回调: mescroll携带page的参数, 其中num:当前页 从1开始, size:每页数据条数,默认10 */
			async upCallback(mescroll) {
                let res = await this.$api.list('discusstushuguan', {
					page: mescroll.num,
					limit: 10,
					refid: this.id
				});
				// 如果是第一页数据置空
				if (mescroll.num == 1) this.commentList = [];
				this.commentList = this.commentList.concat(res.data.list);
				if (res.data.list.length == 0) this.hasNext = false;
				mescroll.endSuccess(mescroll.size, this.hasNext);

            },



			onChatTap() {
				this.$utils.jump('../chat/chat')
			},
			// 下载
			download(url){
				let _this = this;
				url=_this.$base.url +  url;
				uni.downloadFile({
					url: url,
					success: (res) => {
						if (res.statusCode === 200) {
							_this.$utils.msg('下载成功');
							 window.open(url);
						}
					}
				});
			},
			//
			onCartTabTap() {
				this.$utils.tab('../shop-cart/shop-cart')
			},
			// 添加评论
			async onCommentTap() {
				this.$utils.jump(`../discusstushuguan/add-or-update?refid=${this.id}`)
			},
			onSHTap() {
				this.$refs.popup.open()
			},
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
	
	.seat-list {
		display: flex;
		align-items: center;
		flex-wrap: wrap;
		background: #FFFFFF;
		margin: 20upx;
		border-radius: 20upx;
		padding: 20upx;
		font-size: 30upx;
		.seat-item {
			width: 33.33%;
			display: flex;
			align-items: center;
			flex-direction: column;
			margin-bottom: 20upx;
	
			.seat-icon {
				width: 50upx;
				height: 50upx;
				margin-bottom: 10upx;
			}
		}
	}
	
	audio {
		display: flex;
		flex-direction: column;
	}
	
	.audio /deep/ .uni-audio-default {
		width: inherit;
	}
</style>
