package com.thetestingacademy.ex05_payLoadMangement.gson_demo;

import com.google.gson.Gson;
import com.thetestingacademy.ex05_payLoadMangement.Booking;
import com.thetestingacademy.ex05_payLoadMangement.BookingDates;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class APITesting027_RestAssured_GSON {

     @Test
    public void test_GSON(){
         Gson gson = new Gson();
         // .toJSON(object_ref)
         // .fromJSON(jsonString, ClassName.class)





    }

}
