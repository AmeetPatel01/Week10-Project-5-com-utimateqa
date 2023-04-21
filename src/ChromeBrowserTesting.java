import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Launch the URL
        driver.get(baseUrl);
        // Maximise window view
        driver.manage().window().maximize();
        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:" + title);

        //Get the current URL
        String title2 = driver.getCurrentUrl();
        System.out.println("Current URL: " + title2);

        //get page source
        System.out.println("Page source:  " + driver.getPageSource());

        //Find the element of email field.
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("123456@gmail.com");

        //find the element of password field
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("Password1111");


        //close the browser
        driver.quit();
    }
}