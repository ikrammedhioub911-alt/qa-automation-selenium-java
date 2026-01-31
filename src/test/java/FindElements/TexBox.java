package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TexBox {
        public static void main(String[] args) {

            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/text-box");

            //Find Full name;
            WebElement fullName=driver.findElement(By.id("userName"));
            fullName.sendKeys("Mariem");
            //find mail;
            WebElement mail=driver.findElement(By.id("userEmail"));
            mail.sendKeys("fetoui.mariem@gmail.com");
            //find adresse
            WebElement adresse=driver.findElement(By.id("currentAddress"));
            adresse.sendKeys("sfax");
            //find permanent Padresse
            WebElement Padresse=driver.findElement(By.id("permanentAddress"));
            Padresse.sendKeys("sfax");
            //find bouton
            WebElement bouton=driver.findElement(By.id("submit"));
            bouton.click();
        }
    }

