package co.com.demoqa.stepsdefinitions;

import co.com.demoqa.questions.ValidatingSubmitSuccessTitle;
import co.com.demoqa.tasks.FormInteraction;
import co.com.demoqa.tasks.OpenTheBrowser;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class StudentFormStepDefinition {
    @Managed
    WebDriver hisBrowser;

    @Before
    public void sigUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Alex").can(BrowseTheWeb.with(hisBrowser));

    }
    @Given("I want to get an account in demo qa")
    public void iWantToGetAnAccountInDemoQa() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenTheBrowser.on());
    }

    @When("i type my personal information")
    public void iTypeMyPersonalInformation() {
        OnStage.theActorInTheSpotlight().attemptsTo(FormInteraction.typeData());
    }

    @Then("i should get an account")
    public void iShouldGetAnAccount() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidatingSubmitSuccessTitle.submitSuccessTitle(),
                        Matchers.is("Thanks for submitting the form"))
        );
    }

}
