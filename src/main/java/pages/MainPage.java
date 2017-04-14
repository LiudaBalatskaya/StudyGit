package pages;

import base.PageBase;
import org.openqa.selenium.By;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by LiudaBalatskaya on 2/13/2015.
 */
public class MainPage extends PageBase {
    /*
<a data-url-1="http://www.tut.by/resource/?id=10&ua=top_menu_www.tut.by%7E1#ua:top_menu_www.tut.by~1" title="Почта"
href="http://mail.tut.by/#ua:top_menu_www.tut.by~1">Почта</a>  */
    private static final By REGISTER_LINK = By.xpath("//a[@href='http://mail.tut.by/#ua:top_menu_www.tut.by~1']");

    public static String str;
    public static void goToRegisterPage() {
        $(REGISTER_LINK).click();

   //    str = $(REGISTER_LINK).getSelectedText().toString();
   //    System.out.println("REGISTER_LINK.getSelectedText()=" + str + "\n");
  //      $(REGISTER_LINK).pressEnter();//      // .click();.
    }

    public static void checkExpectedElements() {
        checkExpectedElements(Arrays.asList(new By[]{REGISTER_LINK}));
    }

}
