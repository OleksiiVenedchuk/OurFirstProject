package APITestsByOleksii;

import APITestsByOleksii.Config.VideoGameConfig;
import APITestsByOleksii.Config.VideoGameEndpoints;
import org.junit.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class FirstTest extends VideoGameConfig {
    @Test
    public void myFirstTest(){
        given()
                .log().all()
                .when()
                .get("/videogame")
                .then()
                .log().all();
    }
    @Test
    public void myFirstTestWithEndpoint(){
        get(VideoGameEndpoints.ALL_VIDEO_GAMES)
                .then().log().all();
    }


}
