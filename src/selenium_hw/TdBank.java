package selenium_hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TdBank {

    public static String url = "https://www.td.com/us/en/personal-banking/";

    public static void browseTD() throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.navigate().to(url);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"drag-id-tabsCarousel0\"]/div/li[3]/div[1]/span/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[3]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/section[4]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[3]/div[1]/h3[1]/a[1]\t")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"aBanner0\"]/div/div/div/div/div/button")).click();
        Thread.sleep(3000);
        driver.quit();

    }

    public static void main(String[] args) throws InterruptedException {

        browseTD();
    }
}
