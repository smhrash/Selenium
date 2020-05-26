package selenium_hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBank {

    public static String url="https://www.key.com/personal/index.jsp";

    public static void browseKey() throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get(url);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='When and Why to Purchase Rental Car Insurance']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"footer\"]/div/div/div/div[1]/div/ul/li[5]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"btn-submit\"]")).click();

        Thread.sleep(3000);
        driver.quit();


    }

    public static void main(String[] args) throws InterruptedException {

        browseKey();

    }

}
