const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm7kci7/",
            name: "ssm7kci7",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm7kci7/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于微信小程序的图书馆座位预约"
        } 
    }
}
export default base
