package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/?app=desktop&hl=ar");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement youtube= driver.findElement(By.name("search_query"));
        youtube.sendKeys("selenium web driver");
        WebElement recherche=driver.findElement(By.id("search-icon-legacy"));
        recherche.click();
        driver.quit();
    }
}
