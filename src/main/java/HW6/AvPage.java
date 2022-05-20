package HW6;

import org.openqa.selenium.WebDriver;

public class AvPage extends BaseView{
    public AvPage(WebDriver driver) {
        super(driver);
        navigationBlock = new NavigationBlock(driver);

    }
    public NavigationBlock navigationBlock;

}
