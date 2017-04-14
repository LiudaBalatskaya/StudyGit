package base;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by LiudaBalatskaya on 2/13/2015.
 */
public class PageBase {
    protected static void checkExpectedElements(List<By> elements) {
        for (By element : elements) {
            $(element).shouldBe(Condition.visible);
        }
    }

}
