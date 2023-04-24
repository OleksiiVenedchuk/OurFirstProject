package APIforTrelloByOleksii;

import APIforTrelloByOleksii.PojoClasses.*;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import org.junit.Assert;

import static APIforTrelloByOleksii.UserDataTrello.userDataSpecification;
import static io.restassured.RestAssured.given;

public class TrelloTest {
    private static String URL = "https://api.trello.com";

    @Test
    public void getABoardTest() {

        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationOk200());
        String id = "63debf8017cf538eea53c891";
        String name = "Testova Doshka";
        RequestSpecification spec = userDataSpecification();
        String idValue = ((QueryableRequestSpecification) spec).getQueryParams().get("id");

        TrelloBoardResponse trelloBoard = given()
                .spec(spec)
                .pathParam("id", idValue)
                .when()
                .get("/1/boards/{id}")
                .then().log().all()
                .extract().body().as(TrelloBoardResponse.class);
        Assert.assertTrue(trelloBoard.getName().contains(name));
        System.out.println(trelloBoard.getName());

    }

    @Test
    public void updateABoardTest() {

        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationOk200());
        String name = "Testovaaaaa Doshka";
        RequestSpecification spec = userDataSpecification();
        TrelloBoardRequest trelloBoardRequest = new TrelloBoardRequest("Testovaaaaa Doshka");
        String idValue = ((QueryableRequestSpecification) spec).getQueryParams().get("id");

        TrelloBoardResponse trelloBoard = given()
                .spec(spec)
                .pathParam("id", idValue)
                .body(trelloBoardRequest)
                .when()
                .put("/1/boards/{id}")
                .then().log().all()
                .extract().body().as(TrelloBoardResponse.class);
        Assert.assertTrue(trelloBoard.getName().contains(name));
        System.out.println(trelloBoard.getName());

    }

    @Test
    public void createABoardTest() {

        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationOk200());
        String name = "Nova Doshka";
        RequestSpecification spec = userDataSpecification();
        TrelloCreateABoardRequest trelloCreatingABoardRequest = new TrelloCreateABoardRequest("Nova Doshka");

        TrelloCreateABoardResponse trelloCreateABoardResponse = given()
                .spec(spec)
                .body(trelloCreatingABoardRequest)
                .when()
                .post("/1/boards/")
                .then().log().all()
                .extract().body().as(TrelloCreateABoardResponse.class);
        Assert.assertTrue(trelloCreateABoardResponse.getName().contains(name));
        System.out.println(trelloCreateABoardResponse.getName());

    }

    @Test
    public void deleteABoardTest() {

        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationOk200());
        String deleteSuccess = "null";

        RequestSpecification spec = userDataSpecification();
        String idValue = ((QueryableRequestSpecification) spec).getQueryParams().get("boardIDforDelete");

        TrelloBoardDeleteSuccessResponse trelloBoardDeleteSuccessResponse = given()
                .spec(spec)
                .pathParam("boardIDforDelete", idValue)
                .when()
                .delete("/1/boards/{boardIDforDelete}")
                .then().log().all()
                .extract().body().as(TrelloBoardDeleteSuccessResponse.class);
        String value = trelloBoardDeleteSuccessResponse.get_value();
        if (value != null) {
            Assert.assertTrue(value.contains(deleteSuccess));
        } else {
            System.out.println("DELETED!!!");
        }
    }

    @Test
    public void createNewCardTest()  {

        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationOk200());
        RequestSpecification spec = userDataSpecification();
        String name = "EbanayaCartca";
        TrelloCreateNewCardRequest trelloCreateNewCardRequest = new TrelloCreateNewCardRequest("64411c109f4ed63035d6e8e7", "EbanayaCartca!!!");


        TrelloCreateNewCardResponse trelloCreateNewCardResponse = given()
                .spec(spec)
                .body(trelloCreateNewCardRequest)
                .when()
                .post("/1/cards")
                .then().log().all()
                .extract().body().as(TrelloCreateNewCardResponse.class);
        Assert.assertTrue(trelloCreateNewCardResponse.getName().contains(name));
        System.out.println(trelloCreateNewCardResponse.getName());

    }


}

