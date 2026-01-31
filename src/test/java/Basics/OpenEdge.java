package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--disabled-search-engine-choice-screen");
        //maximaize the window
        driver.manage().window().maximize();
        //ouverture facebook
        driver.get("https://www.facebook.com/");
        //Sleep
        Thread.sleep(5000);
        //Fermeture
        driver.quit();
    }
}
