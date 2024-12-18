
<template>
<view>
<mescroll-uni @init="mescrollInit" :up="upOption" :down="downOption" @down="downCallback" @up="upCallback">
	<view class="content">
		<view class="container" :style='{"width":"100%","padding":"0","position":"relative","background":"#fff","height":"100%"}'>
            <view :style='{"width":"100%","padding":"32rpx 24rpx 24rpx 24rpx","background":"#fff","height":"auto"}' class="detail-content">


				<view class="detail-list-item" :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}'>商品id：</view>
					<view  class="text" :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}'>{{detail.refid}}</view>
				</view>
				<view class="detail-list-item" :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}'>表名：</view>
					<view  class="text" :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}'>{{detail.tablename}}</view>
				</view>
				<view class="detail-list-item" :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}'>名称：</view>
					<view  class="text" :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}'>{{detail.name}}</view>
				</view>
				<view class="detail-list-item" :style='{"margin":"0 0 24rpx 0","borderColor":"#ccc","borderWidth":"0 0 2rpx 0","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
      		        <image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' v-if="detail.picture" :src="baseUrl+detail.picture"></image>
				</view>
				<view class="detail-list-item" :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}'>类型(1:收藏,21:赞,22:踩,31:竞拍参与,41:关注)：</view>
					<view  class="text" :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}'>{{detail.type}}</view>
				</view>
				<view class="detail-list-item" :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}'>推荐类型：</view>
					<view  class="text" :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}'>{{detail.inteltype}}</view>
				</view>
				<view class="detail-list-item" :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","borderRadius":"40rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"left","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"32rpx","fontWeight":"bold"}'>备注：</view>
					<view  class="text" :style='{"width":"100%","padding":"0px","margin":"0px","lineHeight":"1.5","fontSize":"28rpx","color":"#50605d"}'>{{detail.remark}}</view>
				</view>








				<view class="bottom-content bg-white tabbar border shop" :style='{"width":"100%","padding":"10rpx 24rpx","flexWrap":"wrap","background":"#f3fcf9","display":"flex","height":"auto"}'>

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
				uni.setStorageSync('paytable','storeup');
				uni.setStorageSync('payObject',this.detail);
				this.$utils.jump('../pay-confirm/pay-confirm?type=1')
			},
            onDetailTap(item) {
                uni.setStorageSync("useridTag",this.userid);
                this.$utils.jump(`./detail?id=${item.id}&userid=`+this.userid)
            },
			// 跨表
			onAcrossTap(tableName,crossOptAudit,statusColumnName,tips,statusColumnValue){
				uni.setStorageSync('crossTable','storeup');
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
				let res = await this.$api.info('storeup', this.id);
				this.detail = res.data;
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
				this.$utils.jump(`../discussstoreup/add-or-update?refid=${this.id}`)
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
