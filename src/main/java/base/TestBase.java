package base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

/**
 * Created by LiudaBalatskaya on 2/12/2015.
 */

public class TestBase {
    @BeforeMethod
    public static void setup () throws MalformedURLException {
        Configuration.browser = System.getProperty("browser", "firefox");
    }
}
