(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/forum-detail/forum-detail"],{"3a89":function(t,n,e){"use strict";Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var a=r(e("a34a"));function r(t){return t&&t.__esModule?t:{default:t}}function i(t,n,e,a,r,i,c){try{var u=t[i](c),o=u.value}catch(s){return void e(s)}u.done?n(o):Promise.resolve(o).then(a,r)}function c(t){return function(){var n=this,e=arguments;return new Promise((function(a,r){var c=t.apply(n,e);function u(t){i(c,a,r,u,o,"next",t)}function o(t){i(c,a,r,u,o,"throw",t)}u(void 0)}))}}var u=function(){return e.e("components/forum-reply/forum-reply").then(e.bind(null,"f8c1"))},o={components:{userReply:u},data:function(){return{commentData:[],forum:{},id:""}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var t=c(a.default.mark((function t(n){var e;return a.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return this.id=n.id,t.next=3,this.$api.forumDetail(n.id);case 3:e=t.sent,e.data.childs=this.changeContent(e.data.childs),this.commentData=e.data.childs,e.data.content=e.data.content.replace(/img src/gi,'img style="width:100%;" src'),this.forum=e.data;case 8:case"end":return t.stop()}}),t,this)})));function n(n){return t.apply(this,arguments)}return n}(),onShow:function(){var t=c(a.default.mark((function t(){var n;return a.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,this.$api.forumDetail(this.id);case 2:n=t.sent,n.data.childs=this.changeContent(n.data.childs),this.commentData=n.data.childs,this.forum=n.data,n.data.content=n.data.content.replace(/img src/gi,'img style="width:100%;" src');case 7:case"end":return t.stop()}}),t,this)})));function n(){return t.apply(this,arguments)}return n}(),methods:{changeContent:function(t){return t&&(t=n(t)),t;function n(t){for(var e in t)t[e].content=t[e].content.replace(/img src/gi,'img style="width:100%;" src'),t[e].childs&&(t[e].childs=n(t[e].childs));return t}},onReplyTap:function(t){this.$utils.jump("../forum-reply/forum-reply?pid=".concat(t))}}};n.default=o},6192:function(t,n,e){"use strict";(function(t){e("6cdc"),e("921b");a(e("66fd"));var n=a(e("95a4"));function a(t){return t&&t.__esModule?t:{default:t}}t(n.default)}).call(this,e("543d")["createPage"])},"69a6":function(t,n,e){"use strict";e.r(n);var a=e("3a89"),r=e.n(a);for(var i in a)"default"!==i&&function(t){e.d(n,t,(function(){return a[t]}))}(i);n["default"]=r.a},"78ce":function(t,n,e){},"95a4":function(t,n,e){"use strict";e.r(n);var a=e("a8f7"),r=e("69a6");for(var i in r)"default"!==i&&function(t){e.d(n,t,(function(){return r[t]}))}(i);e("a952");var c,u=e("f0c5"),o=Object(u["a"])(r["default"],a["b"],a["c"],!1,null,"ec5bd3ce",null,!1,a["a"],c);n["default"]=o.exports},a8f7:function(t,n,e){"use strict";var a,r=function(){var t=this,n=t.$createElement;t._self._c},i=[];e.d(n,"b",(function(){return r})),e.d(n,"c",(function(){return i})),e.d(n,"a",(function(){return a}))},a952:function(t,n,e){"use strict";var a=e("78ce"),r=e.n(a);r.a}},[["6192","common/runtime","common/vendor"]]]);