package indication.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HelloWorldSteps {
    @When("^I try create a cucumber test$")
    public void I_try_create_a_cucumber_test() throws Throwable {
        System.out.println("try try try...");
    }

    @Then("^Cucumber test runner$")
    public void Cucumber_test_runner() throws Throwable {
        System.out.println("Test... running");
    }
}
