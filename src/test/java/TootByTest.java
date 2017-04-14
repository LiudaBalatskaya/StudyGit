import base.TestBase;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegisterPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by LiudaBalatskaya on 2/13/2015.
 */
public class TootByTest extends TestBase {
    @Test
    public static void TestMail() throws InterruptedException {
        Configuration.timeout = 10000; // 10 секунд
        open("https://www.tut.by/");
        $(By.id("mainmenu"));
        MainPage.goToRegisterPage();
        // 10 секунд

        $(By.id("body"));
        RegisterPage.enterName("blghome");
        RegisterPage.enterPassword("110953");
        RegisterPage.submitForm();
        Thread.sleep(10000);
    }

}
