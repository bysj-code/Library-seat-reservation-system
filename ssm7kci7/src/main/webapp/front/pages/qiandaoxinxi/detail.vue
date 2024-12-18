
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

				<view :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="detail-list-item title">
					<view :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}' class="lable">名称：</view>
					<view :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}' class="text">{{detail.mingcheng}}</view>
				</view>
				<view :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="detail-list-item title">
					<view :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}' class="lable">地址：</view>
					<view :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}' class="text">{{detail.dizhi}}</view>
				</view>
				<view :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="detail-list-item title">
					<view :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}' class="lable">座位编号：</view>
					<view :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}' class="text">{{detail.zuoweibianhao}}</view>
				</view>

				<view class="detail-list-item" :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}'>座位位置：</view>
					<view  class="text" :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}'>{{detail.zuoweiweizhi}}</view>
				</view>
				<view class="detail-list-item" :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}'>账号：</view>
					<view  class="text" :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}'>{{detail.zhanghao}}</view>
				</view>
				<view class="detail-list-item" :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}'>姓名：</view>
					<view  class="text" :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}'>{{detail.xingming}}</view>
				</view>
				<view class="detail-list-item" :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}'>手机号码：</view>
					<view  class="text" :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}'>{{detail.shoujihaoma}}</view>
				</view>
				<view class="detail-list-item" :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}'>预约备注：</view>
					<view  class="text" :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}'>{{detail.yuyuebeizhu}}</view>
				</view>
				<view class="detail-list-item" :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}'>预约时间：</view>
					<view  class="text" :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}'>{{detail.yuyueshijian}}</view>
				</view>
				<view class="detail-list-item" :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}'>签到备注：</view>
					<view  class="text" :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}'>{{detail.qiandaobeizhu}}</view>
				</view>
				<view class="detail-list-item" :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}'>签到时间：</view>
					<view  class="text" :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}'>{{detail.qiandaoshijian}}</view>
				</view>








				<view class="bottom-content bg-white tabbar border shop" :style='{"width":"100%","padding":"10rpx 24rpx","flexWrap":"wrap","background":"#f3fcf9","display":"flex","height":"auto"}'>

					<button :style='{"border":"0","padding":"0 20rpx","margin":"0","color":"rgb(255, 255, 255)","background":"rgb(255, 170, 51)","width":"auto","fontSize":"28rpx","height":"80rpx"}' v-if="userid&&isAuth('qiandaoxinxi','签退')" @tap="onAcrossTap('qiantuixinxi','','[1]','已签退')" class="cu-btn bg-brown round shadow-blur" >签退</button>
					<button :style='{"border":"0","padding":"0 20rpx","margin":"0","color":"rgb(255, 255, 255)","background":"rgb(255, 170, 51)","width":"auto","fontSize":"28rpx","height":"80rpx"}' v-if="!userid&&isAuthFront('qiandaoxinxi','签退')" @tap="onAcrossTap('qiantuixinxi','','[1]','已签退')" class="cu-btn bg-brown round shadow-blur" >签退</button>
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
		},
		destroyed: function() {
			//window.clearInterval(this.inter);
		},
		methods: {
			// 支付
			onPayTap(){
				uni.setStorageSync('paytable','qiandaoxinxi');
				uni.setStorageSync('payObject',this.detail);
				this.$utils.jump('../pay-confirm/pay-confirm?type=1')
			},
            onDetailTap(item) {
                uni.setStorageSync("useridTag",this.userid);
                this.$utils.jump(`./detail?id=${item.id}&userid=`+this.userid)
            },
			// 跨表
			onAcrossTap(tableName,crossOptAudit,statusColumnName,tips,statusColumnValue){
				uni.setStorageSync('crossTable','qiandaoxinxi');
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
				let res = await this.$api.info('qiandaoxinxi', this.id);
				this.detail = res.data;
				// 轮播图片
				this.swiperList = this.detail.zuoweitupian ? this.detail.zuoweitupian.split(",") : [];
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
				this.$utils.jump(`../discussqiandaoxinxi/add-or-update?refid=${this.id}`)
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
