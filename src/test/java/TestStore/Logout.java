package TestStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Logout {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationteststore.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        WebElement loginname = driver.findElement(By.name("loginname"));
        loginname.sendKeys("ikram");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("ikram123");
        WebElement login = driver.findElement(By.xpath("//*[@id=\"loginFrm\"]/fieldset/button"));
        login.click();
        WebElement deconnexion = driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[10]/a/font/font"));
        deconnexion.click();
    }
}
