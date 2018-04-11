package com.da.killerwebsite.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

public class HttpUtil {

    public static Map<String, Object> get(String url){
        CloseableHttpClient httpClient = null;
        HttpGet httpGet = null;
        try {
            httpClient = HttpClientBuilder.create().build();
            httpGet = new HttpGet(url);
            CloseableHttpResponse response = httpClient.execute(httpGet);
            if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
                String body = EntityUtils.toString(response.getEntity());
                ObjectMapper objectMapper = new ObjectMapper();
                Map<String, Object> result = objectMapper.readValue(body, HashMap.class);
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return null;
    }

}
