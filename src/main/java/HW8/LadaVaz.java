package HW8;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LadaVaz {
    private SelenideElement Model = $(By.xpath("//span[.='2101']"));
    private SelenideElement FilterActual = $(By.xpath("//span[@class='dropdown-link__value']"));
    private SelenideElement Expensive = $(By.xpath("//button[@data-item-label='дорогие']"));

    public void ModelButton (){
        Model.click();
    }
    public void Filter(){
        FilterActual.click();
        Expensive.click();
    }
}
