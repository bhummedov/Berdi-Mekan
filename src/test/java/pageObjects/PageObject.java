package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    WebDriver jQDriver;

    public PageObject(WebDriver driver) {
        jQDriver = driver;
        PageFactory.initElements(driver, this);
    }

}
