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

public class Activity1 {
    // Driver Declaration

    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();


        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void Task() {
        //String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";

        // Just scroll
        //driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".flingForward()"));
        // Locate element
        //driver.findElement(AppiumBy.accessibilityId("Tasks")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("tasks_fab")));
        driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Create new task\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.className("android.widget.EditText")));
        driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("Complete Activity with Google Tasks");
        driver.findElement(AppiumBy.id("add_task_done")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Create new task\"]")));
        driver.findElement(AppiumBy.id("tasks_fab")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("add_task_title")));
        driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete Activity with Google Keep");
        driver.findElement(AppiumBy.id("add_task_done")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Create new task\"]")));
        driver.findElement(AppiumBy.id("tasks_fab")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("add_task_title")));
        driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete the second Activity Google Keep");
        driver.findElement(AppiumBy.id("add_task_done")).click();

        String Task1 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Complete Activity with Google Tasks']")).getText();
        Assert.assertEquals(Task1, "Complete Activity with Google Tasks");

        String Task2 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Complete Activity with Google Keep']")).getText();
        Assert.assertEquals(Task2, "Complete Activity with Google Keep");

        String Task3 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Complete the second Activity Google Keep']")).getText();
        Assert.assertEquals(Task3, "Complete the second Activity Google Keep");

    }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();

        // Test method


    }

}