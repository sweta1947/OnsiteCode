package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;
    WebDriverWait wait;

    @Given("User browse fanniemae webpage")
    public void userBrowseFanniemaeWebpage() {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sweta\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        driver.get("https://www.fanniemae.com");

    }

    @Then("User confirms that the page is loaded and I am able to see {string} on the page")
    public void userConfirmsThatThePageIsLoadedAndIAmAbleToSeeOnThePage(String string) {

        WebElement element = driver.findElement(By.cssSelector("a.fm-logo"));
        wait.until(ExpectedConditions.visibilityOf(element));
        String s = driver.findElement(By.xpath("(//img[@alt='Fannie Mae logo'])[1]")).getAttribute("alt");
        Assert.assertEquals( "Fannie Mae logo",s );

    }

    @When("User hover over to {string} and click on {string}")
    public void userHoverOverToAndClickOn(String string, String string2) {
        WebElement element = driver.findElement(By.xpath("//a[text()='Calculators & Tools']"));
        Actions act = new Actions(driver);
        act.moveToElement(element).perform();
        driver.findElement(By.cssSelector("a[aria-label='Tools for Homeowners site (opens in new tab)']")).click();

    }

    @Then("click on {string}")
    public void clickOn(String string) {
        driver.findElement(By.xpath("(//h3[text()='Loan-to-value (LTV) ratio calculator '])[2]")).click();
    }

    @Then("confirms that page with correct title is displayed")
    public void confirmsThatPageWithCorrectTitleIsDisplayed() {
        String s = driver.findElement(By.xpath("//h1[text()='Loan-to-Value Ratio Calculator']")).getText();
        Assert.assertEquals("Loan-to-Value Ratio Calculator", s );

    }

}
