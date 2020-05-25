package yahoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mail {

    public static String url = "https://www.yahoo.com/";

    public static void signUp() throws InterruptedException {

        WebDriver wd = new ChromeDriver();
        wd.navigate().to(url);
        Thread.sleep(3000);
        wd.manage().window().fullscreen();
        wd.findElement(By.xpath("//*[@id=\"header-search-input\"]")).sendKeys("mail.yahoo.com");
        Thread.sleep(3000);
        wd.findElement(By.xpath("//*[@id=\"header-desktop-search-button\"]")).click();
        Thread.sleep(3000);
        wd.findElement(By.cssSelector("#web > ol > li.first > div > div.compList.mt-16.td-hn.ov-h.w-576 > ul:nth-child(1) > li:nth-child(2) > a")).click();
        Thread.sleep(3000);
        wd.manage().window().fullscreen();
        Thread.sleep(3000);


        wd.quit();


    }

    public static void main(String[] args) throws InterruptedException {

        signUp();
    }


}
