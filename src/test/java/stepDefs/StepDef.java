package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import managers.DriverMgr;
import org.junit.jupiter.api.Assertions;
import pageObjects.WebPageLogin;


public class StepDef {
    WebPageLogin webPageLogin = new WebPageLogin(DriverMgr.getDriver());

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
        System.out.println("I should see homepage");
    }
    @Then("^I click on login button$")
    public void iClickOnUserNameBar() {
        System.out.println("I click on login button");
    }

    @Then("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) {
        table.getTableConverter();
    }

//    @Then("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
//    public void iEnterUsernameAsAndPasswordAs(String username, String password) {
//        System.out.println("UserName is " + username + " Password is " + password);
//    }

    @Then("I click on the BuffSci bar")
    public void i_click_on_the_BuffSci_bar() {

    }

    @Then("I click on staff")
    public void i_click_on_staff() {

    }

    @Then("I land on the staff page")
    public void i_land_on_the_staff_page() {

    }



}
