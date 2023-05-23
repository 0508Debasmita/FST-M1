package seleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountNumOfCourses_7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");

        driver.findElement(By.xpath("//a[contains(text(),'All Courses')]")).click();
        Thread.sleep(80);
        String Title =driver.getTitle();
        System.out.println(" Title = " + Title);

        //Find the course count
         int NumofCourse = driver.findElements(By.xpath("//div[@class='ld-course-list-items row']/div")).size();
            System.out.println("Total Number of courses available are: " + NumofCourse);

            // Close the browser
            driver.close();
            }
    }


