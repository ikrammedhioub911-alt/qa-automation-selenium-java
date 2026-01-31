package PracticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest {
            public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.letskodeit.com/practice");

            WebElement startTyping= driver.findElement(By.id("autosuggest"));
            startTyping.sendKeys("car");

        }
}
