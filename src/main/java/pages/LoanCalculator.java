package pages;

import base.PageContext;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoanCalculator {

    PageContext context;
    public LoanCalculator( PageContext context) {
        this.context = context;
    }


    @Then("confirms that page with correct title is displayed")
    public void confirmsThatPageWithCorrectTitleIsDisplayed() {
        String s = context.getDriver().findElement(By.xpath("//h1[text()='Loan-to-Value Ratio Calculator']")).getText();
        Assert.assertEquals("Loan-to-Value Ratio Calculator", s );

    }
}
