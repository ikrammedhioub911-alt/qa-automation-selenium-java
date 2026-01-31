package Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ExpliciteImplicite {
    public static void main(String[] args) {
        //WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options.addArguments("--disable-search-engine-choice-screen"));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        // définir l'attente implicite à 10 seconds avant de lancer une exception
        // l'attente implicite se déclare une seule fois pas comme thread
        // thread est une commande java
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // navigate 3andou historique wl fonctionnalités(back, forward, ...)
        driver.navigate().to("https://automationteststore.com/");
        driver.navigate().back();
        driver.navigate().forward();



        // Attente explicite
        //Créer une instance WebDriverWait avec durée de 10 sec
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        //condition
        //Attendre que l'élément soit cliquable
        //WebElement radioButton

       // wait.until(ExpectedConditions.elementToBeClickable(radioButton));
        //radioButton.click();
        driver.quit();

    }

}
