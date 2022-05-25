package HW8;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AvBy {
    private SelenideElement LadaButton = $(By.xpath("//span[.='Lada (ВАЗ)']"));

    public void clickLadaButton(){
        LadaButton.click();
    }
}
