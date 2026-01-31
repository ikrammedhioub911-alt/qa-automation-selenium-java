package TestStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Inscription {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationteststore.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        WebElement LoginRegister = driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
        LoginRegister.click();
        WebElement btn = driver.findElement(By.xpath("//*[@id=\"accountFrm\"]/fieldset/button"));
        btn.click();
        // first name
        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("rima");
        // last name
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("selmi");
        //mail
        WebElement mail = driver.findElement(By.id("AccountFrm_email"));
        mail.sendKeys("dalelselmi2@gmail.com");
        // telephone
        WebElement tel = driver.findElement(By.name("telephone"));
        tel.sendKeys("26559779");
        //fax
        WebElement fax = driver.findElement(By.name("fax"));
        fax.sendKeys("26559779");
        //company
        WebElement company = driver.findElement(By.name("company"));
        company.sendKeys("itgust");
        //adress 1
        WebElement adress = driver.findElement(By.name("address_1"));
        adress.sendKeys("Tunis");
        //adress 2
        WebElement adrs = driver.findElement(By.name("address_2"));
        adrs.sendKeys("Tunis");
        //city
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Ariana");
        // list country
        WebElement listCountry = driver.findElement(By.id("AccountFrm_country_id"));
        Select country = new Select(listCountry);
        country.selectByValue("1");
        Thread.sleep(3000);
        // list region
        WebElement listRegion = driver.findElement(By.id("AccountFrm_zone_id"));
        Select region = new Select(listRegion);
        region.selectByValue("3");
        // zip code
        WebElement zipCode = driver.findElement(By.name("postcode"));
        zipCode.sendKeys("1111");
        // login name
        WebElement LoginName = driver.findElement(By.name("loginname"));
        LoginName.sendKeys("rima");
        // password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("rima123");
        //confirm password
        WebElement ConfirmPassword = driver.findElement(By.name("confirm"));
        ConfirmPassword.sendKeys("rima123");
        WebElement Checkbtn = driver.findElement(By.id("AccountFrm_newsletter1"));
        Checkbtn.click();
        WebElement Check = driver.findElement(By.id("AccountFrm_agree"));
        Check.click();
        WebElement FinalBtn = driver.findElement(By.xpath("//button [@title='Continue']"));
        FinalBtn.click();
    }

}
