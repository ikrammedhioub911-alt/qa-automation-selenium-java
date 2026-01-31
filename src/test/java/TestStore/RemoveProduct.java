package TestStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveProduct {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationteststore.com/");
        driver.manage().window().maximize();

        //Login
        WebElement LoginRegister = driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
        LoginRegister.click();
        WebElement loginName= driver.findElement(By.id("loginFrm_loginname"));
        loginName.sendKeys("ikram");
        WebElement password= driver.findElement(By.id("loginFrm_password"));
        password.sendKeys("ikram123");
        WebElement loginBtn= driver.findElement(By.xpath("//*[@id=\"loginFrm\"]/fieldset/button"));
        loginBtn.click();
        Thread.sleep(5000);

        //Ajout Produit
        WebElement automationTestStore= driver.findElement(By.xpath("/html/body/div/header/div[1]/div/div[1]/a/img"));
        automationTestStore.click();
        WebElement ajoutPanier= driver.findElement(By.xpath("//*[@id=\"block_frame_featured_1769\"]/div/div[1]/div[2]/div[3]/a"));
        ajoutPanier.click();
        Thread.sleep(3000);

        //Acces to cart
        WebElement cart= driver.findElement(By.xpath("//*[@id=\"main_menu_top\"]/li[3]/a/span"));
        cart.click();

        //delete
        WebElement deleteBtn= driver.findElement(By.xpath("//*[@id=\"cart\"]/div/div[1]/table/tbody/tr[3]/td[7]/a"));
        deleteBtn.click();
    }
}
