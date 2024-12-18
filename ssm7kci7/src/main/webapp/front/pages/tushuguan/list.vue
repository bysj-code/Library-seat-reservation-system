<template>
<mescroll-uni @init="mescrollInit" :up="upOption" :down="downOption" @down="downCallback" @up="upCallback">
	<view class="content">
		<view :style='{"width":"100%","padding":"0","position":"relative","background":"#fff","height":"100%"}'>
			<view class="cu-bar bg-white search" style="width:100%" :style="[{top:CustomBar + 'px'}]">
				<picker v-if="queryList.length>1" mode="selector" :range="queryList" range-key="queryName" :value="queryIndex" @change="queryChange" style="padding-left: 20upx;">
					<view><image style="width: 20upx;height: 33upx;" src="../../static/center/to.png"></image></view>
				</picker>
					<view v-if="queryIndex==0" class="search-form round">
						<text class="cuIcon-search"></text>
						<input v-model="searchForm.mingcheng" type="text" placeholder="名称" ></input>
					</view>
					<view v-if="queryIndex==1" class="search-form round">
						<text class="cuIcon-search"></text>
						<input v-model="searchForm.dizhi" type="text" placeholder="地址" ></input>
					</view>
					<view v-if="queryIndex==2" class="search-form round">
						<text class="cuIcon-search"></text>
						<input v-model="searchForm.guimo" type="text" placeholder="规模" ></input>
					</view>
				<view class="action">
					<button @tap="search" class="cu-btn shadow-blur round">搜索</button>
				</view>
			</view>
			<view :style='{"width":"100%","background":"#fff","height":"auto"}'>

			
			<!-- 样式1 -->
			<view class="uni-product-list" :style='{"padding":"24rpx","margin":"0","flexWrap":"wrap","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
				<view @tap="onDetailTap(product)" class="uni-product" :style='{"border":"2rpx solid #d8f0e7","boxShadow":"0 0px 0px rgba(0,0,0,.3)","margin":"0 0 40rpx","backgroundColor":"#e9f8f1","borderRadius":"16rpx","flexWrap":"wrap","display":"flex","width":"48%","position":"relative","justifyContent":"space-between","height":"auto"}' v-for="(product,index) in list" :key="index">
					<view class="uni-product-title" :style='{"padding":"4rpx 20rpx","whiteSpace":"nowrap","overflow":"hidden","color":"#333","width":"70%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","order":"1"}'>{{product.mingcheng}}</view>
					<view class="uni-product-title" :style='{"padding":"4rpx 20rpx","whiteSpace":"nowrap","overflow":"hidden","color":"#333","width":"70%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","order":"1"}'>{{product.dizhi}}</view>
					<image :style='{"padding":"0","margin":"20rpx","objectFit":"cover","borderRadius":"40rpx","display":"block","width":"calc(100% - 40rpx)","height":"300rpx"}' mode="aspectFill" class="uni-product-image" v-if="preHttp(product.tupian)" :src="product.tupian.split(',')[0]"></image>
					<image :style='{"padding":"0","margin":"20rpx","objectFit":"cover","borderRadius":"40rpx","display":"block","width":"calc(100% - 40rpx)","height":"300rpx"}' mode="aspectFill" class="uni-product-image" v-else :src="product.tupian?baseUrl+product.tupian.split(',')[0]:''"></image>
					<view class="uni-product-title" :style='{"padding":"4rpx 20rpx","whiteSpace":"nowrap","overflow":"hidden","color":"#333","width":"70%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","order":"1"}'>{{product.guimo}}</view>
					<view :style='{"width":"100%","padding":"8rpx 20rpx","margin":"0 0 8rpx","justifyContent":"space-between","display":"flex","height":"auto"}'>
						<view :style='{"display":"flex"}' v-if="(userid && isAuth('tushuguan','修改')) || (!userid && isAuthFront('tushuguan','修改'))" @click.stop="onUpdateTap(product.id)">
							<text :style='{"margin":"0 8rpx 0 0","fontSize":"28rpx","lineHeight":"1","color":"#4F977E","display":"inline-block"}' class="cuIcon-edit"></text>
							<text :style='{"fontSize":"28rpx","lineHeight":"1","color":"#4F977E","display":"inline-block"}'>修改</text>
						</view>
						<view :style='{"display":"flex"}' v-if="(userid && isAuth('tushuguan','删除')) || (!userid && isAuthFront('tushuguan','删除'))" @click.stop="onDeleteTap(product.id)">
							<text :style='{"margin":"0 8rpx 0 0","fontSize":"28rpx","lineHeight":"1","color":"#c30","display":"inline-block"}' class="cuIcon-delete"></text>
							<text :style='{"fontSize":"28rpx","lineHeight":"1","color":"#c30","display":"inline-block"}'>删除</text>
						</view>
					</view>
				</view>
			</view>
			
			
			
			

			</view>
			
			
			
		</view>

		<button :style='{"border":"0","boxShadow":"0 0px 0px rgba(0,0,0,.3)","color":"#666","bottom":"40rpx","right":"128rpx","outline":"none","borderRadius":"100%","background":"#c8e3c3","width":"80rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","height":"80rpx","zIndex":"999"}' v-if="userid && isAuth('tushuguan','新增')" class="add-btn" @click="onAddTap()">新增</button>
		<button :style='{"border":"0","boxShadow":"0 0px 0px rgba(0,0,0,.3)","color":"#666","bottom":"40rpx","right":"128rpx","outline":"none","borderRadius":"100%","background":"#c8e3c3","width":"80rpx","lineHeight":"80rpx","fontSize":"28rpx","position":"absolute","height":"80rpx","zIndex":"999"}' v-if="!userid && isAuthFront('tushuguan','新增')" class="add-btn" @click="onAddTap()">新增</button>
	</view>
