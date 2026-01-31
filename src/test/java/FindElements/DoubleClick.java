package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Objects;

    public class DoubleClick {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/buttons");
            driver.manage().window().maximize();
            Thread.sleep(5000);

            //find element
            // el find element hya methode
            WebElement DoubleClick =driver.findElement(By.id("doubleClickBtn"));
            Actions action = new Actions(driver);
            action.doubleClick(DoubleClick).perform();

        /*verification
        String resultatattendu = "You have done a double click";
        String resultatobtenu = driver.getText();
        if (Objects.equals( resultatattendu, resultatobtenu)){
            System.out.println("test passed");

        }else {
            System.out.println("test failed");
        }*/
        }

    }

