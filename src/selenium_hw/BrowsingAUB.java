package selenium_hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BrowsingAUB {

    public static String url="https://www.aub.edu.bd/";
    public static String url1="http://182.48.65.202:8080/e-admission/applicant/apply";


    public  static void searchForm() throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[5]/div[2]/aside/div[1]/a/div/h3")).click();
        Thread.sleep(3000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        //searchForm();
        fillUpForm();
    }
    public static void fillUpForm() throws InterruptedException {

        WebDriver wd= new ChromeDriver();
        wd.navigate().to(url1);
        wd.manage().window().fullscreen();
        wd.findElement(By.xpath("//*[@id=\"dataLookupProgramTypeId\"]")).click();
        // Handling Dropdown menu
        WebElement dropdown=wd.findElement(By.xpath("//*[@id=\"dataLookupProgramTypeId\"]"));
        Select selectDropdown=new Select(dropdown);
        // Figuring out how many drop down are there
        System.out.println(selectDropdown.getOptions().size());
        List<WebElement> dropdownOption= selectDropdown.getOptions();
        for (WebElement e :dropdownOption){
            System.out.println(e.getText());

        }
        selectDropdown.selectByVisibleText("Masters"); wd.findElement(By.xpath("//*[@id=\"dataLookupProgramTypeId\"]")).click();
        Thread.sleep(1000);
        wd.findElement(By.xpath("//*[@id=\"programId\"]")).click();
        // Handling Dropdown menu
        WebElement dropdown1=wd.findElement(By.xpath("//*[@id=\"programId\"]"));
        Select selectDropdown1=new Select(dropdown1);
        // Figuring out how many drop down are there
        System.out.println(selectDropdown1.getOptions().size());
        List<WebElement> dropdownOption1= selectDropdown1.getOptions();
        for (WebElement e :dropdownOption1){
            System.out.println(e.getText());

        }
        selectDropdown1.selectByVisibleText("MBA(EXE) - Master of Business Administration");
        Thread.sleep(2000);


        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("arif@gmail.com");
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd1234");
        wd.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys("abcd1234");
        Thread.sleep(3000);

        wd.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Arif Rahman");
        Thread.sleep(2000);
        wd.findElement(By.cssSelector("#fathersName")).sendKeys("Mizanur Rahman");
        wd.findElement(By.xpath("//*[@id=\"mothersName\"]")).sendKeys("Mouly Rahman");
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"permanentCountryId\"]")).click();
        // Handling Dropdown menu
        WebElement dropdown2=wd.findElement(By.xpath("//*[@id=\"permanentCountryId\"]"));
        Select selectDropdown2=new Select(dropdown2);
        // Figuring out how many drop down are there
        System.out.println(selectDropdown2.getOptions().size());
        List<WebElement> dropdownOption2= selectDropdown2.getOptions();
        for (WebElement e :dropdownOption2){
            System.out.println(e.getText());

        }
        selectDropdown2.selectByVisibleText("United States");
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"contactNumber\"]")).sendKeys("347-333-5555");
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"gender\"]")).click();
        // Handling Dropdown menu
        WebElement dropdown3=wd.findElement(By.xpath("//*[@id=\"gender\"]"));
        Select selectDropdown3=new Select(dropdown3);
        // Figuring out how many drop down are there
        System.out.println(selectDropdown3.getOptions().size());
        List<WebElement> dropdownOption3= selectDropdown3.getOptions();
        for (WebElement e :dropdownOption3){
            System.out.println(e.getText());

        }
        selectDropdown3.selectByVisibleText("Male");
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"academicHistories[0].examId\"]")).click();
        // Handling Dropdown menu
        WebElement dropdown4=wd.findElement(By.xpath("//*[@id=\"academicHistories[0].examId\"]"));
        Select selectDropdown4=new Select(dropdown4);
        // Figuring out how many drop down are there
        System.out.println(selectDropdown4.getOptions().size());
        List<WebElement> dropdownOption4= selectDropdown4.getOptions();
        for (WebElement e :dropdownOption4){
            System.out.println(e.getText());

        }
        selectDropdown4.selectByVisibleText("O-Level");
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"academicHistories[0].passingYear\"]")).sendKeys("2001");
        wd.findElement(By.xpath("//*[@id=\"academicHistories[0].resultSystem\"]")).click();
        // Handling Dropdown menu
        WebElement dropdown5=wd.findElement(By.xpath("//*[@id=\"academicHistories[0].resultSystem\"]"));
        Select selectDropdown5=new Select(dropdown5);
        // Figuring out how many drop down are there
        System.out.println(selectDropdown5.getOptions().size());
        List<WebElement> dropdownOption5= selectDropdown5.getOptions();
        for (WebElement e :dropdownOption5){
            System.out.println(e.getText());

        }
        selectDropdown5.selectByVisibleText("Grading");
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"academicHistories[0].gradePoint\"]")).sendKeys("5");
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"academicHistories[1].examId\"]")).click();
        // Handling Dropdown menu
        WebElement dropdown7=wd.findElement(By.xpath("//*[@id=\"academicHistories[1].examId\"]"));
        Select selectDropdown7=new Select(dropdown7);
        // Figuring out how many drop down are there
        System.out.println(selectDropdown7.getOptions().size());
        List<WebElement> dropdownOption7= selectDropdown7.getOptions();
        for (WebElement e :dropdownOption7){
            System.out.println(e.getText());

        }
        selectDropdown7.selectByVisibleText("");
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"academicHistories[1].passingYear\"]")).sendKeys("2003");
        wd.findElement(By.xpath("//*[@id=\"academicHistories[1].resultSystem\"]")).click();
        // Handling Dropdown menu
        WebElement dropdown8=wd.findElement(By.xpath("//*[@id=\"academicHistories[1].resultSystem\"]"));
        Select selectDropdown8=new Select(dropdown8);
        // Figuring out how many drop down are there
        System.out.println(selectDropdown8.getOptions().size());
        List<WebElement> dropdownOption8= selectDropdown8.getOptions();
        for (WebElement e :dropdownOption8){
            System.out.println(e.getText());

        }
        selectDropdown8.selectByVisibleText("A-Level");
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"academicHistories[1].gradePoint\"]")).sendKeys("5");
        Thread.sleep(2000);




        wd.findElement(By.xpath("//*[@id=\"academicHistories[1].obtainedClass\"]")).click();
        // Handling Dropdown menu
        WebElement dropdown6=wd.findElement(By.xpath("//*[@id=\"academicHistories[1].obtainedClass\"]"));
        Select selectDropdown6=new Select(dropdown6);
        // Figuring out how many drop down are there
        System.out.println(selectDropdown6.getOptions().size());
        List<WebElement> dropdownOption6= selectDropdown6.getOptions();
        for (WebElement e :dropdownOption6){
            System.out.println(e.getText());

        }
        selectDropdown6.selectByVisibleText("First Class");
        Thread.sleep(2000);



        wd.quit();
    }

}
