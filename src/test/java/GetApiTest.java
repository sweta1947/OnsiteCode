import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.containsString;

import org.testng.annotations.Test;

public class GetApiTest {

    @Test
    public void test_3(String username, String job_id) {


        given()
                .param("username", "jsmith")
                .param("job_id", job_id)
                .get("https://rest/v1/{username}/jobs/{job_id}")
                .then()
                .statusCode(200)
                .body(containsString("Jason"));
    }
}
