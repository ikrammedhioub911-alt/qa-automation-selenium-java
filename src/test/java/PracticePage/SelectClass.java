package PracticePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //Find Element
        WebElement dropdownElement = driver.findElement(By.id("carselect"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Honda");
        // Optionally, verify that Honda is selected
        String selectedOption = dropdown.getFirstSelectedOption().getText();
        if ("Honda".equals(selectedOption)) {
            System.out.println("Honda is selected.");
        } else {
            System.out.println("Honda is not selected.");
        }
    }
}
