package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        Actions action = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");

        //Locate Cube
        WebElement cube = driver.findElement(By.id("wrapD3Cube"));

        //Left click
        action.click(cube);
        WebElement cVal = driver.findElement(By.className("active"));
        System.out.println("Left Click: " + cVal.getText());


        //Double click
        action.doubleClick(cube).perform();
        cVal = driver.findElement(By.className("active"));
        System.out.println("Double Click: " + cVal.getText());


        //Right click
        action.contextClick(cube).perform();
        cVal = driver.findElement(By.className("active"));
        System.out.println("Right Click: " + cVal.getText());

        //Close browser
        driver.close();

    }
}
