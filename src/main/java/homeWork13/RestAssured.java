package homeWork13;

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
    public  String baseUrl ="https://swapi.dev/api/";
    RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setBaseUri(baseUrl)
            .setContentType(ContentType.JSON)
            .setBasePath("planets/1")
            .build();

    ResponseSpecification responseSpecification = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectResponseTime(lessThan(5000L))
            .build();



    @Test
    public void restAssure(){
        given()
                .spec(requestSpecification)
        .when()
                .get()
        .then()
                .spec(responseSpecification)
                .body("name", equalTo("Tatooine"));
    }

}
