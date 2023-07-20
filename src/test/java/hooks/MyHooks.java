package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.PageContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MyHooks {


    private PageContext context;

    public MyHooks(PageContext context) {
        this.context = context;
    }

    @Before(order = 1)
    public void beforeScenario(Scenario scenario) {
        System.out.println("Im in beforeScenario");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sweta\\Downloads\\chromedriver_win32\\chromedriver.exe");
        RemoteWebDriver driver = new ChromeDriver();
        WebDriverWait wait= new WebDriverWait(driver, 10);
        context.setDriver(driver);
        context.setWait(wait);
        context.getDriver().get("https://www.fanniemae.com");
        Options manage =context.getDriver().manage();
        manage.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        manage.window().maximize();

    }

    @After(order = 1)
    public void afterScenario(Scenario scenario) {
        boolean failed = scenario.isFailed();
        System.out.println("is Failed? "+failed);
        if(!failed) {
            byte[] screenshotAs = context.getDriver().getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotAs, "image/png");
        }
        context.getDriver().quit();
    }

}