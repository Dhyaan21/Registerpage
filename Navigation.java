package Seleniumsession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//  1.Chrome
    public class Navigation  {
        public static void main (String[] args)throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\UsersData\\Simy\\Java Classes\\Seleniumsession\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();


        driver.get("https://demo.nopcommerce.com/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.navigate().forward();
        System.out.println(driver.getTitle());

        driver.navigate().back();
        System.out.println(driver.getTitle());
        Thread.sleep(6000);

        driver.quit();


    }
    }