package PracticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HideShow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement zonetext= driver.findElement(By.id("displayed-text"));
        zonetext.sendKeys("Ikram");
        WebElement Hide=driver.findElement(By.id("hide-textbox"));
        Hide.click();
        Thread.sleep(5000);
        WebElement Show=driver.findElement(By.id("show-textbox"));
        Show.click();
    }
}
