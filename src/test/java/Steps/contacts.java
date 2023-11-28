package Steps;
import Base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class contacts extends BaseClass {
    @When("Clicks on contacts")
    public void Clicks_on_contacts(){
        driver.switchTo().frame("mainpanel");
        driver.findElement(By.xpath("//*[@title='Contacts']")).click();
    }
    @Then("Email text field should be visible")
    public void Email_text_field_should_be_visible(){
        Assert.assertTrue(driver.findElement(By.name("cs_email")).isDisplayed());
    }

    @And("Clicks on add contact")
    public void Clicks_on_add_contact(){
        driver.findElement(By.cssSelector("[value=\"New Contact\"]")).click();
    }

    @And("Fill the first name password")
    public void Fill_the_first_name_password() {
        driver.findElement(By.id("first_name")).sendKeys("Adel");
        driver.findElement(By.id("surname")).sendKeys("Ebrahem");
        driver.findElement(By.cssSelector("[value=\"Save\"]")).click();
    }

    @Then("A new contact should be added")
    public void A_new_contact_should_be_added() {
        Assert.assertTrue(driver.findElement(By.cssSelector("[value=\"Next\"]")).isDisplayed());
    }
}

