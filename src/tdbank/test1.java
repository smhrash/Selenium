package tdbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

    public static String url ="https://www.td.com/";

    public static void testing() throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.navigate().to(url);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"td-desktop-nav-dropdown-link-3\"]")).click();
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/header[1]/div[3]/div/div[1]/nav/ul/li[1]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"question\"]")).sendKeys("Can I open a new account online");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"main\"]/question/div/question-input/section/div/div/div/div/form/div[2]/button")).click();
        Thread.sleep(5000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        testing();
    }


}

