package interview;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class TakeScreenshot {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");

        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


        Thread.sleep(5000);
        driver.quit();


    }
}
