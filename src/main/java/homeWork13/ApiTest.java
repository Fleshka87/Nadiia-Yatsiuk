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

//    @Test
//            public void okhttp() throws IOException {
//
//
//        Request request = new Request.Builder().
//                url(baseURL+"/store/inventory").
//                build();
//
//        OkHttpClient client = new OkHttpClient();
//        Call call = client.newCall(request);
//
//        Response response = call.execute();
//       int code =  response.code();
//       // Assert.assertEquals(200, 200);
//        System.out.println(code);
//        System.out.println(response.body().string());
//
//    }
@Test
public void okhttp() throws IOException {

    Order order = new Order();
    order.setId(0);
    order.setPetId(0);
    order.setQuantity(0);
    order.setShipDate("2021-12-10T00:09:53.892Z");
    order.setStatus("placed");
    order.setComplete(true);

    String jsonObject = new Gson().toJson(order);

    RequestBody requestBody= RequestBody.create(jsonObject.getBytes(StandardCharsets.UTF_8));


    Request request = new Request.Builder().
            url(baseURL+"/store/order").
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
