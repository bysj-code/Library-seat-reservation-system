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
			<view :style='{"padding":"0px 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"center】"}' class="title">账号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#50605d","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.zhanghao" v-model="ruleForm.zhanghao" placeholder="账号"></input>
			</view>
			<view :style='{"padding":"0px 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"center】"}' class="title">姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#50605d","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.xingming" v-model="ruleForm.xingming" placeholder="姓名"></input>
			</view>
			<view :style='{"padding":"0px 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"center】"}' class="title">手机号码</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#50605d","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shoujihaoma" v-model="ruleForm.shoujihaoma" placeholder="手机号码"></input>
			</view>
			<view :style='{"padding":"0px 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"center】"}' class="title">预约备注</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#50605d","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yuyuebeizhu" v-model="ruleForm.yuyuebeizhu" placeholder="预约备注"></input>
			</view>
			<view :style='{"padding":"0px 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"center】"}' class="title">预约时间</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#50605d","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yuyueshijian" v-model="ruleForm.yuyueshijian" placeholder="预约时间"></input>
			</view>
			<view :style='{"padding":"0px 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"center】"}' class="title">签到备注</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#50605d","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.qiandaobeizhu" v-model="ruleForm.qiandaobeizhu" placeholder="签到备注"></input>
			</view>
			<view :style='{"padding":"0px 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"center】"}' class="title">签到时间</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#50605d","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.qiandaoshijian" v-model="ruleForm.qiandaoshijian" placeholder="签到时间"></input>
			</view>
			<view :style='{"padding":"0px 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"center】"}' class="title">签退备注</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#50605d","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.qiantuibeizhu" v-model="ruleForm.qiantuibeizhu" placeholder="签退备注"></input>
			</view>
			<view :style='{"padding":"0px 20rpx","margin":"0 0 24rpx 0","borderColor":"#c9f2e4","alignItems":"center","borderRadius":"40rpx","borderWidth":"2rpx","background":"#f3fcf9","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"center】"}' class="title">签退时间</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#50605d","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.qiantuishijian" placeholder="签退时间" @tap="toggleTab('qiantuishijian')"></input>
			</view>
			
			<!-- 否 -->
 

			
			
			<view :style='{"width":"100%","justifyContent":"space-between","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0px","margin":"0","color":"rgb(255, 255, 255)","borderRadius":"40rpx","background":"#4F977E","width":"48%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="qiantuishijianConfirm" ref="qiantuishijian" themeColor="#333333"></w-picker>
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
				zhanghao: '',
				xingming: '',
				shoujihaoma: '',
				yuyuebeizhu: '',
				yuyueshijian: '',
				qiandaobeizhu: '',
				qiandaoshijian: '',
				qiantuibeizhu: '',
				qiantuishijian: '',
				crossuserid: '',
				crossrefid: '',
				userid: '',
				},
				// 登陆用户信息
				user: {},
                ro:{
                   mingcheng : false,
                   dizhi : false,
                   zuoweibianhao : false,
                   zuoweitupian : false,
                   zuoweiweizhi : false,
                   zhanghao : false,
                   xingming : false,
                   shoujihaoma : false,
                   yuyuebeizhu : false,
                   yuyueshijian : false,
                   qiandaobeizhu : false,
                   qiandaoshijian : false,
                   qiantuibeizhu : false,
                   qiantuishijian : false,
                   crossuserid : false,
                   crossrefid : false,
                   userid : false,
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
            this.ruleForm.qiantuishijian = this.$utils.getCurDateTime();

			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取



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
				res = await this.$api.info(`qiantuixinxi`, this.ruleForm.id);
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
					if(o=='zhanghao'){
					this.ruleForm.zhanghao = obj[o];
					this.ro.zhanghao = true;
					continue;
					}
					if(o=='xingming'){
					this.ruleForm.xingming = obj[o];
					this.ro.xingming = true;
					continue;
					}
					if(o=='shoujihaoma'){
					this.ruleForm.shoujihaoma = obj[o];
					this.ro.shoujihaoma = true;
					continue;
					}
					if(o=='yuyuebeizhu'){
					this.ruleForm.yuyuebeizhu = obj[o];
					this.ro.yuyuebeizhu = true;
					continue;
					}
					if(o=='yuyueshijian'){
					this.ruleForm.yuyueshijian = obj[o];
					this.ro.yuyueshijian = true;
					continue;
					}
					if(o=='qiandaobeizhu'){
					this.ruleForm.qiandaobeizhu = obj[o];
					this.ro.qiandaobeizhu = true;
					continue;
					}
					if(o=='qiandaoshijian'){
					this.ruleForm.qiandaoshijian = obj[o];
					this.ro.qiandaoshijian = true;
					continue;
					}
					if(o=='qiantuibeizhu'){
					this.ruleForm.qiantuibeizhu = obj[o];
					this.ro.qiantuibeizhu = true;
					continue;
					}
					if(o=='qiantuishijian'){
					this.ruleForm.qiantuishijian = obj[o];
					this.ro.qiantuishijian = true;
					continue;
					}
					if(o=='crossuserid'){
					this.ruleForm.crossuserid = obj[o];
					this.ro.crossuserid = true;
					continue;
					}
					if(o=='crossrefid'){
					this.ruleForm.crossrefid = obj[o];
					this.ro.crossrefid = true;
					continue;
					}
					if(o=='userid'){
					this.ruleForm.userid = obj[o];
					this.ro.userid = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数


			// 日长控件选择日期时间
			qiantuishijianConfirm(val) {
				console.log(val)
				this.ruleForm.qiantuishijian = val.result;
				this.$forceUpdate();
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
					let res = await this.$api.list(`qiantuixinxi`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`qiantuixinxi`, this.ruleForm);
						}else{
							await this.$api.add(`qiantuixinxi`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`qiantuixinxi`, this.ruleForm);
					}else{
						await this.$api.add(`qiantuixinxi`, this.ruleForm);
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
