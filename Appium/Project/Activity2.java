package Project;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity2 {

    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        options.noReset();


        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void Task() {

        driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"New text note\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("editable_title")));
        driver.findElement(AppiumBy.id("editable_title")).sendKeys("Title Notes");
        driver.findElement(AppiumBy.id("edit_note_text")).sendKeys("Notes Text");
        driver.findElement((AppiumBy.accessibilityId("Navigate up"))).click();

        String Task1 = driver.findElement(AppiumBy.id("index_note_title")).getText();
        System.out.println(Task1);
        Assert.assertEquals(Task1, "Title Notes");


    }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();


    }
}
