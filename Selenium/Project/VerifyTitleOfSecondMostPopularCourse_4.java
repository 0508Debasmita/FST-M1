package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTitleOfSecondMostPopularCourse_4 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");

        WebElement C2 =driver.findElement(By.xpath("//h3[contains(text(), \"Email Marketing Strategies\")]"));
        String CourseTitle2 = C2.getText();

        // to Make sure it matches title exactly.
        if(CourseTitle2.equals("Email Marketing Strategies")) {
            //Pass
            System.out.println("Title of second most popular course contains : Email Marketing Strategies" + "-- Test Passed");
            // Close the browser
            driver.close();
        }
        else {
            //Fail
            System.out.println("Title of second most popular course doesn't  contain : Email Marketing Strategies" + "  --Test Fails");
        }
    }
}
