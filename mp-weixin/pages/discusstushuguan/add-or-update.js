(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/discusstushuguan/add-or-update"],{"1c0e":function(e,t,r){"use strict";r.r(t);var n=r("bcce"),a=r("7929");for(var u in a)"default"!==u&&function(e){r.d(t,e,(function(){return a[e]}))}(u);r("38ad");var i,s=r("f0c5"),c=Object(s["a"])(a["default"],n["b"],n["c"],!1,null,"aca70780",null,!1,n["a"],i);t["default"]=c.exports},"38ad":function(e,t,r){"use strict";var n=r("e2f9"),a=r.n(n);a.a},7929:function(e,t,r){"use strict";r.r(t);var n=r("979d"),a=r.n(n);for(var u in n)"default"!==u&&function(e){r.d(t,e,(function(){return n[e]}))}(u);t["default"]=a.a},"979d":function(e,t,r){"use strict";(function(e){Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var n=a(r("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function u(e,t,r,n,a,u,i){try{var s=e[u](i),c=s.value}catch(o){return void r(o)}s.done?t(c):Promise.resolve(c).then(n,a)}function i(e){return function(){var t=this,r=arguments;return new Promise((function(n,a){var i=e.apply(t,r);function s(e){u(i,n,a,s,c,"next",e)}function c(e){u(i,n,a,s,c,"throw",e)}s(void 0)}))}}var s=function(){return Promise.all([r.e("common/vendor"),r.e("components/w-picker/w-picker")]).then(r.bind(null,"e2b1"))},c=function(){return r.e("components/xia-editor/xia-editor").then(r.bind(null,"064f"))},o={data:function(){return{cross:"",ruleForm:{refid:"",userid:"",avatarurl:"",nickname:"",content:"",reply:""},user:{},ro:{refid:!1,userid:!1,avatarurl:!1,nickname:!1,content:!1,reply:!1}}},components:{wPicker:s,xiaEditor:c},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var t=i(n.default.mark((function t(r){var a,u,i,s;return n.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return a=e.getStorageSync("nowTable"),t.next=3,this.$api.session(a);case 3:if(u=t.sent,this.user=u.data,this.ruleForm.userid=e.getStorageSync("userid"),r.refid&&(this.ruleForm.refid=r.refid,this.ruleForm.nickname=e.getStorageSync("nickname")),!r.id){t.next=13;break}return this.ruleForm.id=r.id,t.next=11,this.$api.info("discusstushuguan",this.ruleForm.id);case 11:u=t.sent,this.ruleForm=u.data;case 13:if(this.cross=r.cross,!r.cross){t.next=45;break}i=e.getStorageSync("crossObj"),t.t0=n.default.keys(i);case 17:if((t.t1=t.t0()).done){t.next=45;break}if(s=t.t1.value,"refid"!=s){t.next=23;break}return this.ruleForm.refid=i[s],this.ro.refid=!0,t.abrupt("continue",17);case 23:if("userid"!=s){t.next=27;break}return this.ruleForm.userid=i[s],this.ro.userid=!0,t.abrupt("continue",17);case 27:if("avatarurl"!=s){t.next=31;break}return this.ruleForm.avatarurl=i[s].split(",")[0],this.ro.avatarurl=!0,t.abrupt("continue",17);case 31:if("nickname"!=s){t.next=35;break}return this.ruleForm.nickname=i[s],this.ro.nickname=!0,t.abrupt("continue",17);case 35:if("content"!=s){t.next=39;break}return this.ruleForm.content=i[s],this.ro.content=!0,t.abrupt("continue",17);case 39:if("reply"!=s){t.next=43;break}return this.ruleForm.reply=i[s],this.ro.reply=!0,t.abrupt("continue",17);case 43:t.next=17;break;case 45:this.styleChange();case 46:case"end":return t.stop()}}),t,this)})));function r(e){return t.apply(this,arguments)}return r}(),methods:{styleChange:function(){this.$nextTick((function(){}))},avatarurlTap:function(){var e=this;this.$api.upload((function(t){e.ruleForm.avatarurl="upload/"+t.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var t=i(n.default.mark((function t(){var r,a,u,i,s,c,o,l,d,f,h,p,m,g;return n.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:for(this.ruleForm.avatarurl=e.getStorageSync("headportrait")?e.getStorageSync("headportrait"):"",r="",a=[],r&&(a=r.split(",")),u=0;u<a.length;u++)i=new RegExp(a[u],"g"),this.ruleForm.content.indexOf(a[u])>-1&&(this.ruleForm.content=this.ruleForm.content.replace(i,"**"));if(this.ruleForm.refid){t.next=8;break}return this.$utils.msg("关联表id不能为空"),t.abrupt("return");case 8:if(this.ruleForm.userid){t.next=11;break}return this.$utils.msg("用户id不能为空"),t.abrupt("return");case 11:if(this.ruleForm.content){t.next=14;break}return this.$utils.msg("评论内容不能为空"),t.abrupt("return");case 14:if(!this.cross){t.next=30;break}if(d=e.getStorageSync("statusColumnName"),f=e.getStorageSync("statusColumnValue"),""==d){t.next=30;break}if(s||(s=e.getStorageSync("crossObj")),d.startsWith("[")){t.next=26;break}for(h in s)h==d&&(s[h]=f);return p=e.getStorageSync("crossTable"),t.next=24,this.$api.update("".concat(p),s);case 24:t.next=30;break;case 26:c=Number(e.getStorageSync("userid")),o=s["id"],l=e.getStorageSync("statusColumnName"),l=l.replace(/\[/,"").replace(/\]/,"");case 30:if(!o||!c){t.next=53;break}return this.ruleForm.crossuserid=c,this.ruleForm.crossrefid=o,m={page:1,limit:10,crossuserid:c,crossrefid:o},t.next=36,this.$api.list("discusstushuguan",m);case 36:if(g=t.sent,!(g.data.total>=l)){t.next=42;break}return this.$utils.msg(e.getStorageSync("tips")),t.abrupt("return",!1);case 42:if(!this.ruleForm.id){t.next=47;break}return t.next=45,this.$api.update("discusstushuguan",this.ruleForm);case 45:t.next=49;break;case 47:return t.next=49,this.$api.add("discusstushuguan",this.ruleForm);case 49:e.setStorageSync("discusstushuguanCleanType",!0),this.$utils.msgBack("提交成功");case 51:t.next=62;break;case 53:if(!this.ruleForm.id){t.next=58;break}return t.next=56,this.$api.update("discusstushuguan",this.ruleForm);case 56:t.next=60;break;case 58:return t.next=60,this.$api.add("discusstushuguan",this.ruleForm);case 60:e.setStorageSync("discusstushuguanCleanType",!0),this.$utils.msgBack("提交成功");case 62:case"end":return t.stop()}}),t,this)})));function r(){return t.apply(this,arguments)}return r}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var t=new Date,r=t.getFullYear(),n=t.getMonth()+1,a=t.getDate();return"start"===e?r-=60:"end"===e&&(r+=2),n=n>9?n:"0"+n,a=a>9?a:"0"+a,"".concat(r,"-").concat(n,"-").concat(a)},toggleTab:function(e){this.$refs[e].show()}}};t.default=o}).call(this,r("543d")["default"])},bcce:function(e,t,r){"use strict";var n,a=function(){var e=this,t=e.$createElement;e._self._c},u=[];r.d(t,"b",(function(){return a})),r.d(t,"c",(function(){return u})),r.d(t,"a",(function(){return n}))},e2f9:function(e,t,r){},f701:function(e,t,r){"use strict";(function(e){r("6cdc"),r("921b");n(r("66fd"));var t=n(r("1c0e"));function n(e){return e&&e.__esModule?e:{default:e}}e(t.default)}).call(this,r("543d")["createPage"])}},[["f701","common/runtime","common/vendor"]]]);