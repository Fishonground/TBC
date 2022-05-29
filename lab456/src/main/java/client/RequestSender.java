package client;

import java.io.IOException;
import java.util.Map;

import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
//import ru.dnoskov.rsifmo.service.model.RestResponse;
import okhttp3.HttpUrl;
import okhttp3.MediaType;

public class RequestSender {

    private static final Gson gson = new Gson();

    private static final String hostAddress = "http://localhost:8080/gods";

    private final HttpUrl url;
    private final RequestBody requestBody;

    OkHttpClient client;

    public RequestSender(String methodAddress,
                         Map<String, Object> bodyParts) {

        String baseUrl = hostAddress + methodAddress;

        HttpUrl.Builder httpBuilder = HttpUrl.get(baseUrl).newBuilder();

        url = httpBuilder.build();

        if (!bodyParts.isEmpty()) {
        	
            requestBody = RequestBody.create(gson.toJson(bodyParts),
                    MediaType.get("application/json; charset=utf-8"));
        } else {
            requestBody = RequestBody.create("", null);
        }

        client = new OkHttpClient();

    }

    public RestResponse doGet() throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        Response response = client.newCall(request).execute();
        return new RestResponse(response);
    }

    public RestResponse doPost() throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();

        Response response = client.newCall(request).execute();
        return new RestResponse(response);
    }

    public RestResponse doPut() throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .put(requestBody)
                .build();

        Response response = client.newCall(request).execute();
        return new RestResponse(response);
    }

    public RestResponse doDelete() throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .delete(requestBody)
                .build();

        Response response = client.newCall(request).execute();
        return new RestResponse(response);
    }



}