</mescroll-uni>
</template>

<script>
	export default {
		data() {
			return {
				btnColor: ['#409eff','#67c23a','#909399','#e6a23c','#f56c6c','#356c6c','#351c6c','#f093a9','#a7c23a','#104eff','#10441f','#a21233','#503319'],
				queryList:[
					{
						queryName:"名称",
					},
					{
						queryName:"地址",
					},
					{
						queryName:"规模",
					},
				],
				queryIndex: 0,
				list: [],
				lists: [],
                userid: '',
				mescroll: null, //mescroll实例对象
				downOption: {
					auto: false //是否在初始化后,自动执行下拉回调callback; 默认true
				},
				upOption: {
					noMoreSize: 5, //如果列表已无数据,可设置列表的总数量要大于半页才显示无更多数据;避免列表数据过少(比如只有一条数据),显示无更多数据会不好看; 默认5
					textNoMore: '~ 没有更多了 ~',
				},
				hasNext: true,
				searchForm:{},
				CustomBar: '0'
			};
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
		async onShow() {
			this.btnColor = this.btnColor.sort(()=> {
                                return (0.5-Math.random());
                        });
			this.hasNext = true
			// 重新加载数据
			if (this.mescroll) this.mescroll.resetUpScroll()
		},
		onLoad(options) {
            if(options.userid) {
                this.userid=options.userid;
            } else {
                this.userid = "";
            }
			this.hasNext = true
			// 重新加载数据
			if (this.mescroll) this.mescroll.resetUpScroll()
		},
		methods: {
            priceChange(price) {
                return Number(price).toFixed(2);
            },
            preHttp(str) {
                return str && str.substr(0,4)=='http';
            },
			//查询条件切换
			queryChange(e) {
				this.queryIndex=e.detail.value;
				this.searchForm.mingcheng="";
				this.searchForm.dizhi="";
				this.searchForm.guimo="";
			},
			//类别搜索
			// mescroll组件初始化的回调,可获取到mescroll对象
			mescrollInit(mescroll) {
				this.mescroll = mescroll;
			},
			/*下拉刷新的回调 */
			downCallback(mescroll) {
				this.hasNext = true
				// 重置分页参数页数为1
				mescroll.resetUpScroll()
			},
			/*上拉加载的回调: mescroll携带page的参数, 其中num:当前页 从1开始, size:每页数据条数,默认10 */
			async upCallback(mescroll) {
				let params = {
					page: mescroll.num,
					limit: mescroll.size
				}


				if(this.searchForm.mingcheng){
					params['mingcheng'] = '%' + this.searchForm.mingcheng + '%'
				}
				if(this.searchForm.dizhi){
					params['dizhi'] = '%' + this.searchForm.dizhi + '%'
				}
				if(this.searchForm.guimo){
					params['guimo'] = '%' + this.searchForm.guimo + '%'
				}



                let res = {}
                if(this.userid) {
                    res = await this.$api.page(`tushuguan`, params);
                } else {
                    res = await this.$api.list(`tushuguan`, params);
                }
				// 如果是第一页数据置空
				if (mescroll.num == 1) this.list = [];
				this.list = this.list.concat(res.data.list);
				let length = Math.ceil(this.list.length/6)
				let arr = [];
				for (let i = 0; i<length; i++){
					arr[i] = this.list.slice(i*6, (i+1)*6)
				}
				this.lists = arr
				if (res.data.list.length == 0) this.hasNext = false;
				mescroll.endSuccess(mescroll.size, this.hasNext);
			},
			// 详情
			onDetailTap(item) {
                uni.setStorageSync("useridTag",this.userid);
				this.$utils.jump(`./detail?id=${item.id}&userid=`+this.userid)
			},
			// 修改
			onUpdateTap(id){
                uni.setStorageSync("useridTag",this.userid);
				this.$utils.jump(`./add-or-update?id=${id}`)
			},
			// 添加
			onAddTap(){
                uni.setStorageSync("useridTag",this.userid);
				this.$utils.jump(`./add-or-update`)
			},
			onDeleteTap(id){
				var _this = this;
				uni.showModal({
					title: '提示',
					content: '是否确认删除',
					success: async function(res) {
						if (res.confirm) {
							await _this.$api.del('tushuguan', JSON.stringify([id]));
							_this.hasNext = true
							// 重置分页参数页数为1
							_this.mescroll.resetUpScroll()
						}
					}
				});
			},
			// 搜索
			async search(){
				this.mescroll.num = 1
				let searchForm = {
					page: this.mescroll.num,
					limit: this.mescroll.size
				}
				if(this.searchForm.mingcheng){
					searchForm['mingcheng'] = '%' + this.searchForm.mingcheng + '%'
				}
				if(this.searchForm.dizhi){
					searchForm['dizhi'] = '%' + this.searchForm.dizhi + '%'
				}
				if(this.searchForm.guimo){
					searchForm['guimo'] = '%' + this.searchForm.guimo + '%'
				}
                let res = {};
                if(this.userid) {
                    res = await this.$api.page(`tushuguan`, searchForm);
                } else {
                    res = await this.$api.list(`tushuguan`, searchForm);
                }
				// 如果是第一页数据置空
				if (this.mescroll.num == 1) this.list = [];
				this.list = this.list.concat(res.data.list);
				let length = Math.ceil(this.list.length/6)
				let arr = [];
				for (let i = 0; i<length; i++){
					arr[i] = this.list.slice(i*6, (i+1)*6)
				}
				this.lists = arr
				if (res.data.list.length == 0) this.hasNext = false;
				this.mescroll.endSuccess(this.mescroll.size, this.hasNext);
			}
		}
	};
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
	
	.category-one .tab {
		cursor: pointer;
		padding: 0 20rpx;
		color: #266b51;
		display: inline-block;
		width: auto;
		font-size: 28rpx;
		line-height: 80rpx;
	}
	
	.category-one .tab.active {
		cursor: pointer;
		padding: 0 20rpx;
		box-shadow: 0 8rpx 0 #c8e3c3;
		color: #000;
		background: 0;
		display: inline-block;
		width: auto;
		font-size: 28rpx;
		border-color: #4f977e;
		border-width: 0 0 4rpx 0;
		line-height: 80rpx;
		border-style: solid;
	}
	
	.category-two .tab {
		cursor: pointer;
		padding: 0;
		color: #fff;
		background: blue;
		display: inline-block;
		width: 100%;
		font-size: 28rpx;
		line-height: 80rpx;
		text-align: center;
	}
	
	.category-two .tab.active {
		cursor: pointer;
		padding: 0;
		color: #fff;
		background: #000;
		display: inline-block;
		width: 100%;
		font-size: 28rpx;
		line-height: 80rpx;
		text-align: center;
	}
	
	.category-three .tab {
		cursor: pointer;
		padding: 0;
		color: #fff;
		background: burlywood;
		display: inline-block;
		width: 100%;
		font-size: 28rpx;
		line-height: 80rpx;
		text-align: center;
	}
	
	.category-three .tab.active {
		cursor: pointer;
		padding: 0;
		color: #fff;
		background: #000;
		display: inline-block;
		width: 100%;
		font-size: 28rpx;
		line-height: 80rpx;
		text-align: center;
	}
</style>
