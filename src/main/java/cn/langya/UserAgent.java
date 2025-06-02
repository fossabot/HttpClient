package cn.langya;

import java.util.Random;

/**
 * @author LangYa466
 * @since 4/14/2025
 */
public enum UserAgent {
    FIREFOX("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:125.0) Gecko/20100101 Firefox/125.0"),
    CHROME("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/123.0.0.0 Safari/537.36"),
    EDGE("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/123.0.0.0 Safari/537.36 Edg/123.0.0.0"),
    SAFARI("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/605.1.15 Version/15.1 Safari/605.1.15"),
    OPERA("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/123.0.0.0 Safari/537.36 OPR/97.0.0.0"),
    MOBILE_CHROME("Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 Chrome/123.0.0.0 Mobile Safari/537.36");

    private final String ua;

    UserAgent(String ua) {
        this.ua = ua;
    }

    public String getUa() {
        return ua;
    }

    @Override
    public String toString() {
        return ua;
    }

    private static final Random RANDOM = new Random();

    public static String getRandomUserAgent() {
        UserAgent[] values = values();
        return values[RANDOM.nextInt(values.length)].getUa();
    }
}
