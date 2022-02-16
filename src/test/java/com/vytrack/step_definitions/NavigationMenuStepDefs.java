package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {
        System.out.println("the user navigates to Fleet, Vehicles");
    }

    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        System.out.println("the title should be Vehicles");
    }

    @When("the user navigates to Marketing, Campaigns")
    public void the_user_navigates_to_Marketing_Campaigns() {
        System.out.println("the user navigates to Marketing, Campaigns");
    }

    @Then("the title should be Campaigns")
    public void the_title_should_be_Campaigns() {
        System.out.println("the title should be Campaigns");
    }

    @When("the user navigates to Activities, Calender Events")
    public void the_user_navigates_to_Activities_Calender_Events() {
        System.out.println("the user navigates to Activities, Calender Events");
    }

    @Then("the title should be Calenders")
    public void the_title_should_be_Calenders() {
        System.out.println("the title should be Calenders");


    }


    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        // Write code here that turns the phrase above into concrete actions
        new DashboardPage().navigateToModule(tab, module);
    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNum) {
        // Write code here that turns the phrase above into concrete actions
        ContactsPage contactsPage=new ContactsPage();
        BrowserUtils.waitFor(4);
        Integer actualNumber=Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));
        Assert.assertEquals(expectedPageNum, actualNumber);
    }





}
