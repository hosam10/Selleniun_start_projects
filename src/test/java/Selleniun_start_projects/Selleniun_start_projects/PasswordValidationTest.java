package Selleniun_start_projects.Selleniun_start_projects;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.*;

public class PasswordValidationTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\\\driver\\\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://example.com/login"); // Change to the actual URL where you test password validation
    }

    @Test
    public void testValidPassword() {
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("GoodPass#1");
        driver.findElement(By.id("submit")).click();
        assertTrue(driver.findElement(By.id("success")).isDisplayed());
    }

    @Test
    public void testInvalidPassword() {
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("bad");
        driver.findElement(By.id("submit")).click();
        assertTrue(driver.findElement(By.id("error")).isDisplayed());
    }
}
