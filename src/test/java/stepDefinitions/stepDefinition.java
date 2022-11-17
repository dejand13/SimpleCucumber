package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
public class stepDefinition {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("Given -> has been executed");
    }

    @When("User login into application with username {string} and password {string}")
    public void user_login_into_application_with_username_and_password(String user, String pass) {
        System.out.println("When -> has been executed. Here are the username used "+user+ " and the pass " +pass);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("Then -> has been executed");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        System.out.println("And -> has been executed");
    }

}