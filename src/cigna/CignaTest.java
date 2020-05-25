package cigna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CignaTest {

    public static String url="https://www.cigna.com/";
    public static String url2="https://my.cigna.com/web/public/guest";


    public static void browsing() throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"includes-content\"]/header/div[2]/nav[3]/div/ul/li[1]/a")).click();
        WebElement we=driver.findElement(By.xpath("//*[@id=\"includes-content\"]/header/div[2]/nav[3]/div/ul/li[1]/a"));
        Thread.sleep(3000);

        if(we.isDisplayed()){
            System.out.println("We've found web element");
        }else {
            System.out.println("We've found web element");
        }
        driver.findElement(By.xpath("//*[@id=\"1549921108554\"]/div/div[1]/div[1]/div[2]/p/a")).click();
        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"register\"]")).click();
//        Thread.sleep(3000);

        driver.quit();


    }

    public static void main(String[] args) throws InterruptedException {

       // browsing();
        register();
    }


    public static void register() throws InterruptedException {

        WebDriver wd= new ChromeDriver();
        wd.navigate().to(url2);
        wd.findElement(By.xpath("//*[@id=\"register\"]")).click();
        Thread.sleep(3000);
        wd.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Sarker");
        Thread.sleep(3000);
        wd.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Rashid");
        Thread.sleep(3000);
        wd.findElement(By.xpath("/html/body/cg-app-root/cg-registration-layout/cg-register/main/div/ng-component/form/div[1]/div[1]/button")).click();
        Thread.sleep(3000);
        wd.findElement(By.xpath("//*[@id=\"month\"]")).click();
        Thread.sleep(3000);
//        wd.findElement(By.name("March")).click();
//        Thread.sleep(3000);
        wd.quit();



    }
}
