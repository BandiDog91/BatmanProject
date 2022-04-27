import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("user-agent=Googlebot/2.1 (+http://google.com/bot.html)");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://av.by/");
        driver.findElement(By.xpath("//span[.='Audi']")).click();
        driver.findElement(By.xpath("//span[@class='dropdown-link__value']")).click();


        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-item-label='дорогие']")));

        driver.findElement(By.xpath("//button[@data-item-label='дорогие']")).click();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://diary.ru/user/login");
        driver.findElement(By.id("loginform-username")).sendKeys("BandiDog");
        driver.findElement(By.id("loginform-password")).sendKeys("123456789");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
        driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
        driver.switchTo().parentFrame();
        driver.findElement(By.id("login_btn")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
