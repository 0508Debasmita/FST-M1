package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyWebsiteTitle_1 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");
        String Actualtitle =driver.getTitle();
        // to Make sure it matches “Alchemy LMS – An LMS Application '' exactly.
        if(Actualtitle.equals("Alchemy LMS – An LMS Application")) {
            //Pass
            System.out.println("Page title contains : Alchemy LMS – An LMS Application" + " Test Passed");
            // Close the browser
            driver.close();
        }
        else {
            //Fail
            System.out.println("Page title doesn't  contain : Alchemy LMS – An LMS Application " + " Test Fails");
        }
        }

    }

