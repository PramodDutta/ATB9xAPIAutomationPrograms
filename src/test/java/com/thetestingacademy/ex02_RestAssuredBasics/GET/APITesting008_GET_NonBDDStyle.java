package com.thetestingacademy.ex02_RestAssuredBasics.GET;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting008_GET_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Description("Verify the GET Req Positive")
    @Test
    public void test_GET_NonBDDStyle() {

        //  Rest Assured Interfaces

        String pin_code = "388620";
        r = RestAssured
                .given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pin_code);


        response = r.when().log().all().get();


        vr = response.then()
                .log().all()
                .statusCode(200);


    }

    @Description("Verify the GET Req Negative : -1 Input")
    @Test
    public void test_NonBDDStyleGET_negative() {

        String pin_code = "-1";
        r = RestAssured
                .given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pin_code);


        response = r.when().log().all().get();


        vr = response.then()
                .log().all()
                .statusCode(200);

    }

    @Description("Verify the GET Req Negative : 100000000000000000 Input")
    @Test
    public void test_NonBDDStyleGET_negative2(){
            // This will be written by Students

//        String pin_code = "100000000000000000";
//        String pin_code = "@@#####";
        String pin_code = "null,black...";
        r = RestAssured
                .given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pin_code);


        response = r.when().log().all().get();


        vr = response.then()
                .log().all()
                .statusCode(200);
    }


}
