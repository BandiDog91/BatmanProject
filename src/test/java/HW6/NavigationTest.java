package HW6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavigationTest {
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
    void transportTest(){
        new AvPage(driver)
                .navigationBlock.clickTransportButton();
        Assertions.assertEquals(driver.getCurrentUrl(),"https://cars.av.by/");

    }
}
