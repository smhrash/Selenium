package amazone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageFF {

    public static void main(String[] args) {


        String firefoxDriver = "webDiver.gecko.driver";
        String firefoxDriverPath = "BrowserDriver/mac/geckodriver";

        System.setProperty(firefoxDriver,firefoxDriverPath);

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");

    }
}