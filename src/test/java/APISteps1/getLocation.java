package APISteps1;

import io.restassured.response.Response;
import org.json.JSONObject;

import static APISteps1.getCharacter.charId;
import static io.restassured.RestAssured.given;

public class getLocation {
    public static String mortyLocation;
    public static String lastCharLocation;
    public static void getMortyLocation()
    {
        Response gettingChar = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" +charId)
                .then()
                .extract()
                .response();
        mortyLocation = (new JSONObject(gettingChar.getBody().asString()).get("location").toString());
        System.out.println("Местоположение Morty: " + mortyLocation);
    }
    public static void getLastCharacterLocation(int id)
    {
        Response gettingChar = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" +id)
                .then()
                .extract()
                .response();
        lastCharLocation = (new JSONObject(gettingChar.getBody().asString()).get("location").toString());
        System.out.println("Местоположение последнего персонажа: " + lastCharLocation);
    }
}
