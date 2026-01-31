package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURL {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //maximaize
        driver.manage().window().maximize();
        //ouverture Jumia
        driver.get("https://www.jumia.com.tn/");
        //Get URL
        String URL= driver.getCurrentUrl();
        System.out.println("URL:" + URL);
        Thread.sleep(5000);
        driver.quit();
    }
}
