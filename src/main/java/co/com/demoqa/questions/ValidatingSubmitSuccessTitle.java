package co.com.demoqa.questions;

import co.com.demoqa.userinterface.DemoQaForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidatingSubmitSuccessTitle implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(DemoQaForm.DIV_TITLE).viewedBy(actor).asString();
    }

    public static ValidatingSubmitSuccessTitle submitSuccessTitle(){
        return new ValidatingSubmitSuccessTitle();
    }
}
