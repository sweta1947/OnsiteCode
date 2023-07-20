package pages;

import base.PageContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginFannieMae {

    PageContext context;
    public LoginFannieMae( PageContext context) {
        this.context = context;
    }

    //    @Given("User browse fanniemae webpage")
//    public void userBrowseFanniemaeWebpage() {
//
//
//        System.setProperty("webcontext.getDriver().chrome.context.getDriver()", "C:\\Users\\sweta\\Downloads\\chromecontext.getDriver()_win32\\chromecontext.getDriver().exe");
//        context.getDriver() = new Chromecontext.getDriver()();
//        context.getDriver().manage().window().maximize();
//        context.getDriver().manage().timeouts().implicitlycontext.getWait()(10, TimeUnit.SECONDS);
//        context.getWait() = new Webcontext.getDriver()context.getWait()(context.getDriver(), 10);
//        context.getDriver().get("https://www.fanniemae.com");
//
//    }

    @Then("User confirms that the page is loaded and I am able to see {string} on the page")
    public void userConfirmsThatThePageIsLoadedAndIAmAbleToSeeOnThePage(String string) {

        WebElement element = context.getDriver().findElement(By.cssSelector("a.fm-logo"));
        context.getWait().until(ExpectedConditions.visibilityOf(element));
        String s = context.getDriver().findElement(By.xpath("(//img[@alt='Fannie Mae logo'])[1]")).getAttribute("alt");
        Assert.assertEquals( "Fannie Mae logo",s );

    }

    @When("User hover over to {string} and click on {string}")
    public void userHoverOverToAndClickOn(String string, String string2) {
        WebElement element = context.getDriver().findElement(By.xpath("//a[text()='Calculators & Tools']"));
        Actions act = new Actions(context.getDriver());
        act.moveToElement(element).perform();
        context.getDriver().findElement(By.cssSelector("a[aria-label='Tools for Homeowners site (opens in new tab)']")).click();

    }
}
