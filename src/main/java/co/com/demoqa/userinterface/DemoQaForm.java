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
    public static final Target SELECT_BIRTHDAY_MONTH = Target.the("Select the birthday month").locatedBy("//*[contains(@class,'react-datepicker__month-select')]");
    public static final Target SELECT_BIRTHDAY_YEAR = Target.the("Select the birthday year").located(By.className("react-datepicker__year-select"));
    public static final Target SELECT_BIRTHDAY_DAY = Target.the("Select birthday day").located(By.className("react-datepicker__week"));
    public static final Target TXT_SUBJECTS = Target.the("Type the subjects").locatedBy("//input[@id='subjectsInput']");
    public static final Target CHECK_BOX_HOBBIES = Target.the("Select hobbie").locatedBy("//*[@for='hobbies-checkbox-1'][@class='custom-control-label']");
    public static final Target TXT_ADDRESS = Target.the("Type the student address").located(By.id("currentAddress"));

}
