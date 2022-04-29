package itstep_aqa.api.day_16;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class TrelloTest {

    //Make CRUD tests for Trello Dashboard using restAssured.
    //The same with a custom Java client.

    String key="06aacd672653757cb826c81e4605ab02";
    String token="53b31836ef880c26c79d755b48c2298c3fd2c0a94094adc266f5411e97423a1e";

    @BeforeTest
    void initRestAssured(){
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
    @Test
    void createTest() throws URISyntaxException {

        HttpRequest httpRequest= HttpRequest
                .newBuilder()
                .uri(new URI(""))
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();


        //Step_1 create board
        //https://api.trello.com/1/boards/?name={{boardName}}&key={{key}}&token={{token}}
        String boardName= UUID.randomUUID().toString();
        Response response= given()
                .when()
                .contentType("application/json")
                .body("{\"idOrganization\":\"60fefe65beb2b76caa04761c\"}")
                .post("https://api.trello.com/1/boards/?name="
                        +boardName+"&key="+
                        key+"&token="
                        +token+
                        "");

        response.then()
                .assertThat()
                .statusCode(200);

        //Step_2 get
        String id=response.getBody().jsonPath().get("id");
        System.out.println(id);

        //Step_3 update

        //Step_4 delete





    }
}
