package co.com.demoqa.tasks;

import co.com.demoqa.userinterface.DemoQaForm;
import jxl.demo.Demo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ClickInteraction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FormInteraction implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Alex").into(DemoQaForm.TXT_NAME),
                Enter.theValue("Oquendo").into(DemoQaForm.TXT_LAST_NAME),
                Enter.theValue("alex@email.com").into(DemoQaForm.TXT_EMAIL),
                Click.on(DemoQaForm.RADIO_GENRE),
                Enter.theValue("4758937375743353757").into(DemoQaForm.TXT_NUMBER),
                Click.on(DemoQaForm.TABLE_BIRTHDAY_DATE).then(Hit.the(Keys.ARROW_DOWN).keyIn(DemoQaForm.TABLE_BIRTHDAY_DATE).then(SelectFromOptions.byVisibleText("June").from(DemoQaForm.TABLE_BIRTHDAY_DATE))),
                Click.on(DemoQaForm.SELECT_BIRTHDAY_MONTH),
                Click.on(DemoQaForm.SELECT_BIRTHDAY_YEAR),
                Click.on(DemoQaForm.SELECT_BIRTHDAY_DAY),
                Enter.theValue("Maths").into(DemoQaForm.TXT_SUBJECTS).thenHit(Keys.ENTER),
                Click.on(DemoQaForm.CHECK_BOX_HOBBIES),
                Enter.theValue("calle siempre viva").into(DemoQaForm.TXT_ADDRESS)
        );
    }

    public static FormInteraction typeData(){
        return instrumented(FormInteraction.class);
    }
}
