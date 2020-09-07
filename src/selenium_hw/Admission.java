package selenium_hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Admission {

    public static String url = "https://www.aub.edu.bd/";
    public static String url2 = "http://182.48.65.202:8080/e-admission/applicant/apply";

    public static void submitForm() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);

        Thread.sleep(3000);// for staying a moment like 3 seconds

        driver.manage().window().fullscreen(); // for maximise windows
        Thread.sleep(3000);


        driver.findElement(By.xpath("/html/body/div[5]/div[2]/aside/div[1]/a/div/h3")).click();


        Thread.sleep(5000);

        driver.quit(); // to quit all drivers
    }

    public static void main(String[] args) throws InterruptedException {

        // submitForm();
        formFillUp();
    }

    public static void formFillUp() throws InterruptedException {

        WebDriver wd = new ChromeDriver();
        wd.navigate().to(url2);
        Thread.sleep(3000);
        wd.findElement(By.xpath("//*[@id=\"dataLookupProgramTypeId\"]")).click();
        // handling dropdown menu
        WebElement dropdown3 = wd.findElement(By.xpath("//*[@id=\"dataLookupProgramTypeId\"]"));
        Select selectDropdown3 = new Select(dropdown3);
        // figuring out how many options is there
        System.out.println(selectDropdown3.getOptions().size());
        List<WebElement> dropdownOptions3 = selectDropdown3.getOptions();
        for (WebElement e : dropdownOptions3) {
            System.out.println(e.getText());
        }
        selectDropdown3.selectByVisibleText("Masters");
        Thread.sleep(3000);
        wd.findElement(By.xpath("//*[@id=\"programId\"]")).click();
        // handling dropdown menu
        WebElement dropdown4 = wd.findElement(By.xpath("//*[@id=\"programId\"]"));
        Select selectDropdown4 = new Select(dropdown4);
        // figuring out how many options is there
        System.out.println(selectDropdown4.getOptions().size());
        List<WebElement> dropdownOptions4 = selectDropdown4.getOptions();
        for (WebElement e : dropdownOptions4) {
            System.out.println(e.getText());
        }
        selectDropdown4.selectByVisibleText("MBA(EXE) - Master of Business Administration");


        Thread.sleep(3000);
        wd.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("sjjjhjk@gmail.com");
        Thread.sleep(3000);
        wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd1234");
        wd.findElement(By.xpath("//*[@id=\"confirmPassword\"]")).sendKeys("abcd1234");


        Thread.sleep(3000);

        wd.findElement(By.xpath("//input[@type='text'][@name='firstName']")).sendKeys("Arif Rahman");
        Thread.sleep(3000);
        wd.findElement(By.xpath("//input[@type='text'][@name='fathersName']")).sendKeys("Mizanur Rahman");
        Thread.sleep(3000);
        wd.findElement(By.xpath("//input[@type='text'][@name='mothersName']")).sendKeys("Hena Rahman");
        Thread.sleep(3000);
        wd.findElement(By.xpath("//*[@id=\"permanentCountryId\"]")).click();
        Thread.sleep(3000);
        // handling dropdown menu
        WebElement dropdown = wd.findElement(By.xpath("//*[@id=\"permanentCountryId\"]"));
        Select selectDropdown = new Select(dropdown);
        // figuring out how many options is there
        System.out.println(selectDropdown.getOptions().size());
        List<WebElement> dropdownOptions = selectDropdown.getOptions();
        for (WebElement e : dropdownOptions) {
            System.out.println(e.getText());
        }
        selectDropdown.selectByVisibleText("United States");
        Thread.sleep(3000);

        wd.findElement(By.xpath("//*[@id=\"contactNumber\"]")).sendKeys("3472225555");
        Thread.sleep(3000);
        wd.findElement(By.xpath("//*[@id=\"gender\"]")).click();
        // handling dropdown menu
        WebElement dropdown1 = wd.findElement(By.xpath("//*[@id=\"gender\"]"));
        Select selectDropdown1 = new Select(dropdown1);
        // figuring out how many options is there
        System.out.println(selectDropdown1.getOptions().size());
        List<WebElement> dropdownOptions1 = selectDropdown1.getOptions();
        for (WebElement e : dropdownOptions1) {
            System.out.println(e.getText());
        }

        selectDropdown1.selectByVisibleText("Male");
        Thread.sleep(3000);


        wd.findElement(By.xpath("//*[@id=\"academicHistories[0].examId\"]")).click();
        // handling dropdown menu
        WebElement dropdown6 = wd.findElement(By.xpath("//*[@id=\"academicHistories[0].examId\"]"));
        Select selectDropdown6 = new Select(dropdown6);
        // figuring out how many options is there
        System.out.println(selectDropdown6.getOptions().size());
        List<WebElement> dropdownOptions6 = selectDropdown6.getOptions();
        for (WebElement e : dropdownOptions6) {
            System.out.println(e.getText());
        }

        selectDropdown6.selectByVisibleText("O-Level");
        Thread.sleep(3000);



        wd.findElement(By.xpath("//*[@id=\"academicHistories[0].passingYear\"]")).sendKeys("2001");
        wd.findElement(By.xpath("//*[@id=\"academicHistories[0].resultSystem\"]")).click();
        // handling dropdown menu
        WebElement dropdown7 = wd.findElement(By.xpath("//*[@id=\"academicHistories[0].resultSystem\"]"));
        Select selectDropdown7 = new Select(dropdown7);
        // figuring out how many options is there
        System.out.println(selectDropdown7.getOptions().size());
        List<WebElement> dropdownOptions7 = selectDropdown7.getOptions();
        for (WebElement e : dropdownOptions7) {
            System.out.println(e.getText());
        }
        selectDropdown7.selectByVisibleText("Grading");

        wd.findElement(By.xpath("//*[@id=\"academicHistories[0].gradePoint\"]")).sendKeys("5");
        Thread.sleep(3000);


        wd.findElement(By.xpath("//*[@id=\"academicHistories[1].examId\"]")).click();
        // handling dropdown menu
        WebElement dropdown8 = wd.findElement(By.xpath("//*[@id=\"academicHistories[1].examId\"]"));
        Select selectDropdown8 = new Select(dropdown8);
        // figuring out how many options is there
        System.out.println(selectDropdown8.getOptions().size());
        List<WebElement> dropdownOptions8 = selectDropdown8.getOptions();
        for (WebElement e : dropdownOptions8) {
            System.out.println(e.getText());
        }

        selectDropdown8.selectByVisibleText("A-Level");
        Thread.sleep(3000);



        wd.findElement(By.xpath("//*[@id=\"academicHistories[1].passingYear\"]")).sendKeys("2003");
        wd.findElement(By.xpath("//*[@id=\"academicHistories[1].resultSystem\"]")).click();
        // handling dropdown menu
        WebElement dropdown9 = wd.findElement(By.xpath("//*[@id=\"academicHistories[1].resultSystem\"]"));
        Select selectDropdown9 = new Select(dropdown9);
        // figuring out how many options is there
        System.out.println(selectDropdown9.getOptions().size());
        List<WebElement> dropdownOptions9 = selectDropdown9.getOptions();
        for (WebElement e : dropdownOptions9) {
            System.out.println(e.getText());
        }

        selectDropdown9.selectByVisibleText("Grading");
        wd.findElement(By.xpath("//*[@id=\"academicHistories[1].gradePoint\"]")).sendKeys("5");
        Thread.sleep(3000);

        wd.findElement(By.xpath("//*[@id=\"academicHistories[2].examId\"]")).click();
        // handling dropdown menu
        WebElement dropdown10 = wd.findElement(By.xpath("//*[@id=\"academicHistories[2].examId\"]"));
        Select selectDropdown10 = new Select(dropdown10);
        // figuring out how many options is there
        System.out.println(selectDropdown10.getOptions().size());
        List<WebElement> dropdownOptions10 = selectDropdown10.getOptions();
        for (WebElement e : dropdownOptions10) {
            System.out.println(e.getText());
        }

        selectDropdown10.selectByVisibleText("Bachelor");
        Thread.sleep(3000);



        wd.findElement(By.xpath("//*[@id=\"academicHistories[2].passingYear\"]")).sendKeys("2007");
        wd.findElement(By.xpath("//*[@id=\"academicHistories[2].resultSystem\"]")).click();
        // handling dropdown menu
        WebElement dropdown11 = wd.findElement(By.xpath("//*[@id=\"academicHistories[2].resultSystem\"]"));
        Select selectDropdown11 = new Select(dropdown11);
        // figuring out how many options is there
        System.out.println(selectDropdown11.getOptions().size());
        List<WebElement> dropdownOptions11 = selectDropdown11.getOptions();
        for (WebElement e : dropdownOptions11) {
            System.out.println(e.getText());
        }

        selectDropdown11.selectByVisibleText("Grading");
        wd.findElement(By.xpath("//*[@id=\"academicHistories[2].gradePoint\"]")).sendKeys("3.9");
        Thread.sleep(3000);






        wd.quit();

    }

}
