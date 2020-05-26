package selenium_hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.LinkedList;
import java.util.List;

public class FormFillUp {

    public static String url = "https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407";

    public static void formFill() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Sarker");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("Rashid");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]")).sendKeys("33322225555");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#RESULT_TextField-4")).sendKeys("USA");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")).sendKeys("Queens");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#RESULT_TextField-6")).sendKeys("sdgssh@gmail.com");
        Thread.sleep(3000);

        WebElement maleRadio = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
        System.out.println(maleRadio.isDisplayed());

        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();//Custom xpath
        Thread.sleep(3000);

        driver.findElement(By.xpath("//label[contains(text(),'Monday')]")).click();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//label[contains(text(),'Tuesday')]")).click();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//label[contains(text(),'Wednesday')]")).click();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//label[contains(text(),'Thursday')]")).click();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//label[contains(text(),'Friday')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]")).click();
        Thread.sleep(3000);
        WebElement select = driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]"));
        System.out.println(select.getText());
        Thread.sleep(3000);

        driver.quit();


    }

    public static void main(String[] args) throws InterruptedException {

        formFill();
    }


}
