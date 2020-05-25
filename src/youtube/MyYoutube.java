package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyYoutube {

    public static String url = "https://www.youtube.com/";

    public static void watchVideo() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        try {
            WebElement we = driver.findElement(By.xpath("//*[contains(text(),'GOLD DIGGER PRANK PART 15! | HoomanTV')]"));
            System.out.println("web element is available");

        } catch (Exception e) {
            System.out.println("wed element is not available");
        }


        driver.quit();

    }

    public static void main(String[] args) throws InterruptedException {

        watchVideo();
    }

}
