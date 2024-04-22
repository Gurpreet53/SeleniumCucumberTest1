package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utility.BrowserDriver.driver;

public class Fragrance {
    private static final By loginOrRegisterLink = By.linkText("Login or register");
    private static final By loginname = By.xpath("//input[@id='loginFrm_loginname']");
    private static final By password = By.xpath("//input[@id='loginFrm_password']");
    private static final By Loginbutton = By.xpath("//button[@title='Login']");
    private static final By frangranceLink = By.xpath("//li/a[text()='Fragrance']"); // Changed to By locator
    private static final By menLink = By.xpath("//li[1]//a[1]//img[1]");  // Changed to By locator

    public static void click_loginorregister() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(loginOrRegisterLink).click();
    }

    public static void sendkeys_login_name() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement login1 = wait.until(ExpectedConditions.elementToBeClickable(loginname));

        login1.clear();
        login1.sendKeys("Gurpreet152512");
    }

    public static void sendkeys_passwod_name() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement passwod = wait.until(ExpectedConditions.elementToBeClickable(password));

        passwod.clear();
        passwod.sendKeys("Password@123");
    }

    public static void click_loginbutton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(Loginbutton).click();
    }

    public static void hover_fragrance() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement fragranceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(frangranceLink));  // Changed to By locator
        actions.moveToElement(fragranceElement).perform();

        Thread.sleep(2000); // Optional: Add a small delay if needed

        WebElement menElement = wait.until(ExpectedConditions.elementToBeClickable(menLink));  // Changed to By locator
        menElement.click();
    }
}
