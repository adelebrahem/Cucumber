package Steps;

import Base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class loginSteps extends BaseClass {

    @Given("User open browser and enter username and password")
    public void User_open_browser_and_enter_username_and_password(){
        launchTheBrowser();
    }

    @When("User Enter username{string}and the password{string}")
    public void user_enter_username_qacart_and_the_password_test123(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector("[value=\"Login\"]")).click();
    }

    @Then("User logged in successfully")
    public void user_Logged_In_Successfully() {
       Assert.assertTrue(driver.findElement(By.cssSelector("[class=\"logo_text\"]")).isDisplayed());
        driver.switchTo().frame("mainpanel");
    }

}
