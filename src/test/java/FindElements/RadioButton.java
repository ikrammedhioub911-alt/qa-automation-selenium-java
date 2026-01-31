package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class RadioButton {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/radio-button");
            driver.manage().window().maximize();
            Thread.sleep(5000);

            //find element
            WebElement RadioBtn1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/label"));
            RadioBtn1.click();

            // find element 2
            WebElement RadioBtn2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/label"));
            RadioBtn2.click();
        }
    }

