package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

public class PaymentMethodPage {
    public PaymentMethodPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "//h3[@class='payment-header'][1]")
    private WebElement paymentMethodPageHeader;
    @FindBy(xpath = "//h3[@class='payment-header']/following-sibling::label[1]/child::div/child::span/b")
    private WebElement totalPriceStc;
    @FindBy(xpath = "//h3[@class='payment-header']/following-sibling::label[1]/child::div/child::span/i")
    private WebElement currencyStc;
    @FindBy(xpath = "//h3[@class='payment-header']/following-sibling::label[2]/child::div/child::span/b")
    private WebElement totalPriceVisa;
    @FindBy(xpath = "//h3[@class='payment-header']/following-sibling::label[2]/child::div/child::span/i")
    private WebElement currencyVisa;

    public String getPaymentMethodPageHeader() {
        return paymentMethodPageHeader.getText();
    }
    public String getTotalPrice(String paymentMethod){
        return switch (paymentMethod.toLowerCase()) {
            case "stc" -> totalPriceStc.getText();
            case "visa" -> totalPriceVisa.getText();
            default -> "";
        };
    }
    public String getCurrency(String paymentMethod){
        return switch (paymentMethod.toLowerCase()) {
            case "stc" -> currencyStc.getText();
            case "visa" -> currencyVisa.getText();
            default -> "";
        };
    }

}
