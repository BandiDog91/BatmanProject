package HW6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBlock extends BaseView{
    public NavigationBlock(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[.='Транспорт']")
    private WebElement transportButton;

    @FindBy(xpath = "//span[.='Шины и диски']")
    private WebElement tiresAndWheelsButton;

    @FindBy(xpath = "//span[.='Запчасти']")
    private WebElement sparesButton;

    @FindBy(xpath = "//span[.='Автожурнал']")
    private WebElement carMagazineButton;

    @FindBy(xpath = "//span[.='Знания']")
    private WebElement knowledgeButton;

    @FindBy(xpath = "//span[.='Финансы']")
    private WebElement financeButton;

    public void clickTransportButton(){
        transportButton.click();
    }
}
