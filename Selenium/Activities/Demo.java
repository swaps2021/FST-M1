package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        //Open the browser
        driver.get("https://google.com");
        //Close driver
        driver.close();
    }
}
