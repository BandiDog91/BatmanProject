package HW8;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SuccessBlock {
    private SelenideElement DropdownBox = $(By.xpath("//button[@title='дорогие']"));

    public void checkDropdownBox(){
        DropdownBox.shouldBe(visible);
    }
}
