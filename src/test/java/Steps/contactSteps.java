package Steps;

import Base.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class contactSteps extends BaseClass {
    @Then("get into page")
    public void get_into_page() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(driver.findElement(By.cssSelector(".logo_text")).isDisplayed());
    }

    @When("click on contact")
    public void click_on_contact(){
        driver.switchTo().frame("mainpanel");
        driver.findElement(By.xpath("//*[@title='Contacts']")).click();
    }

    @Then("Email should be visible")
    public void emailShouldBeVisible() {
        System.out.println("no");
    }
}
