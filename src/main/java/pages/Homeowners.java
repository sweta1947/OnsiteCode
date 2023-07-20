package pages;

import base.PageContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Homeowners {
    PageContext context;
    public Homeowners( PageContext context) {
        this.context = context;
    }


    @Then("click on {string}")
    public void clickOn(String string) {
        context.getDriver().findElement(By.xpath("(//h3[text()='Loan-to-value (LTV) ratio calculator '])[2]")).click();
    }


}
