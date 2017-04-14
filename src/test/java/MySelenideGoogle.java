import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;


/**
 * Created by LiudaBalatskaya on 2/12/2015.
 */
public class MySelenideGoogle {

    @Test
    public void searchTestGoogle() throws InterruptedException {
        Configuration.timeout = 10000; // 10 секунд
        open("https://www.google.by/");
            $(By.name("q")).sendKeys("selenide");
        $(By.name("q")).submit();//pressEnter();
        $$("#ires li.g").shouldHave(size(10));

 //       $$("#ires li.g").shouldHave(size(5));
                                                    // проверяет элемент на заданные усовия
        $("#ires").find(By.linkText("Selenide: concise UI tests in Java")).shouldBe(Condition.visible);
        $(By.linkText("Selenide: concise UI tests in Java")).click();

        Thread.sleep(3000);

    }
}
