package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.OrnekSoruPage;
import utilities.Driver;

public class OrnekSoruStepDefs {
    OrnekSoruPage ornk = new OrnekSoruPage();
    @Then("Navigate to url")
    public void navigateToUrlHttpAutomationexerciseCom() {
        Driver.getDriver().get( "http://automationexercise.com");
    }

    @And("Verify that home page is visible successfully.")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(ornk.sayfa.isDisplayed());
    }

    @And("Click on Signup  Login button")
    public void clickOnSignupLoginButton() {
        ornk.SignUpLoginButton.click();
    }

    @And("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        assert ornk.emailKutusu.isDisplayed();
    }

    @And("Enter correct email address and password.")
    public void enterCorrectEmailAddressAndPassword() {
        ornk.emailKutusu.sendKeys("test1234yx@gmail.com");
        ornk.passwordKutusu.sendKeys("12345");
    }

    @And("Click login button")
    public void clickLoginButton() {
        ornk.emailLogin.click();
    }

    @And("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        assert ornk.usernameismi.isDisplayed();
    }

    @And("Click Delete Account button")
    public void clickDeleteAccountButton() {
        ornk.deleteAccount.click();
    }

    @And("Verify that ACCOUNT DELETED! is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {
        assert ornk.deleteAccountYazisi.isDisplayed();
    }
}
