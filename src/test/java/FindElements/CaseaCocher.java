package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseaCocher {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        // find checkbox element
        WebElement CaseaCocher1 = driver.findElement(By.id("benzcheck"));
        CaseaCocher1.click();
    }
}
