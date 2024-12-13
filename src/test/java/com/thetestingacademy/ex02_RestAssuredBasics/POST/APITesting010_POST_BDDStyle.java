package com.thetestingacademy.ex02_RestAssuredBasics.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting010_POST_BDDStyle {


    @Description("Verify the POST Req Positive")
    @Test
    public void test_POST_BDDStyle() {
        // TC > 100 -> Non BDD
        // TC < 100 ->  BDD

        // url,body, header,


        // https://restful-booker.herokuapp.com/auth

        // Content-Type: application/json

        // {
        //    "username" : "admin",
        //    "password" : "password123"
        //}

        // Auth?


        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all().body(payload)
                .when().log().all().post()
                .then().log().all().statusCode(200);


    }


}
