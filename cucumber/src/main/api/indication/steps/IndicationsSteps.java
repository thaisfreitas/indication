package indication.steps;

import com.jayway.restassured.response.Response;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.jayway.restassured.RestAssured.given;

public class IndicationsSteps {

    private Response response;

    @Given("^I have an access to the system$")
    public void I_have_an_access_to_the_system() throws Throwable {
    }

    @When("^I submit a new valid indication information$")
    public void I_submit_a_new_valid_indication_information() throws Throwable {
        response = given().
                contentType("application/json").
                when().
                get("/");
    }

    @Then("^The system should return a success message$")
    public void The_system_should_return_a_success_message() throws Throwable {
        response.then().statusCode(200);
    }

}
