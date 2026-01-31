package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //maximaize
        driver.manage().window().maximize();
        //ouverture Jumia
        driver.get("https://www.jumia.com.tn/");
        //Get title
        String Title= driver.getTitle();
        System.out.println("le titre est" + Title);
    }
}
