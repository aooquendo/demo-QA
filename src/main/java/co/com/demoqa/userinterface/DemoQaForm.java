package co.com.demoqa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoQaForm {

    public static final Target TXT_NAME = Target.the("Type user name").located(By.id("firstName"));
    public static final Target TXT_LAST_NAME =Target.the("Type user last name").located(By.id("lastName"));
    public static final Target TXT_EMAIL = Target.the("Type de user email").located(By.id("userEmail"));
    public static final Target RADIO_GENRE = Target.the("Select the user genre").locatedBy("//*[@for='gender-radio-1'][@class='custom-control-label']");
    public static final Target TXT_NUMBER = Target.the("Type the user number phone").located(By.id("userNumber"));
    public static final Target TABLE_BIRTHDAY_DATE = Target.the("Select the birthday day").located(By.id("dateOfBirthInput"));
    public static final Target SELECT_BIRTHDAY_MONTH = Target.the("Select the birthday month").located(By.className("react-datepicker__month-select"));
    public static final Target SELECT_BIRTHDAY_YEAR = Target.the("Select the birthday year").located(By.className("react-datepicker__year-select"));
    //public static final Target SELECT_BIRTHDAY_DAY = Target.the("Select birthday day").locatedBy("//input[@id='dateOfBirthInput'][@value='15 Jun 1995']");
    public static final Target SELECT_BIRTHDAY_DAY = Target.the("Select birthday day").located(By.className("react-datepicker__week"));
    public static final Target TXT_SUBJECTS = Target.the("Type the subjects").locatedBy("//input[@id='subjectsInput']");
    public static final Target CHECK_BOX_HOBBIES = Target.the("Select hobbie").locatedBy("//*[@for='hobbies-checkbox-1'][@class='custom-control-label']");
    public static final Target TXT_ADDRESS = Target.the("Type the student address").located(By.id("currentAddress"));
    public static final Target INPUT_STATE = Target.the("Type the student state").locatedBy("//*[@id=\"react-select-3-input\"]");
    public static final Target INPUT_CITY = Target.the("Type the student city").locatedBy("//*[@id='react-select-4-input']");
    public static final Target DIV_TITLE = Target.the("Get a title of submit success").locatedBy("//*[@id='example-modal-sizes-title-lg']");
}
