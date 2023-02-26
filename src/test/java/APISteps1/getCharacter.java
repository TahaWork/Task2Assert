package APISteps1;

import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import static io.restassured.RestAssured.given;

public class getCharacter {
    public static int charId;
    public static void getCharacter(String name)
    {
        Response gettingChar = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" )
                .then()
                .extract()
                .response();
        int charNumber = (new JSONObject(gettingChar.getBody().asString()).getJSONArray("results").length()-1);
        charId = -1;
        for (int i = 0; i < charNumber; i++) {

            String charName = new JSONObject(gettingChar.getBody().asString()).getJSONArray("results")
                    .getJSONObject(i).get("name").toString();

            if (charName.equals(name))
            { charId = i+1; break; }
        }
        Assert.assertNotEquals("Персонаж не найден " , -1, charId);
        System.out.println(name+ " ID = " +charId);

    }
}
