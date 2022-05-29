package client;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

//import org.bson.Document;

import lombok.Data;
import lombok.Getter;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Data
public class RestResponse {

	@Getter
    int code;
    Map<String, Object> body;

    public RestResponse(Response response) throws IOException {
        code = response.code();
        
        ResponseBody responseBody = response.body();

        if (responseBody != null) {
            String responseBodyString = responseBody.string();

            if (!responseBodyString.isBlank()) {
            	
            	try {
            	body = new ObjectMapper().readValue(responseBodyString, HashMap.class);
            	}
            	catch (Exception e){
            		body = new HashMap<String, Object>();
            		body.put("answer", responseBodyString);
            	}
            } else {
                body = new HashMap<String, Object>();
            }
        } else {
            body = new HashMap<String, Object>();
        }
    }

}