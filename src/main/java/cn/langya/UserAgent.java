package cn.langya;

/**
 * @author LangYa466
 * @since 4/14/2025
 */
public enum UserAgent {
    FIREFOX("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:125.0) Gecko/20100101 Firefox/125.0"),
    CHROME("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/123.0.0.0 Safari/537.36"),
    EDGE("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/123.0.0.0 Safari/537.36 Edg/123.0.0.0");

    private final String ua;

    UserAgent(String ua) {
        this.ua = ua;
    }

    public String getUa() {
        return ua;
    }
}