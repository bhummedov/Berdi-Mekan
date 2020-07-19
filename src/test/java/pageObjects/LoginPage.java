package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/div/div[2]/div[2]/a")
    WebElement loginButton;
//    @FindBy(xpath = "//*[@id=\"email\"]")
//    WebElement username;
//    @FindBy(xpath = "//*[@id=\"password\"]")
//    WebElement password;
//    @FindBy(xpath = "//*[@id=\"app-layout\"]/div/div/div/div/div[2]/form/div[4]/div/button")
//    WebElement logingIn;
//    @FindBy(xpath = "//*[@class=\"layout-fixed sidebar-mini\"]/div[1]/div[1]/section/div/div/div/div[2]/div/div[2]/div/button[1]")
//    WebElement newHireButton;
//    @FindBy(xpath = "//*[@id=contains(text(),'newHireModal___BV_modal_header_')]/div[2]/div[1]/div/div/div/form/div/div[1]/select")
//    WebElement salutation;
    public void clickLoginButton() {
        loginButton.click();
    }
//    public void clickLoginIn() {
//        logingIn.click();
//    }
}
