package co.com.demoqa.stepsdefinitions;

import co.com.demoqa.tasks.FormInteraction;
import co.com.demoqa.tasks.OpenTheBrowser;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StudentFormStepDefinition {
    @Managed
    WebDriver hisBrowser;

    @Before
    public void sigUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Alex").can(BrowseTheWeb.with(hisBrowser));
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenTheBrowser.on());
    }
    @Given("I want to get an account in demo qa")
    public void iWantToGetAnAccountInDemoQa() {
        OnStage.theActorInTheSpotlight().attemptsTo(FormInteraction.typeData());
    }

    @When("i type my personal information")
    public void iTypeMyPersonalInformation() {
    }

    @Then("i should get an account")
    public void iShouldGetAnAccount() {
    }

}
