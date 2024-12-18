<template>
<div class="content">
	<div class="text" :style='{"margin":"50px auto","fontSize":"24px","color":"rgb(51, 51, 51)","textAlign":"center","fontWeight":"bold"}'>欢迎使用 {{this.$project.projectName}}</div>
    <div class="cardView">
        <div class="cards" :style='{"margin":"0 0 20px 0","alignItems":"center","justifyContent":"center","display":"flex"}'>
			<div :style='{"boxShadow":"0 1px 6px rgba(0,0,0,.3)","margin":"0 10px","borderRadius":"4px","display":"flex"}' v-if="isAuth('tushuguan','首页总数')">
				<div :style='{"width":"80px","background":"#a29988","height":"80px"}'></div>
				<div :style='{"width":"160px","alignItems":"center","flexDirection":"column","justifyContent":"center","display":"flex"}'>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"20px","color":"#333","fontWeight":"bold","height":"24px"}'>{{tushuguanCount}}</div>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"16px","color":"#666","height":"24px"}'>图书馆总数</div>
				</div>
			</div>
			<div :style='{"boxShadow":"0 1px 6px rgba(0,0,0,.3)","margin":"0 10px","borderRadius":"4px","display":"flex"}' v-if="isAuth('zuoweixinxi','首页总数')">
				<div :style='{"width":"80px","background":"#a29988","height":"80px"}'></div>
				<div :style='{"width":"160px","alignItems":"center","flexDirection":"column","justifyContent":"center","display":"flex"}'>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"20px","color":"#333","fontWeight":"bold","height":"24px"}'>{{zuoweixinxiCount}}</div>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"16px","color":"#666","height":"24px"}'>座位信息总数</div>
				</div>
			</div>
			<div :style='{"boxShadow":"0 1px 6px rgba(0,0,0,.3)","margin":"0 10px","borderRadius":"4px","display":"flex"}' v-if="isAuth('yuyuexuanzuo','首页总数')">
				<div :style='{"width":"80px","background":"#a29988","height":"80px"}'></div>
				<div :style='{"width":"160px","alignItems":"center","flexDirection":"column","justifyContent":"center","display":"flex"}'>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"20px","color":"#333","fontWeight":"bold","height":"24px"}'>{{yuyuexuanzuoCount}}</div>
					<div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"16px","color":"#666","height":"24px"}'>预约选座总数</div>
				</div>
			</div>
        </div>
        <div style="display: flex;align-items: center;width: 100%;margin-bottom: 10px;">
            <el-card style="width: 33.3%;margin: 0 10px;" v-if="isAuth('tushuguan','首页统计')">
                <div id="tushuguanChart1" style="width:100%;height:400px;"></div>
            </el-card>
            <el-card style="width: 33.3%;margin: 0 10px;" v-if="isAuth('zuoweixinxi','首页统计')">
                <div id="zuoweixinxiChart1" style="width:100%;height:400px;"></div>
            </el-card>
            <el-card style="width: 33.3%;margin: 0 10px;" v-if="isAuth('yuyuexuanzuo','首页统计')">
                <div id="yuyuexuanzuoChart1" style="width:100%;height:400px;"></div>
            </el-card>
        </div>
    </div>
