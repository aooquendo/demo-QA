package co.com.demoqa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
       features = "src/test/resources/features/DemoQa_Student_Registration.feature",
        glue = "co/com/demoqa/stepsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class DemoQaRegistrationRunner {
}
