package cn.langya;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author LangYa466
 * @since 4/14/2025
 */
public class HttpClientTest {

    @Test
    void testGetRequest() throws IOException {
        Response response = new HttpClient()
                .url("http://160.202.228.193:8080/test")
                .method(HttpMethod.GET)
                .header("User-Agent", UserAgent.FIREFOX)
                .param("name", "LangYa")
                .cookie("session", "123456")
                .send();

        System.out.println(response.toString());
        assertNotNull(response, "Response should not be null");
        assertEquals(200, response.getStatusCode(), "Status code should be 200");
        assertTrue(response.toString().contains("GET"), "Response should contain GET");
    }

    @Test
    void testPostRequest() throws IOException {
        Response response = new HttpClient()
                .url("http://160.202.228.193:8080/test")
                .method(HttpMethod.POST)
                .header("User-Agent", UserAgent.CHROME)
                .param("name", "LangYa466")
                .cookie("token", "abcdef")
                .send();

        System.out.println(response.toString());
        assertNotNull(response, "Response should not be null");
        assertEquals(200, response.getStatusCode(), "Status code should be 200");
        assertTrue(response.toString().contains("POST"), "Response should contain POST");
    }

    @Test
    void testRandomUA() {
        for (int i = 0; i < 8; i++) {
            String ua = UserAgent.getRandomUserAgent();
            System.out.println(ua);
            assertNotNull(ua);
        }
    }
}