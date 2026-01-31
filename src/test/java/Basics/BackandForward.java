package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackandForward {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //maximaize
        driver.manage().window().maximize();
        //ouverture chrome
        driver.get("https://www.google.com/?hl=fr");
        //sleep
        Thread.sleep(5000);
        //ouverture Jumia
        driver.get("https://www.jumia.com.tn/");
        //sleep
        Thread.sleep(3000);
        //return to Google
        driver.navigate().back();
        //return to Jumia
        driver.navigate().forward();
        driver.navigate().refresh();
        //fermuture
        driver.quit();
    }
}
