package PracticePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");

        WebElement enable= driver.findElement(By.id("enabled-button"));
        WebElement disable= driver.findElement(By.id("disabled-button"));
        WebElement zonetext= driver.findElement(By.id("enabled-example-input"));
        zonetext.sendKeys("Ikram");
        disable.click();
        Thread.sleep(5000);
        enable.click();
        zonetext.sendKeys("Medhioub");

    }
}
