package Seleniumsession;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Registerpage {


    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\UsersData\\Simy\\Java Classes\\Seleniumsession\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");


        //Register page

        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Simy");
        driver.findElement(By.id("LastName")).sendKeys("Ghelani");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("12");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("March");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1991");
        driver.findElement(By.id("Email")).sendKeys("Testing123@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("Betway");
        driver.findElement(By.id("Newsletter")).sendKeys("Tickbox");
        driver.findElement(By.id("Password")).sendKeys("Smita09");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Smita09");
        driver.findElement(By.id("register-button")).click();










    }


}