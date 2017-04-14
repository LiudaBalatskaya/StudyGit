package pages;

import base.PageBase;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by LiudaBalatskaya on 2/16/2015.
 */
public class RegisterPage extends PageBase {

    private static final By NAME_INPUT = By.cssSelector("input#Username.field");
    private static final By PASSWORD_INPUT = By.cssSelector("input#Password.field");
    private static final By SUBMIT_BUTTON = By.cssSelector("div.wrap.loginWrap");
    private static final By SUBMIT_BUTTON1 = By.cssSelector("input.button.loginButton.gradientforbutton");

    // html body div#container div#body div.book div.bookBody div.bookRight div.page form#form fieldset div.wrap.loginWrap
    // input.button.loginButton.gradientforbutton

    public static void enterName(String name) {
    $(NAME_INPUT).sendKeys(name);
}
    public static void enterPassword(String pass) {
        $(PASSWORD_INPUT).sendKeys(pass);
    }

    public static void submitForm() {
        $(SUBMIT_BUTTON).pressEnter();  //click();
        $(SUBMIT_BUTTON1).pressEnter();  //click();
    }

}
