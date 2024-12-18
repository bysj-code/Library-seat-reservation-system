<template>
<view class="content">
	<view class="box" :style='{"minHeight":"100vh","width":"100%","padding":"100rpx","backgroundSize":"100% 100%","backgroundImage":"url(http://codegen.caihongy.cn/20221107/5de367739bac41f786f0f48471fd97e5.jpg)","height":"100%"}'>
		<view :style='{"padding":"8%","boxShadow":"0px 0px 12rpx #ccc","margin":"160rpx 0","borderRadius":"32rpx","background":"#fffcfc","display":"block","width":"100%","height":"auto"}'>
			<image :style='{"border":"2rpx solid #eee","padding":"12rpx","margin":"0 auto 24rpx auto","borderRadius":"50%","objectFit":"cover","display":"block","width":"160rpx","height":"160rpx"}' src="http://codegen.caihongy.cn/20221107/6f01b7d8019c4a2897302330e1ce0ae5.png" mode="aspectFill"></image>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","borderColor":"#b8b6b6","borderStyle":"solid","borderWidth":"0 0 2rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","background":"none","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.zhanghao"  type="text"  class="uni-input" name="" placeholder="账号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","borderColor":"#b8b6b6","borderStyle":"solid","borderWidth":"0 0 2rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","background":"none","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","borderColor":"#b8b6b6","borderStyle":"solid","borderWidth":"0 0 2rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","background":"none","width":"100%","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","borderColor":"#b8b6b6","borderStyle":"solid","borderWidth":"0 0 2rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","background":"none","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.xingming"  type="text"  class="uni-input" name="" placeholder="姓名" />
			</view>
			<picker :style='{"width":"100%","margin":"0 auto","height":"auto"}' v-if="tableName=='yonghu'"  @change="yonghuxingbieChange" :value="yonghuxingbieIndex" :range="yonghuxingbieOptions">
				<view :style='{"padding":"0 0 0 24rpx","borderColor":"#b8b6b6","color":"#888","textAlign":"left","borderWidth":"0 0 2rpx 0","width":"100%","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
			</picker>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","borderColor":"#b8b6b6","borderStyle":"solid","borderWidth":"0 0 2rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","background":"none","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.shoujihaoma"  type="text"  class="uni-input" name="" placeholder="手机号码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","borderColor":"#b8b6b6","borderStyle":"solid","borderWidth":"0 0 2rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","background":"none","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.youxiang"  type="text"  class="uni-input" name="" placeholder="邮箱" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 24rpx 0","borderColor":"#b8b6b6","borderStyle":"solid","borderWidth":"0 0 2rpx 0","height":"auto"}' v-if="tableName=='yonghu'" @tap="yonghutouxiangTap" class="">
                <view>请上传头像</view>
                <image :style='{"width":"160rpx","borderRadius":"16rpx","display":"block","height":"160rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"width":"160rpx","borderRadius":"16rpx","display":"block","height":"160rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<button :style='{"border":"0","padding":"0px","margin":"40rpx 0 24rpx 0","color":"rgb(255, 255, 255)","borderRadius":"40rpx","background":"#4F977E","width":"100%","lineHeight":"80rpx","fontSize":"36rpx","height":"80rpx"}' class="btn-submit" @tap="register" type="primary">注册</button>
		</view>
	</view>
</view>
</template>

<script>
	export default {
		data() {
			return {
                yonghuxingbieOptions: [],
                yonghuxingbieIndex: 0,
				ruleForm: {
                zhanghao: '',
                mima: '',
                xingming: '',
                xingbie: '',
                shoujihaoma: '',
                youxiang: '',
                touxiang: '',
				},
				tableName:""
			}
		},
        computed: {
            baseUrl() {
                return this.$base.url;
            }
        },
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
            this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='yonghu'){
                this.yonghuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yonghuxingbieOptions[0]
			}
			
			this.styleChange()
		},
		methods: {

            // 下拉变化
            yonghuxingbieChange(e) {
                    this.yonghuxingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.yonghuxingbieOptions[this.yonghuxingbieIndex]
            },
            yonghutouxiangTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.touxiang = 'upload/' + res.file;
                    _this.$forceUpdate();
                });
            },
            toggleTab(str) {
                this.$refs[str].show();
            },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.zhanghao) && `yonghu` == this.tableName){
					this.$utils.msg(`账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`yonghu` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if((!this.ruleForm.xingming) && `yonghu` == this.tableName){
					this.$utils.msg(`姓名不能为空`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.shoujihaoma&&(!this.$validate.isMobile(this.ruleForm.shoujihaoma))){
					this.$utils.msg(`手机号码应输入手机格式`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
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
