package selenium_hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableLamp {

    public static String url="https://www.amazon.com/";

    public static void searchTableLamp() throws InterruptedException {

        WebDriver driver= new ChromeDriver();
       // driver.get(url);
        driver.navigate().to(url);
        driver.manage().window().fullscreen();
        Thread.sleep(3000); // to stay a moment like 3 seconds

        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Table Lamp");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        Thread.sleep(3000);
        driver.quit(); // to quit all driver


    }

    public static void main(String[] args) throws InterruptedException {
        searchTableLamp();
    }
}
