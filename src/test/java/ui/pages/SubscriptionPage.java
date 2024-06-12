package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

public class SubscriptionPage {
    public SubscriptionPage(){
        PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(xpath = "//a[@id='translation-btn']")
    private WebElement changeLanguage;
    @FindBy(xpath = "//a[@id='country-btn']")
    private WebElement selectCountryButton;
    @FindBy(xpath = "//a[@id='sa']")
    private WebElement ksaCountryButton;
    @FindBy(xpath = "//a[@id='bh']")
    private WebElement bahrainCountryButton;
    @FindBy(xpath = "//a[@id='kw']")
    private WebElement kuwaitCountryButton;
    @FindBy(xpath = "//span[@id='country-name']")
    private WebElement currentCountryName;
    @FindBy(xpath = "//a[@id='classic-selection']")
    private WebElement classicPackageButton;
    @FindBy(xpath = "//a[@id='lite-selection']")
    private WebElement litePackageButton;
    @FindBy(xpath = "//a[@id='premium-selection']")
    private WebElement premiumPackageButton;

    public void selectEnglishTranslation(){
        if(changeLanguage.getText().equals("English")){
            changeLanguage.click();
        }
    }
    public void selectCountry(String countryName){

        switch (countryName.toLowerCase()){
            case "ksa":
                selectCountryButton.click();
                ksaCountryButton.click();
                break;
            case "bahrain":
                selectCountryButton.click();
                bahrainCountryButton.click();
                break;
            case "kuwait":
                selectCountryButton.click();
                kuwaitCountryButton.click();
                break;
        }
    }
    public String getCurrentCountryName() {
        return currentCountryName.getText();
    }
    public void selectPackage(String packageName){
        switch (packageName.toLowerCase()){
            case "lite":
                litePackageButton.click();
                break;
            case "classic":
                classicPackageButton.click();
                break;
            case "premium":
                premiumPackageButton.click();
                break;
        }
    }

}
