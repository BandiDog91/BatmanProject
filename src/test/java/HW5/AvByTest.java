package HW5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.isDisplayed;

public class AvByTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    @BeforeAll
    static void registerDriver(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void initDriver(){
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://av.by");
    }
    @Test
    void bookmarkAuto(){
        driver.findElement(By.xpath(" //div[@class='listing-top__controls']")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("authPhone")));
        Assertions.assertEquals(driver.findElement(By.id("authPhone")).isDisplayed(),true);
    }
    @Test
    void hoverMenuTest(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//span[@class='nav__link-text' and .='Транспорт']")))
                .build()
                .perform();
        driver.findElement(By.xpath("//span[.='Мототехника']")).click();
        Assertions.assertEquals(driver.getCurrentUrl(),"https://moto.av.by/");
    }
    @Test
    void AdsInTheTop(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//div[@class='badge__label']")))
                .build()
                .perform();
        assertThat(driver.findElement(By.xpath("//div[@class='badge__title']")),isDisplayed());
    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }
}
