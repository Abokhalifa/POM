import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class DemoBlaze {
    WebDriver driver;
    WebElement loginLink;
    WebElement username;
    WebElement password;
    
    DemoBlaze(){
        driver = new ChromeDriver();
        loginLink = driver.findElement(By.id("login2"));
        username = driver.findElement(By.id("login2"));
        password = driver.findElement(By.id("loginpassword"));
    }


    @BeforeClass
    public void setup(){
    }

    @Test
    public void testGoogleSearch(){
        String baseURL = "https://demoblaze.com/";
        driver.get(baseURL);

        assert Objects.requireNonNull(driver.getTitle()).toLowerCase().contains("store");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }



}