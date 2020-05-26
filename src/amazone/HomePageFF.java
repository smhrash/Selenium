package amazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageFF {

    public static void main(String[] args) throws InterruptedException {


        String firefoxDriver = "webDiver.gecko.driver";
        String firefoxDriverPath = "BrowserDriver/mac/geckodriver";

        System.setProperty(firefoxDriver,firefoxDriverPath);

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("USB adopter for mac computer");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[4]/div[2]/div[5]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img")).click();

        Thread.sleep(3000);

    }
}