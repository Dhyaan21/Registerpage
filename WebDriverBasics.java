package Seleniumsession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

      //  1.Chrome
       public class WebDriverBasics {
       public static void main(String[] args) throws InterruptedException {
        // System.setProperty("webdriver.chrome.driver","C:\\UsersData\\Simy\\Java Classes\\Seleniumsession\\chromedriver_win32\\chromedriver.exe");

       //  WebDriver driver = new ChromeDriver();

         //driver.manage().deleteAllCookies();
        // driver.manage().window().maximize();

        //2.Edge

         //System.setProperty("webdriver.edge.driver","C:\\UsersData\\Simy\\Java Classes\\Seleniumsession\\edgedriver_win64\\msedgedriver.exe");

        // WebDriver driver = new EdgeDriver();

         //driver.manage().deleteAllCookies();
         //driver.manage().window().maximize();

         // 3.Firefox
        // System.setProperty("webdriver.gecko.driver","C:\\UsersData\\Simy\\Java Classes\\Seleniumsession\\geckodriver-v0.30.0-win64\\geckodriver.exe");

        // WebDriver driver = new FirefoxDriver();

           // driver.manage().deleteAllCookies();
           // driver.manage().window().maximize();
           // driver.close();

         //4. Opera

           System.setProperty("webdriver.opera.driver","C:\\UsersData\\Simy\\Java Classes\\Seleniumsession\\operadriver_win64\\operadriver.exe");
           WebDriver driver = new OperaDriver();

           driver.manage().deleteAllCookies();
           driver.manage().window().maximize();
           Thread.sleep(3000);



     }

}
