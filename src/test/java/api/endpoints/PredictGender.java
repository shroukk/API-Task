package api.endpoints;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PredictGender {

    public static Response response;
    public static Response getGender(){
        String gender_url = BasePage.getURL().getString("url");
                response = given()
                        .queryParam("name", BasePage.getData().getString("name"))
                        .when()
                        .get(gender_url);
        return response;
    }
}
