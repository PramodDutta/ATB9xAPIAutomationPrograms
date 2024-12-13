package com.thetestingacademy.ex02_RestAssuredBasics.PATCH;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting011_PATCH_NONBddStyle {

    // PUT

    // token, booking id - A

//    public void get_token(){ }
//    public void get_booking_id(){}


    @Description("Verify the Patch Request for the Restful Booker APIs")
    @Test
    public void test_patch_non_bdd(){

        String token = "e6ffdd48c67cb60";
        String bookingid = "360";

        String payloadPatch= "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";


        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/"+bookingid);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);

        requestSpecification.body(payloadPatch).log().all();

        Response response = requestSpecification.when().patch();

        ValidatableResponse validatableResponse = response.then().log().all();

        validatableResponse.statusCode(200);














    }




}
