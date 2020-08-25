package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver driver;

    public static WebDriver GetDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        if(driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void goToURL(String url){
        driver.get(url);
    }


}
