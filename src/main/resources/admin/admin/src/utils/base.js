const base = {
    get() {
                return {
            url : "http://localhost:8080/springboot33dng/",
            name: "springboot33dng",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot33dng/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "阿博图书馆管理系统"
        } 
    }
}
export default base
