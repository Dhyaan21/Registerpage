package Seleniumsession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsHomework {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\UsersData\\Simy\\Java Classes\\Seleniumsession\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");
        

        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("dobariya.smita887@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Smita09");
        driver.findElement(By.className("buttons")).click();

        driver.quit();
       // driver.close();






    }
}
