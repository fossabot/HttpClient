package cn.langya;

import java.io.IOException;

/**
 * @author LangYa466
 * @since 4/14/2025
 */
public class Main {
    public static void main(String[] args) throws IOException {
        get();
        post();
    }

    public static void get() throws IOException {
        Response response = new HttpClient()
                .url("https://httpbin.org/get")
                .method(HttpMethod.GET)
                .header("User-Agent", UserAgent.FIREFOX)
                .param("name", "LangYa")
                .cookie("session", "123456")
                .send();

        System.out.println("GET:" + response);
    }

    public static void post() throws IOException {
        Response response = new HttpClient()
                .url("https://httpbin.org/post")
                .method(HttpMethod.POST)
                .header("User-Agent", UserAgent.CHROME)
                .param("name", "LangYa466")
                .cookie("token", "abcdef")
                .send();

        System.out.println("POST:" + response);
    }
}