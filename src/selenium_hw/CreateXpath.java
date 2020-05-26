package selenium_hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateXpath {

     /*
     Test Case 1 - Login
        1. Open browser
        2. Navigate to "https://opensource-demo.orangehrmlive.com/"
        3. Log in (Username: Admin | PW: admin123)
     */

    public static String url="https://opensource-demo.orangehrmlive.com";

    public static void useXpath() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        //driver.get(url);
        driver.navigate().to(url);
        driver.findElement(By.xpath("//input[@type='text'][@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@type='password'][@name='txtPassword']")).sendKeys("admin123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='submit'][@name='Submit']")).click();
        Thread.sleep(3000);
        driver.quit();


    }

    public static void main(String[] args) throws InterruptedException {
        useXpath();
    }


}
