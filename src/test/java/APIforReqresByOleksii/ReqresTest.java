package APIforReqresByOleksii;

import org.junit.Assert;
import org.junit.Test;

import java.time.Clock;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;


public class ReqresTest {
    private static String URL = "https://reqres.in/";

    @Test
    public void checkAvatarAndIDTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationOk200());
        List<UserData> users = given()
                .when()
                .get("api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
        users.forEach(x -> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));
        Assert.assertTrue(users.stream().allMatch(x -> x.getEmail().endsWith("@reqres.in")));
        List<String> avatars = users.stream().map(UserData::getAvatar).collect(Collectors.toList());
        List<String> ids = users.stream().map(UserData::getAvatar).collect(Collectors.toList());
        for (int i = 0; i < avatars.size(); i++) {
            Assert.assertTrue(avatars.get(i).contains(ids.get(i)));
        }
    }

    @Test
    public void successRegTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationOk200());
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        Register user = new Register("eve.holt@reqres.in", "pistol");
        SuccessRegistration successRegistration = given()
                .body(user)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(SuccessRegistration.class);
        Assert.assertNotNull(id);
        Assert.assertNotNull(token);

        Assert.assertEquals(id, successRegistration.getId());
        Assert.assertEquals(token, successRegistration.getToken());
    }

    @Test
    public void unSuccessRegTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationError400());
        Register user = new Register("sydney@fife", "");
        UnSuccessRegistration unSuccessRegistration = given()
                .body(user)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(UnSuccessRegistration.class);
        Assert.assertEquals("Missing password", unSuccessRegistration.getError());
    }

    @Test
    public void sortedYearsTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationOk200());
        List<ResourceData> colors = given()
                .when()
                .get("api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", ResourceData.class);
        List<Integer> years = colors.stream().map(ResourceData::getYear).collect(Collectors.toList());
        List<Integer> sortedYears = years.stream().sorted().collect(Collectors.toList());
        Assert.assertEquals(sortedYears, years);
        System.out.println(years);
        System.out.println(sortedYears);
    }

    @Test
    public void deleteUserTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecification(204));
        given()
                .when()
                .delete("api/users?page=2")
                .then().log().all();
    }

    @Test
    public void TimeTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationOk200());
        UserTime user = new UserTime("morpheus", "zion resident");
        UserTimeResponse response = given()
                .body(user)
                .when()
                .put("api/users/2")
                .then().log().all()
                .extract().as(UserTimeResponse.class);
        String regex = "\\..*$";
        String currentTime = Clock.systemUTC().instant().toString().replaceAll(regex, "");
        System.out.println(currentTime);
        Assert.assertEquals(currentTime, response.getUpdatedAt().replaceAll(regex, ""));
        System.out.println(response.getUpdatedAt().replaceAll(regex, ""));
    }


    @Test
    public void singleUserTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecification(200));
        given()
                .when()
                .get("api/users/2")
                .then().log().all();
    }

    @Test
    public void singleUserNotFoundTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecification(404));
        given()
                .when()
                .get("api/users/23")
                .then().log().all();
    }

    @Test
    public void delayedResponseTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationOk200());
        List<UserData> users = given()
                .when()
                .get("api/users?delay=3")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
        users.forEach(x -> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));
        Assert.assertTrue(users.stream().allMatch(x -> x.getEmail().endsWith("@reqres.in")));
        List<String> avatars = users.stream().map(UserData::getAvatar).collect(Collectors.toList());
        List<String> ids = users.stream().map(UserData::getAvatar).collect(Collectors.toList());
        for (int i = 0; i < avatars.size(); i++) {
            Assert.assertTrue(avatars.get(i).contains(ids.get(i)));
        }
    }

    @Test
    public void listUsersTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationOk200());
        given()
                .when()
                .get("api/users?page=2")
                .then().log().all();
    }

    @Test
    public void sortedColorTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationOk200());
        List<ResourceData> colors = given()
                .when()
                .get("api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", ResourceData.class);
        List<String> actualColors = colors.stream().map(ResourceData::getColor).collect(Collectors.toList());
        Assert.assertFalse(actualColors.contains("#53B0AEeee"));
        if (!actualColors.contains("#53B0AEeeee")) {
            System.out.println("Expected color is not present in the list!!!");
        }
        //The ! symbol before the actualColors.contains("#53B0AEeeee") expression is a logical NOT operator in Java. It negates the result of the contains() method, which returns true if the actualColors list contains the color "#53B0AEeeee", and false otherwise.
        //
        //So, the !actualColors.contains("#53B0AEeeee") expression will evaluate to true if the actualColors list does not contain the color "#53B0AEeeee", and false otherwise.
        //
        //In the context of the provided code, the if statement with the ! operator is checking whether the expected color is not present in the actual colors list, and if that's the case, it prints a message to the console.

    }

    @Test
    public void singleResourceTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationOk200());
        ResourceData resource = given()
                .when()
                .get("api/unknown/2")
                .then().log().all()
                .extract().body().jsonPath().getObject("data", ResourceData.class);
        Assert.assertTrue(resource.getColor().contains("#C74375"));
        if (resource.getColor().contains("#C74375")) {
            System.out.println("Expected color is here!!!");
        }
    }

    @Test
    public void singleResourceNotFoundTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecification(404));
        given()
                .when()
                .get("api/unknown/23")
                .then().log().all();
    }

    @Test
    public void createUsersTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecification(201));
        String name = "morpheus";
        String job = "leader";
        RequestUserData user = new RequestUserData("morpheus", "leader");
        SuccessCreateRequestUserData successCreateRequestUserData = given()
                .body(user)
                .when()
                .post("api/users")
                .then().log().all()
                .extract().as(SuccessCreateRequestUserData.class);
        Assert.assertNotNull(name);
        Assert.assertNotNull(job);

        Assert.assertEquals(name, successCreateRequestUserData.getName());
        Assert.assertEquals(job, successCreateRequestUserData.getJob());
    }

    @Test
    public void updateByPutUsersTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationOk200());
        String name = "morpheus";
        String job = "zion resident";
        RequestUserData user = new RequestUserData("morpheus", "zion resident");
        SuccessUpdateRequestUserData successUpdateRequestUserData = given()
                .body(user)
                .when()
                .put("api/users/2")
                .then().log().all()
                .extract().as(SuccessUpdateRequestUserData.class);
        Assert.assertNotNull(name);
        Assert.assertNotNull(job);

        Assert.assertEquals(name, successUpdateRequestUserData.getName());
        Assert.assertEquals(job, successUpdateRequestUserData.getJob());
    }

    @Test
    public void updateByPatchUsersTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationOk200());
        String name = "morpheus";
        String job = "zion resident";
        RequestUserData user = new RequestUserData("morpheus", "zion resident");
        SuccessUpdateRequestUserData successUpdateRequestUserData = given()
                .body(user)
                .when()
                .patch("api/users/2")
                .then().log().all()
                .extract().as(SuccessUpdateRequestUserData.class);
        Assert.assertNotNull(name);
        Assert.assertNotNull(job);

        Assert.assertEquals(name, successUpdateRequestUserData.getName());
        Assert.assertEquals(job, successUpdateRequestUserData.getJob());
    }

    @Test
    public void deleteUsersTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecification(204));
        given()
                .when()
                .delete("api/users/2")
                .then().log().all();
    }

    @Test
    public void successLoginTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationOk200());
        String token = "QpwL5tke4Pnpja7X4";
        Register user = new Register("eve.holt@reqres.in", "cityslicka");
        SuccessRegistration successRegistration = given()
                .body(user)
                .when()
                .post("api/login")
                .then().log().all()
                .extract().as(SuccessRegistration.class);
        Assert.assertNotNull(token);
        Assert.assertEquals(token, successRegistration.getToken());
    }


    @Test
    public void UnSuccessLoginTest() {
        Specification.installSpecification(Specification.requestSpecification(URL), Specification.responseSpecificationError400());
        String error = "Missing password";
        Register user = new Register("peter@klaven", "");
        UnSuccessRegistration unsuccessRegistration = given()
                .body(user)
                .when()
                .post("api/login")
                .then().log().all()
                .extract().as(UnSuccessRegistration.class);
        Assert.assertNotNull(error);
        Assert.assertEquals(error, unsuccessRegistration.getError());
    }

}



