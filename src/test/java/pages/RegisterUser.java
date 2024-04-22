package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utility.BrowserDriver.driver;

public class RegisterUser {
    private static final By loginOrRegisterLink = By.linkText("Login or register");
    private static final By continueButton = By.xpath("//button[@title='Continue']");
    private static final By createAccountText = By.xpath("//span[@class='maintext']");
    private static final By firstNameInput = By.xpath("//input[@id='AccountFrm_firstname']");
    private static final By lastNameInput = By.xpath("//input[@id='AccountFrm_lastname']");
    private static final By emailInput = By.xpath("//input[@id='AccountFrm_email']");
    private static final By telephoneInput = By.xpath("//input[@id='AccountFrm_telephone']");
    private static final By faxInput = By.xpath("//input[@id='AccountFrm_fax']");
    private static final By address1Input = By.xpath("//input[@id='AccountFrm_address_1']");
    private static final By cityInput = By.xpath("//input[@id='AccountFrm_city']");
    private static final By regionInput = By.xpath("//select[@id='AccountFrm_zone_id']");
    private static final By zipcodeInput = By.xpath("//input[@id='AccountFrm_postcode']");
    private static final By loginnameInput = By.xpath("//input[@id='AccountFrm_loginname']");
    private static final By passwordInput = By.xpath("//input[@id='AccountFrm_password']");
    private static final By passwordconfirmInput = By.xpath("//input[@id='AccountFrm_confirm']");
    private static final By selectsubscribe = By.xpath("//label[@for='AccountFrm_newsletter0']");
    private static final By readandagree = By.xpath("//input[@id='AccountFrm_agree']");
    private static final By continuebutton1 = By.xpath("//button[@title='Continue']");


    public static void click_loginorregister() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(loginOrRegisterLink).click();
    }

    public static void click_continuebutton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(continueButton).click();
    }

    public static String getCreateAccountText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(createAccountText));
        return element.getText();
    }

    public static void sendkeys_first_name() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement firstNameField = wait.until(ExpectedConditions.elementToBeClickable(firstNameInput));

        firstNameField.clear();
        firstNameField.sendKeys("Gurpreet");
    }

    public static void sendkeys_last_name() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement lastNameField = wait.until(ExpectedConditions.elementToBeClickable(lastNameInput));

        lastNameField.clear();
        lastNameField.sendKeys("Hill");
    }


    public static void sendkeys_email_name() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(emailInput));

        emailField.clear();
        emailField.sendKeys("Hurpreet1@gmail.com");
    }

    public static void sendkeys_telephone_name() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement telephoneField = wait.until(ExpectedConditions.elementToBeClickable(telephoneInput));

        telephoneField.clear();
        telephoneField.sendKeys("123456788");
    }

    public static void sendkeys_fax_name() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement faxField = wait.until(ExpectedConditions.elementToBeClickable(faxInput));

        faxField.clear();
        faxField.sendKeys("123456788");
    }

    public static void sendkeys_address1_name() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement address1 = wait.until(ExpectedConditions.elementToBeClickable(address1Input));

        address1.clear();
        address1.sendKeys("asdedsd");
    }

    public static void sendkeys_city_name() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement city = wait.until(ExpectedConditions.elementToBeClickable(cityInput));

        city.clear();
        city.sendKeys("asdedsd");
    }

    public static void sendkeys_region_name() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement regionDropdown = wait.until(ExpectedConditions.elementToBeClickable(regionInput));

        Select dropdown = new Select(regionDropdown);
        dropdown.selectByValue("3514"); // Selecting Aberdeenshire by its value

        // If you need to do something after selecting the option, you can add additional actions here
    }

    public static void sendkeys_zipcode_name() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement zipcode = wait.until(ExpectedConditions.elementToBeClickable(zipcodeInput));

        zipcode.clear();
        zipcode.sendKeys("AB10 1YT");
    }

    public static void sendkeys_loginname_name() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginname = wait.until(ExpectedConditions.elementToBeClickable(loginnameInput));

        loginname.clear();
        loginname.sendKeys("Gurpreet152512");
    }

    public static void sendkeys_password_name() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement passwordname = wait.until(ExpectedConditions.elementToBeClickable(passwordInput));

        passwordname.clear();
        passwordname.sendKeys("Password@123");
    }

    public static void sendkeys_passwordconfirm_name() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement passwordconfirm = wait.until(ExpectedConditions.elementToBeClickable(passwordconfirmInput));

        passwordconfirm.clear();
        passwordconfirm.sendKeys("Password@123");
    }

    public static void click_selectSubscription() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement subscribe = wait.until(ExpectedConditions.elementToBeClickable(selectsubscribe));


        subscribe.click();
    }

    public static void click_readandagree() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement readandagreecheck = wait.until(ExpectedConditions.elementToBeClickable(readandagree));


        readandagreecheck.click();
    }


    public static void click_continuebutton1() {
        driver.findElement(continuebutton1).click();
    }






}
