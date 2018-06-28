package edu.maskleo.github.api.v3;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @author v@maskleo.cn
 */
public final class APIExample {

    private static RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) {
        api_github_com();
    }

    private static void api_github_com() {
        JsonParser parser = new JsonParser();
        String url = "https://api.github.com";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        JsonObject jsonObject = (JsonObject) parser.parse(responseEntity.getBody());
        System.out.println(jsonObject);
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            System.out.println(entry);
        }
    }

}
