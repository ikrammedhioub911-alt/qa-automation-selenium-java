package FindElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListeDeroulante {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //navigate to website orange hrm
        driver.get("https://demoqa.com/select-menu");
        // maximize window
        driver.manage().window().maximize();
        //sleep
        Thread.sleep(8000);
        WebElement color = driver.findElement(By.xpath("//*[@id=\"oldSelectMenu\"]"));
        Select select = new Select(color);
        select.selectByValue("5");
        /*driver.close();*/
    }
}
