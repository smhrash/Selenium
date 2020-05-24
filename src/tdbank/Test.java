package tdbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {


    public static String url="https://www.td.com/";

    public static void figureOut() throws InterruptedException {

        ChromeDriver driver=new ChromeDriver();

        driver.navigate().to(url);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/section[11]/div/div/ul/li[2]/div[2]/h3")).click();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/header[1]/div[3]/div/div[2]/div/ul/li[3]/a/span[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/header[1]/div[3]/div/div[3]/div/header-search-input/form/input[1]")).sendKeys("Student loan");
        Thread.sleep(3000);
        String currentUrl = driver.getCurrentUrl();

        System.out.println("The current url is: "+currentUrl);
        driver.quit();

    }
    public static void main(String[] args) throws InterruptedException {

       figureOut();


    }


}
