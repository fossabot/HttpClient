# HttpClient

简单轻量的网页请求库
像 Python 的 requests 一样写 HTTP 请求
支持 GET/POST 自动带参数 带 Cookie 还内置了常见的浏览器 UA(火狐/谷歌/Edge)


# 使用 maven/gradle 导入
https://jitpack.io/#LangYa466/HTTPCLIENT/-SNAPSHOT
---

## 快速开始

##  Response(toString默认为getBody)
### GET
```java
Response response = new HttpClient()
        .url("https://httpbin.org/get")
        .method(HttpMethod.GET)
        .header("User-Agent", UserAgent.FIREFOX)
        .param("name", "LangYa466")
        .cookie("session", "123456")
        .send();

        System.out.println("GET:" + response);
```

### POST
```java
        Response response = new HttpClient()
                .url("https://httpbin.org/post")
                .method(HttpMethod.POST)
                .header("User-Agent", UserAgent.CHROME)
                .param("name", "LangYa466")
                .cookie("token", "abcdef")
                .send();

        System.out.println("POST:" + response);
```