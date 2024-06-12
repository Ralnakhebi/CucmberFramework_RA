package ui.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import ui.pages.PaymentMethodPage;
import ui.pages.SubscriptionPage;
import ui.utilities.ConfigReader;
import ui.utilities.Driver;

public class StepDefs {

    SubscriptionPage subscriptionPage=new SubscriptionPage();
    PaymentMethodPage paymentMethodPage=new PaymentMethodPage();

    @Given("user at stctv subscription page")
    public void userAtStctvSubscriptionPage() {
        Driver.getDriver().get(ConfigReader.getProperty("GUIUrl"));
    }

    @And("page displayed with English language")
    public void pageDisplayedWithEnglishLanguageShould() {
        subscriptionPage.selectEnglishTranslation();
    }
    @When("user choose {string} Country")
    public void userChooseCountry(String arg0) {
        subscriptionPage.selectCountry(arg0);
        Assert.assertEquals(arg0, subscriptionPage.getCurrentCountryName());
    }

    @And("user choose {string} package")
    public void userChoosePackage(String arg0) {
       subscriptionPage.selectPackage(arg0);
    }

    @And("Payment Method page should be displayed")
    public void paymentMethodPageShouldBeDisplayed() {
        Assert.assertEquals("Payment Method",paymentMethodPage.getPaymentMethodPageHeader());
    }


    @Then("paying using {string} is {string} {string}")
    public void payingUsingIs(String arg0, String arg1, String arg2) {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(paymentMethodPage.getTotalPrice(arg0),arg1);
        softAssert.assertEquals(paymentMethodPage.getCurrency(arg0),arg2);
        softAssert.assertAll();
    }

    @And("close the page")
    public void closeThePage() {
        Driver.closeDriver();
    }
}
