(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/discusstushuguan/detail"],{"0a9e":function(t,n,e){"use strict";e.r(n);var s=e("398c"),i=e.n(s);for(var u in s)"default"!==u&&function(t){e.d(n,t,(function(){return s[t]}))}(u);n["default"]=i.a},"398c":function(t,n,e){"use strict";(function(t){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var s=i(e("a34a"));function i(t){return t&&t.__esModule?t:{default:t}}function u(t,n,e,s,i,u,a){try{var r=t[u](a),c=r.value}catch(o){return void e(o)}r.done?n(c):Promise.resolve(c).then(s,i)}function a(t){return function(){var n=this,e=arguments;return new Promise((function(s,i){var a=t.apply(n,e);function r(t){u(a,s,i,r,c,"next",t)}function c(t){u(a,s,i,r,c,"throw",t)}r(void 0)}))}}var r={data:function(){return{btnColor:["#409eff","#67c23a","#909399","#e6a23c","#f56c6c","#356c6c","#351c6c","#f093a9","#a7c23a","#104eff","#10441f","#a21233","#503319"],id:"",userid:"",detail:{},swiperList:[],commentList:[],mescroll:null,downOption:{auto:!1},upOption:{noMoreSize:3,textNoMore:"~ 没有更多了 ~"},hasNext:!0,user:{},count:0,timer:null}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var t=a(s.default.mark((function t(n){return s.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:this.id=n.id,n.userid&&(this.userid=n.userid);case 2:case"end":return t.stop()}}),t,this)})));function n(n){return t.apply(this,arguments)}return n}(),onShow:function(){var n=a(s.default.mark((function n(e){var i,u,a;return s.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:return this.init(),i=t.getStorageSync("nowTable"),n.next=4,this.$api.session(i);case 4:u=n.sent,this.user=u.data,this.btnColor=this.btnColor.sort((function(){return.5-Math.random()})),a=t.getStorageSync("discussdiscusstushuguanCleanType"),a&&(t.removeStorageSync("discussdiscusstushuguanCleanType"),this.mescroll.num=1,this.upCallback(this.mescroll));case 9:case"end":return n.stop()}}),n,this)})));function e(t){return n.apply(this,arguments)}return e}(),destroyed:function(){},methods:{onPayTap:function(){t.setStorageSync("paytable","discusstushuguan"),t.setStorageSync("payObject",this.detail),this.$utils.jump("../pay-confirm/pay-confirm?type=1")},onDetailTap:function(n){t.setStorageSync("useridTag",this.userid),this.$utils.jump("./detail?id=".concat(n.id,"&userid=")+this.userid)},onAcrossTap:function(n,e,s,i,u){if(t.setStorageSync("crossTable","discusstushuguan"),t.setStorageSync("crossObj",this.detail),t.setStorageSync("statusColumnName",s),t.setStorageSync("statusColumnValue",u),t.setStorageSync("tips",i),""!=s&&!s.startsWith("[")){var a=t.getStorageSync("crossObj");for(var r in a)if(r==s&&a[r]==u)return void this.$utils.msg(i)}this.$utils.jump("../".concat(n,"/add-or-update?cross=true"))},init:function(){var t=a(s.default.mark((function t(){var n;return s.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,this.$api.info("discusstushuguan",this.id);case 2:n=t.sent,this.detail=n.data;case 4:case"end":return t.stop()}}),t,this)})));function n(){return t.apply(this,arguments)}return n}(),mescrollInit:function(t){this.mescroll=t},downCallback:function(t){this.hasNext=!0,t.resetUpScroll()},upCallback:function(){var t=a(s.default.mark((function t(n){var e;return s.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,this.$api.list("discussdiscusstushuguan",{page:n.num,limit:10,refid:this.id});case 2:e=t.sent,1==n.num&&(this.commentList=[]),this.commentList=this.commentList.concat(e.data.list),0==e.data.list.length&&(this.hasNext=!1),n.endSuccess(n.size,this.hasNext);case 7:case"end":return t.stop()}}),t,this)})));function n(n){return t.apply(this,arguments)}return n}(),onChatTap:function(){this.$utils.jump("../chat/chat")},download:function(n){var e=this;n=e.$base.url+n,t.downloadFile({url:n,success:function(t){200===t.statusCode&&(e.$utils.msg("下载成功"),window.open(n))}})},onCartTabTap:function(){this.$utils.tab("../shop-cart/shop-cart")},onCommentTap:function(){var t=a(s.default.mark((function t(){return s.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:this.$utils.jump("../discussdiscusstushuguan/add-or-update?refid=".concat(this.id));case 1:case"end":return t.stop()}}),t,this)})));function n(){return t.apply(this,arguments)}return n}(),onSHTap:function(){this.$refs.popup.open()}}};n.default=r}).call(this,e("543d")["default"])},"70bc":function(t,n,e){"use strict";var s={"mescroll-uni":()=>Promise.all([e.e("common/vendor"),e.e("components/mescroll-uni/mescroll-uni")]).then(e.bind(null,"f05e"))},i=function(){var t=this,n=t.$createElement;t._self._c},u=[];e.d(n,"b",(function(){return i})),e.d(n,"c",(function(){return u})),e.d(n,"a",(function(){return s}))},7850:function(t,n,e){"use strict";e.r(n);var s=e("70bc"),i=e("0a9e");for(var u in i)"default"!==u&&function(t){e.d(n,t,(function(){return i[t]}))}(u);e("fd2a");var a,r=e("f0c5"),c=Object(r["a"])(i["default"],s["b"],s["c"],!1,null,"0108f096",null,!1,s["a"],a);n["default"]=c.exports},d735:function(t,n,e){"use strict";(function(t){e("6cdc"),e("921b");s(e("66fd"));var n=s(e("7850"));function s(t){return t&&t.__esModule?t:{default:t}}t(n.default)}).call(this,e("543d")["createPage"])},f05c:function(t,n,e){},fd2a:function(t,n,e){"use strict";var s=e("f05c"),i=e.n(s);i.a}},[["d735","common/runtime","common/vendor"]]]);