package Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static Base.BaseClass.launchBrowser;

public class loginSteps {
    WebDriver driver;
    @Given("User-ID must not be blank and Password must not be blank")
    public void user_id_must_not_be_blank_and_password_must_not_be_blank(){
        launchBrowser();
    }
    @When("Enter username{string}and{string}password")
    public void click_login_button(String username,String password) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector("[value=\"Login\"]")).click();

    }
}
