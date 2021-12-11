package homeWork13;

import com.google.gson.Gson;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;


public class RestAssured {
    public  String baseUrl ="https://petstore.swagger.io/v2";

    RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setBaseUri(baseUrl)
            .setContentType(ContentType.JSON)

            .build();

    ResponseSpecification responseSpecification = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectResponseTime(lessThan(5000L))
            .build();


    @Test
    public void restAssure(){

        User user1 = new User();
        user1.setId(0);
        user1.setUsername("string");
        user1.setFirstName("string");
        user1.setEmail("string");
        user1.setPassword("string");
        user1.setPhone("string");
        user1.setUserStatus(0);

        String jsonObject = new Gson().toJson(user1);

        given()
                .spec(requestSpecification)
                .body(jsonObject)
        .when()
                .post("/user")
        .then()
                .spec(responseSpecification)
                .body("message", equalTo("9223372036854775807"));// без переврки тест проходить, а з перевіркою цифри не співпадають


    }

}
