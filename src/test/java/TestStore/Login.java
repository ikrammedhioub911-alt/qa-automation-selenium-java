package TestStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Login {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationteststore.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        WebElement loginname = driver.findElement(By.name("loginname"));
        loginname.sendKeys("rima");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("rima123");
        WebElement login = driver.findElement(By.xpath("//*[@id=\"loginFrm\"]/fieldset/button"));
        login.click();
    }
}
