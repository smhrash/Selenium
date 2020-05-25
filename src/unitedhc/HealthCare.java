package unitedhc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HealthCare {

    public static String url="https://dsnp.uhccommunityplan.com/content/cns/dsnp/uhccommunityplan-dsnp/en/call/ny/_jcr_content/root/masthead/";

    public static void browsing() throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.quit();


    }

    public static void main(String[] args) throws InterruptedException {

        browsing();
    }
}
