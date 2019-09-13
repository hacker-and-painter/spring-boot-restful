# 通过 Spring Boot 实现RestFul接口(restful接口最佳实践)

## swagger文档

 http://localhost:8080/swagger-ui.html

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190601165410.png)

## 运行效果

- 获取所有

get http://localhost:8080/employees

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190601163911.png)

- 获取一个

get http://localhost:8080/employees/8

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190601165458.png)

- 增加

post http://localhost:8080/employees

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190601164637.png)

- 更新
put http://localhost:8080/employees/8

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190601164728.png)

- 删除
delete http://localhost:8080/employees/8

![](https://raw.githubusercontent.com/gaohanghang/images/master/img20190601164843.png)

## 快速启动

·1.  Mysql 创建 test 数据库

2. 从 idea 启动项目
3. 打开 swagger 文档页面， http://localhost:8080/swagger-ui.html

## 技术栈

- spring boot
- gradle
- spring data jpa
- mysql

## 参考

- [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
- [人人都是 API 设计师：我对 RESTful API、GraphQL、RPC API 的思考](https://www.infoq.cn/article/ZgAAVBZZaoo4I0-pkgV8)
- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [SpringBoot教程(一)构建restful web服务](https://juejin.im/post/5ac31c2b51882555784e266c)
