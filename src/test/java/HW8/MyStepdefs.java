package HW8;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {
    @When("Click Lada button")
    public void clickLadaButton() {
        open("https://av.by/");
        new AvBy().clickLadaButton();
    }

    @And("Click Model button")
    public void clickModelButton() {
        new LadaVaz().ModelButton();
    }

    @And("Click Filter button")
    public void clickFilterActualButton() {
        new LadaVaz().Filter();
    }

    @Then("Filter visible")
    public void filterVisible() {
        new SuccessBlock().checkDropdownBox();
    }
}
