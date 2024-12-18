<template>
<view class="content">
	<view :style='{"width":"100%","padding":"0","position":"relative","background":"#fff","height":"100%"}'>
		<form :style='{"width":"calc(100% - 40rpx)","padding":"0","margin":"32rpx 20rpx","background":"none","display":"block","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"0px 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"center】"}' class="title">名称</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#50605d","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.mingcheng" v-model="ruleForm.mingcheng" placeholder="名称"></input>
			</view>
			<view :style='{"padding":"0px 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"center】"}' class="title">地址</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#50605d","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.dizhi" v-model="ruleForm.dizhi" placeholder="地址"></input>
			</view>
			<view :style='{"padding":"0px 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"center】"}' class="title">座位编号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#50605d","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.zuoweibianhao" v-model="ruleForm.zuoweibianhao" placeholder="座位编号"></input>
			</view>
			<view :style='{"padding":"0px 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="" @tap="zuoweitupianTap">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"center】"}' class="title">座位图片</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.zuoweitupian" :src="baseUrl+ruleForm.zuoweitupian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"0px 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"center】"}' class="title">座位位置</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#50605d","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.zuoweiweizhi" v-model="ruleForm.zuoweiweizhi" placeholder="座位位置"></input>
			</view>
			<view :style='{"padding":"0px 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"center】"}' class="title">状态</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' @change="zhuangtaiChange" :value="zhuangtaiIndex"  :range="zhuangtaiOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#50605d"}' class="uni-input">{{ruleForm.zhuangtai?ruleForm.zhuangtai:"请选择状态"}}</view>
				</picker>
			</view>
			
			<!-- 否 -->
 

			
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#ccc","borderWidth":"0 0 0px 0","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","fontWeight":"500"}' class="title">座位详情</view>
                <xia-editor ref="editor" :style='{"minHeight":"240rpx","border":"2rpx solid #c9f2e4","padding":"24rpx","borderRadius":"40rpx","color":"#50605d","background":"#f3fcf9","width":"100%","height":"auto"}' v-model="ruleForm.zuoweixiangqing" placeholder="座位详情" @editorChange="zuoweixiangqingChange"></xia-editor>
			</view>
			
			<view :style='{"width":"100%","justifyContent":"space-between","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0px","margin":"0","color":"rgb(255, 255, 255)","borderRadius":"40rpx","background":"#4F977E","width":"48%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

	</view>
</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";
    import xiaEditor from '@/components/xia-editor/xia-editor';
	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				mingcheng: '',
				dizhi: '',
				zuoweibianhao: '',
				zuoweitupian: '',
				zuoweiweizhi: '',
			        zhuangtai: '闲置',
				zuoweixiangqing: '',
				},
				zhuangtaiOptions: [],
				zhuangtaiIndex: 0,
				// 登陆用户信息
				user: {},
                ro:{
                   mingcheng : false,
                   dizhi : false,
                   zuoweibianhao : false,
                   zuoweitupian : false,
                   zuoweiweizhi : false,
                   zhuangtai : false,
                   zuoweixiangqing : false,
                },
			}
		},
		components: {
			wPicker,
            xiaEditor
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},



		},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取


			// 自定义下拉框值
			this.zhuangtaiOptions = "使用中,闲置".split(',')

			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`zuoweixinxi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='mingcheng'){
					this.ruleForm.mingcheng = obj[o];
					this.ro.mingcheng = true;
					continue;
					}
					if(o=='dizhi'){
					this.ruleForm.dizhi = obj[o];
					this.ro.dizhi = true;
					continue;
					}
					if(o=='zuoweibianhao'){
					this.ruleForm.zuoweibianhao = obj[o];
					this.ro.zuoweibianhao = true;
					continue;
					}
					if(o=='zuoweitupian'){
					this.ruleForm.zuoweitupian = obj[o].split(",")[0];
					this.ro.zuoweitupian = true;
					continue;
					}
					if(o=='zuoweiweizhi'){
					this.ruleForm.zuoweiweizhi = obj[o];
					this.ro.zuoweiweizhi = true;
					continue;
					}
					if(o=='zhuangtai'){
					this.ruleForm.zhuangtai = obj[o];
					this.ro.zhuangtai = true;
					continue;
					}
					if(o=='zuoweixiangqing'){
					this.ruleForm.zuoweixiangqing = obj[o];
					this.ro.zuoweixiangqing = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
            zuoweixiangqingChange(e) {
                this.ruleForm.zuoweixiangqing = e
            },
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数



			// 下拉变化
			zhuangtaiChange(e) {
				this.zhuangtaiIndex = e.target.value
				this.ruleForm.zhuangtai = this.zhuangtaiOptions[this.zhuangtaiIndex]
			},

			zuoweitupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.zuoweitupian = 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {















//跨表计算判断
				var obj;
				if((!this.ruleForm.zuoweibianhao)){
					this.$utils.msg(`座位编号不能为空`);
					return
				}
				if((!this.ruleForm.zuoweiweizhi)){
					this.$utils.msg(`座位位置不能为空`);
					return
				}
				if((!this.ruleForm.zhuangtai)){
					this.$utils.msg(`状态不能为空`);
					return
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(this.cross){
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
                        if(!obj) {
						    obj = uni.getStorageSync('crossObj');
                        }
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('userid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`zuoweixinxi`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`zuoweixinxi`, this.ruleForm);
						}else{
							await this.$api.add(`zuoweixinxi`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`zuoweixinxi`, this.ruleForm);
					}else{
						await this.$api.add(`zuoweixinxi`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
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
