package api.tests;

import api.endpoints.BasePage;
import api.endpoints.PredictGender;
import api.pojo.Gender;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PredictGenderTest {

    @Test
    public void testGetGender(){
        Response response;
        Gender gender;

        response = PredictGender.getGender();
        response.then().log().all();
        gender = response.as(Gender.class);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getStatusCode(),200);
        softAssert.assertEquals(response.contentType(),"application/json; charset=utf-8");
        softAssert.assertTrue(gender.getCount()>0);
        softAssert.assertEquals(gender.getName(), BasePage.getData().getString("name"));
        softAssert.assertEquals(gender.getGender(), BasePage.getData().getString("gender"));
        softAssert.assertTrue(gender.getProbability()>0.5);
        softAssert.assertAll();

    }

}
