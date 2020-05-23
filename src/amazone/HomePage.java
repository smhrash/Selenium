package amazone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    // Relative path:BrowserDriver/mac/chromedriver
    // Absolute path:/Users/user/IdeaProjects/Selenium/BrowserDriver/mac/chromedriver
    //It's better to work with relative path

    public static WebDriver driver = new ChromeDriver();
    public static String chromeDriver = "webdriver.chrome.driver";
    public static String chromeDriverPath = "BrowserDriver/mac/chromedriver";
    public static String url = "https://www.amazon.com/";


    public static void setUp(String browserDriver, String driverPath, String url){

        System.setProperty(browserDriver, driverPath);


        //driver.get("https://www.amazon.com/");
        driver.navigate().to(HomePage.url);
        driver.manage().window().fullscreen();

    }
    public static void main(String[] args) throws InterruptedException {

        // Test Case: search Hand Sanitizer in the search box
        // Open Browser and navigate to URL
        setUp(chromeDriver,chromeDriverPath,url);
        //Enter keyword in search box
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Hand Sanitizer");
       Thread.sleep(10000);
       // click search button
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        Thread.sleep(10000);

        String title = driver.getTitle();
        System.out.println(title);

      //  String currentUrl = driver.getCurrentUrl();
       // System.out.println(currentUrl);

        //driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Computer");


        // close the running windows only
//        driver.close();
        // close all the open windows
        driver.quit();

    }

}