</div>
</template>
<script>
//3
import router from '@/router/router-static'
import * as echarts from 'echarts'
export default {
	data() {
		return {
            tushuguanCount: 0,
            zuoweixinxiCount: 0,
            yuyuexuanzuoCount: 0,
		};
	},
  mounted(){
    this.init();
    this.gettushuguanCount();
    this.tushuguanChat1();
    this.getzuoweixinxiCount();
    this.zuoweixinxiChat1();
    this.getyuyuexuanzuoCount();
    this.yuyuexuanzuoChat1();
  },
  methods:{
    init(){
        if(this.$storage.get('Token')){
        this.$http({
            url: `${this.$storage.get('sessionTable')}/session`,
            method: "get"
        }).then(({ data }) => {
            if (data && data.code != 0) {
            router.push({ name: 'login' })
            }
        });
        }else{
            router.push({ name: 'login' })
        }
    },
    gettushuguanCount() {
        this.$http({
            url: `tushuguan/count`,
            method: "get"
        }).then(({
            data
        }) => {
            if (data && data.code == 0) {
                this.tushuguanCount = data.data
            }
        })
    },

    tushuguanChat1() {
      this.$nextTick(()=>{

        var tushuguanChart1 = echarts.init(document.getElementById("tushuguanChart1"),'fresh-cut');
        this.$http({
            url: "tushuguan/group/guimo",
            method: "get",
        }).then(({ data }) => {
            if (data && data.code === 0) {
                let res = data.data;
                let xAxis = [];
                let yAxis = [];
                let pArray = []
                for(let i=0;i<res.length;i++){
                    xAxis.push(res[i].guimo);
                    yAxis.push(parseFloat((res[i].total)));
                    pArray.push({
                        value: parseFloat((res[i].total)),
                        name: res[i].guimo
                    })
                }
                var option = {};
                option = {
                        title: {
                            text: '图书馆类型统计',
                            left: 'center'
                        },
                        tooltip: {
                          trigger: 'item',
                          formatter: '{b} : {c} ({d}%)'
                        },
                        series: [
                            {
                                type: 'pie',
                                radius: '55%',
                                center: ['50%', '60%'],
                                data: pArray,
                                emphasis: {
                                    itemStyle: {
                                        shadowBlur: 10,
                                        shadowOffsetX: 0,
                                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                                    }
                                }
                            }
                        ]
                };
                // 使用刚指定的配置项和数据显示图表。
                tushuguanChart1.setOption(option);
                  //根据窗口的大小变动图表
                window.onresize = function() {
                    tushuguanChart1.resize();
                };
            }
        });
      })
    },






    getzuoweixinxiCount() {
        this.$http({
            url: `zuoweixinxi/count`,
            method: "get"
        }).then(({
            data
        }) => {
            if (data && data.code == 0) {
                this.zuoweixinxiCount = data.data
            }
        })
    },

    zuoweixinxiChat1() {
      this.$nextTick(()=>{

        var zuoweixinxiChart1 = echarts.init(document.getElementById("zuoweixinxiChart1"),'macarons');
        this.$http({
            url: "zuoweixinxi/group/zhuangtai",
            method: "get",
        }).then(({ data }) => {
            if (data && data.code === 0) {
                let res = data.data;
                let xAxis = [];
                let yAxis = [];
                let pArray = []
                for(let i=0;i<res.length;i++){
                    xAxis.push(res[i].zhuangtai);
                    yAxis.push(parseFloat((res[i].total)));
                    pArray.push({
                        value: parseFloat((res[i].total)),
                        name: res[i].zhuangtai
                    })
                }
                var option = {};
                option = {
                        title: {
                            text: '座位状态统计',
                            left: 'center'
                        },
                        tooltip: {
                          trigger: 'item',
                          formatter: '{b} : {c} ({d}%)'
                        },
                        series: [
                            {
                                type: 'pie',
                                radius: ['25%', '55%'],
                                center: ['50%', '60%'],
                                data: pArray,
                                emphasis: {
                                    itemStyle: {
                                        shadowBlur: 10,
                                        shadowOffsetX: 0,
                                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                                    }
                                }
                            }
                        ]
                };
                // 使用刚指定的配置项和数据显示图表。
                zuoweixinxiChart1.setOption(option);
                  //根据窗口的大小变动图表
                window.onresize = function() {
                    zuoweixinxiChart1.resize();
                };
            }
        });
      })
    },






    getyuyuexuanzuoCount() {
        this.$http({
            url: `yuyuexuanzuo/count`,
            method: "get"
        }).then(({
            data
        }) => {
            if (data && data.code == 0) {
                this.yuyuexuanzuoCount = data.data
            }
        })
    },

    yuyuexuanzuoChat1() {
      this.$nextTick(()=>{

        var yuyuexuanzuoChart1 = echarts.init(document.getElementById("yuyuexuanzuoChart1"),'fresh-cut');
        this.$http({
            url: "yuyuexuanzuo/group/yuyueshijian",
            method: "get",
        }).then(({ data }) => {
            if (data && data.code === 0) {
                let res = data.data;
                let xAxis = [];
                let yAxis = [];
                let pArray = []
                for(let i=0;i<res.length;i++){
                    xAxis.push(res[i].yuyueshijian);
                    yAxis.push(parseFloat((res[i].total)));
                    pArray.push({
                        value: parseFloat((res[i].total)),
                        name: res[i].yuyueshijian
                    })
                }
                var option = {};
                option = {
                    title: {
                        text: '预约日期统计',
                        left: 'center'
                    },
                    tooltip: {
                      trigger: 'item',
                      formatter: '{b} : {c}'
                    },
                    xAxis: {
                        type: 'category',
                        data: xAxis
                    },
                    yAxis: {
                        type: 'value'
                    },
                    series: [{
                        data: yAxis,
                        type: 'bar'
                    }]
                };
                // 使用刚指定的配置项和数据显示图表。
                yuyuexuanzuoChart1.setOption(option);
                  //根据窗口的大小变动图表
                window.onresize = function() {
                    yuyuexuanzuoChart1.resize();
                };
            }
        });
      })
    },






  }
};
</script>
<style lang="scss" scoped>
    .cardView {
        display: flex;
        flex-wrap: wrap;
        width: 100%;

        .cards {
            display: flex;
            align-items: center;
            width: 100%;
            margin-bottom: 10px;
            justify-content: center;
            .card {
                width: calc(25% - 20px);
                margin: 0 10px;
                /deep/.el-card__body{
                    padding: 0;
                }
            }
        }
    }
</style>
