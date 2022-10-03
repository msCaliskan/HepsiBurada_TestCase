package com.apitest;

import static io.restassured.RestAssured.*;

import com.hepsiburada.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class generator {

    @BeforeClass
    public static void beforeClass(){
        baseURI= ConfigurationReader.get("api_url");
    }

    @Test
    public void verifyGetClientsStatusCode(){
         Response response = given().contentType(ContentType.JSON)
                .get("/gen/clients");

         // Status Code
        System.out.println("response.statusCode() = " + response.statusCode());
        assertEquals(200, response.statusCode());

        // Response Body
        System.out.println("response.body() = " + response.body().asString());

        if (response.statusCode()==200){
            System.out.println("BAŞARILI");
        }else {
            System.out.println("BAŞARISIZ");
        }

    }

    @Test
    public void verifyPostClientLanguage(){

        String body = "{\n" +
                "  \"spec\": {},\n" +
                "  \"options\": {\n" +
                "    \"additionalProp1\": \"string\",\n" +
                "    \"additionalProp2\": \"string\",\n" +
                "    \"additionalProp3\": \"string\"\n" +
                "  },\n" +
                "  \"swaggerUrl\": \"http://petstore.swagger.io/v2/swagger.json\",\n" +
                "  \"authorizationValue\": {\n" +
                "    \"value\": \"string\",\n" +
                "    \"type\": \"string\",\n" +
                "    \"keyName\": \"string\"\n" +
                "  },\n" +
                "  \"usingFlattenSpec\": true,\n" +
                "  \"securityDefinition\": {\n" +
                "    \"type\": \"string\",\n" +
                "    \"description\": \"string\"\n" +
                "  }\n" +
                "}" ;

        Response response = given()
                .contentType(ContentType.JSON)
                .body(body)
                .post("/gen/clients/java");

        // Status Code
        System.out.println("response.statusCode() = " + response.statusCode());
        assertEquals(200, response.statusCode());

        // Response Body
        System.out.println("response.body() = " + response.body().asString());

        if (response.statusCode()==200){
            System.out.println("BAŞARILI");
        }else {
            System.out.println("BAŞARISIZ");
        }
    }
}
