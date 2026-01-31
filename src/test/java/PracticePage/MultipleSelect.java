package PracticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
            public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.letskodeit.com/practice");

            WebElement multiple= driver.findElement(By.id("multiple-select-example"));
            Select select=new Select(multiple);
            select.selectByVisibleText("Peach");
            select.selectByVisibleText("Apple");

        }
    }

