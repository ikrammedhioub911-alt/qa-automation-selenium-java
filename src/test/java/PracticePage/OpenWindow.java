package PracticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenWindow {
    public static class Window {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver=new ChromeDriver();
            //maximise chrome
            driver.manage().window().maximize();
            //Open practice page;
            driver.get("https://www.letskodeit.com/practice");
            //open window;
            WebElement ClickMe =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div/div[1]/div[3]/fieldset/button"));
            Actions action = new Actions(driver);
            action.click(ClickMe).perform();
            // execution for 5 second
            Thread.sleep(5000);
        }
    }
}
