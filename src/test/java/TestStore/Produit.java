package TestStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Produit {
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
        WebElement addproduct = driver.findElement(By.xpath("//*[@id=\"block_frame_featured_1769\"]/div/div[1]/div[2]/div[3]/a"));
        addproduct.click();
        WebElement cart = driver.findElement(By.xpath("//*[@id=\"main_menu_top\"]/li[3]/a/span"));
        cart.click();
        WebElement quantity = driver.findElement(By.id("cart_quantity50"));
        quantity.sendKeys("3");
        WebElement checkout = driver.findElement(By.id("cart_checkout1"));
        checkout.click();
        WebElement confirmation = driver.findElement(By.id("checkout_btn"));
        confirmation.click();

    }
}
