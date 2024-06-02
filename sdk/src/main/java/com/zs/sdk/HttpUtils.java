package com.zs.sdk;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpUtils {
    private OkHttpClient client = new OkHttpClient();

    public void hello() {
        System.out.println("Hello World");
    }

    public String callReq(String url) {
        try {
            Request request = new Request.Builder()
                    .url(url)
                    .build();
            try (Response response = client.newCall(request).execute()) {
                return response.body().string();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
