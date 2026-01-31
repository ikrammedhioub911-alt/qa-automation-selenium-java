package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //find element
        WebElement RightClick =driver.findElement(By.id("rightClickBtn"));
        Actions action = new Actions(driver);
        action.contextClick(RightClick).perform();

    }
}
