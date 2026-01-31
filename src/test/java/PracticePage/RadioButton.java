package PracticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //Find Element
        WebElement BMWRadioButton = driver.findElement(By.id("bmwradio"));
        BMWRadioButton.click();
        // verification
        if (BMWRadioButton.isSelected()) {
            System.out.println("BMW radio button is selected.");
        } else {
            System.out.println("BMW radio button is not selected.");
        }
    }
}

