package cn.langya;

import java.util.Map;

/**
 * @author LangYa466
 * @since 4/14/2025
 */
public class Response {
    private final int statusCode;
    private final String body;
    private final Map<String, String> cookies;

    public Response(int statusCode, String body, Map<String, String> cookies) {
        this.statusCode = statusCode;
        this.body = body;
        this.cookies = cookies;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getBody() {
        return body;
    }

    public Map<String, String> getCookies() {
        return cookies;
    }

    @Override
    public String toString() {
        return body;
    }
}