package homeWork13;

import com.google.gson.Gson;
import netscape.javascript.JSObject;
import okhttp3.*;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class ApiTest {
    public String baseURL = "https://petstore.swagger.io/v2";

@Test
public void okhttp() throws IOException {

    User user = new User();
    user.setId(0);
    user.setUsername("string");
    user.setFirstName("string");
    user.setEmail("string");
    user.setPassword("string");
    user.setPhone("string");
    user.setUserStatus(0);



    String jsonObject = new Gson().toJson(user);

    RequestBody requestBody= RequestBody.create(jsonObject.getBytes(StandardCharsets.UTF_8));


    Request request = new Request.Builder().
            url(baseURL+"/user").
            post(requestBody).
            header("Content-type", "application/json").
            build();

    OkHttpClient client = new OkHttpClient();

    Call call = client.newCall(request);

    Response response = call.execute();
    System.out.println(response.code());

    System.out.println(response.body().string());



}
}
