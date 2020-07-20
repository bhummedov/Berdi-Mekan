package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPageLogin {
    WebDriver jQDriver;

    public WebPageLogin(WebDriver driver) {
        jQDriver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/div/div[2]/div[2]/a")
    WebElement loginButton;

//    @FindBy(xpath = "//*[@id=\"email\"]")
//    WebElement username;
//
//    @FindBy(xpath = "//*[@id=\"password\"]")
//    WebElement password;
//
//    @FindBy(xpath = "//*[@id=\"app-layout\"]/div/div/div/div/div[2]/form/div[4]/div/button")
//    WebElement loggingIn;

    public void clickLoginButton() {
        loginButton.click();
    }

//    public void clickLoginIn() {
//        loggingIn.click();
//    }
}
