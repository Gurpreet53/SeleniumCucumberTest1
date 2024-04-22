package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Fragrance;
import pages.RegisterUser;

import static utility.BrowserDriver.driver;

public class Stepdef {
    @Given("User clicks on Login or Register button")
    public void user_clicks_on_login_or_register_button() throws InterruptedException {
        RegisterUser.click_loginorregister();
    }

    @When("User clicks on Continue button")
    public void user_clicks_on_continue_button() throws InterruptedException {
        RegisterUser.click_continuebutton();
    }

    @Then("User should be able to view the CREATE ACCOUNT page")
    public void user_should_be_able_to_view_the_create_account_page() {
        String createAccountText = RegisterUser.getCreateAccountText();
        if (createAccountText.equals("CREATE ACCOUNT")) {
            System.out.println("CREATE ACCOUNT page is visible.");
        } else {
            System.out.println("CREATE ACCOUNT page is not visible.");
        }
    }



    @When("User enter Personal details")
    public void user_enters_personal_details() throws InterruptedException {
        RegisterUser.sendkeys_first_name();
        RegisterUser.sendkeys_last_name();
        RegisterUser.sendkeys_email_name();
        RegisterUser.sendkeys_telephone_name();
        RegisterUser.sendkeys_fax_name();
        RegisterUser.sendkeys_address1_name();
        RegisterUser.sendkeys_city_name();
        RegisterUser.sendkeys_region_name();
        RegisterUser.sendkeys_zipcode_name();
        RegisterUser.sendkeys_loginname_name();
        RegisterUser.sendkeys_password_name();
        RegisterUser.sendkeys_passwordconfirm_name();
        RegisterUser.click_selectSubscription();
        RegisterUser.click_readandagree();
        RegisterUser.click_continuebutton1();
    }

    @And("clicks on continue1 button")
    public void user_clicks_on_continue1_button() throws InterruptedException {
        RegisterUser.click_continuebutton1();
    }

//---------------------Frangrance selection-------------
@Given("the User is on the Login or Register page")
public void the_user_is_on_the_login_or_register_page() throws InterruptedException {
    Fragrance.click_loginorregister();
}
    @When("the User enters their Login name as {string} and password as {string}")
    public void the_user_enters_their_login_name_as_and_password_as(String login, String pwd) throws InterruptedException {
    Fragrance.sendkeys_login_name();
   Fragrance.sendkeys_passwod_name();

    }
    @When("clicks on the login button")
    public void clicks_on_the_login_button() throws InterruptedException {
       Fragrance.click_loginbutton();

    }
    @Then("the User should be redirected to the My Account page")
    public void the_user_should_be_redirected_to_the_my_account_page() {
        String expectedTitle = "My Account";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @And("the User hovers over the Fragrance category")
    public void the_user_hovers_over_the_fragrance_category() throws InterruptedException {
        Fragrance.hover_fragrance();
    }
    @And("selects the Men's option")
    public void selects_the_men_s_option() {

    }
    @Then("the User should be on the Men's Fragrance page")
    public void the_user_should_be_on_the_men_s_fragrance_page() {

    }
    @When("the User selects a perfume")
    public void the_user_selects_a_perfume() {

    }
    @When("adds it to the cart")
    public void adds_it_to_the_cart() {

    }
    @When("proceeds to checkout")
    public void proceeds_to_checkout() {

    }
    @When("confirms the order")
    public void confirms_the_order() {

    }
    @Then("the User should see a confirmation message stating {string}")
    public void the_user_should_see_a_confirmation_message_stating(String string) {

    }

}
