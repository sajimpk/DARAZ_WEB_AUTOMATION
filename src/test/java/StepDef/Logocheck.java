package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import HomePage.Homepage;
import utilis.TestContextSetup;

public class Logocheck {
    private TestContextSetup testContextSetup;
    private WebDriver driver;
    private Homepage homepage;
    private int wait = 3000;

    public Logocheck(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.driver = testContextSetup.driver;
        this.homepage = testContextSetup.pageObjectManager.getHomePage();
    }

    //////////// TC_1 //////////////////////////

    @When("Check the Login button")
    public void checkLoginButtonIsAvailable() throws InterruptedException {
        Assert.assertTrue(homepage.LoginButton().isDisplayed());
        Thread.sleep(wait);
    }

    @Then("Click on the Login button")
    public void clickOntLoginButton() throws InterruptedException {
        homepage.LoginButton().click();
        Thread.sleep(wait);
    }
    @When("Click on the Email Field")
    public void ValueForLoginEmail() throws InterruptedException {
        homepage.InputNum().click();
        Thread.sleep(wait);
    }
    @Then("Enter Value For Login")
    public void EnterValue() throws InterruptedException {
        homepage.InputNum().sendKeys("example@gmail.com");
        Thread.sleep(wait);
    }
    @Then("Click on the Password Field")
    public void clickForLoginPass() throws InterruptedException {
        homepage.InputPass().click();
        Thread.sleep(wait);
    }
    @When("Enter Password For Login")
    public void EnterPassValue() throws InterruptedException {
        homepage.InputPass().sendKeys("example1209");
        Thread.sleep(wait);
    }
    @Then("Click on the Submit Button")
    public void clickLogin() throws InterruptedException {
        homepage.LoginSub().click();
        Thread.sleep(wait);
    }
    ///////////// TC_2 ////////////////////
    @Given("Check the Category field id showed")
    public void CategoryView() throws InterruptedException {
        Assert.assertTrue(homepage.CategoryView().isDisplayed());
        Thread.sleep(wait);
    }
    @When("Click on the Category Electronics Device")
    public void CategoryViewClick() throws InterruptedException {
        homepage.CategoryView().click();
        Thread.sleep(wait);
    }
    @Then("Check on the Category Electronics Device product show")
    public void CategoryViewIsShow() throws InterruptedException {
        Assert.assertTrue(homepage.CategoryViewProduct().isDisplayed());
        Thread.sleep(wait);
    }
    @When("Click on the Category Electronics Device product")
    public void CategoryViewProduct() throws InterruptedException {
        homepage.CategoryViewProduct().click();
        Thread.sleep(wait);
    }
    //////////////////////// TC_3 ////////////////////

    @Given("Check the Search Field on the page")
    public void ChackSearchField() throws InterruptedException {
        Assert.assertTrue(homepage.SearchField().isDisplayed());
        Thread.sleep(wait);
    }
    @When("I Click on the Search Field")
    public void ClickSearchField() throws InterruptedException {
        homepage.SearchField().click();
        Thread.sleep(wait);
    }
    @Then("I Enter value on the Search Field")
    public void ValueSearchField() throws InterruptedException {
        homepage.SearchField().sendKeys("Headphones");
        Thread.sleep(wait);
    }
    @Then("I submit value on the Search Field")
    public void SubmitValueForSearch() throws InterruptedException {
        homepage.SearchField().submit();
        Thread.sleep(wait);
    }


    @Then("Check The Product is Current For Search Value")
    public void checkTheProductForSearchValue() throws InterruptedException {
        Assert.assertTrue(homepage.SearchFieldProduct().isDisplayed());
        Thread.sleep(wait);
    }

    @And("Click On The product")
    public void clickOnTheProduct()  throws InterruptedException {
        homepage.SearchFieldProduct().click();
        Thread.sleep(wait);
    }
    /////////////////////// TC_4 /////////////////////

    @Given("Check the Sing Up button")
    public void checkSingUpButtonIsAvailable() throws InterruptedException {
        Assert.assertTrue(homepage.SingUpButton().isDisplayed());
        Thread.sleep(wait);
    }

    @Then("Click on the Sing Up button")
    public void checkSingUpButtonClick() throws InterruptedException {
        homepage.SingUpButton().click();
        Thread.sleep(wait);
    }
    @When("Check the Sing Up Number field")
    public void checkSingUpNumberField() throws InterruptedException {
        Assert.assertTrue(homepage.SingUpNumber().isDisplayed());
        Thread.sleep(wait);
    }
    @Then("Click on the Sing Up Number field")
    public void clickSingUpNumber() throws InterruptedException {
        homepage.SingUpNumber().click();
        Thread.sleep(wait);
    }
    @Then("Enter Number on sing up input field")
    public void EnterSingUpEmailValue() throws InterruptedException {
        homepage.SingUpNumber().sendKeys("01861766157");
        Thread.sleep(wait);
    }
    @When("Check the Sing Up Full name field")
    public void checkSingUpNameField() throws InterruptedException {
        Assert.assertTrue(homepage.SingUp_FullName().isDisplayed());
        Thread.sleep(wait);
    }
    @Then("Click on the Sing Up Full name field")
    public void clickSingUpName() throws InterruptedException {
        homepage.SingUp_FullName().click();
        Thread.sleep(wait);
    }
    @Then("Enter Name on sing up Full name field")
    public void EnterSingUpNameValue() throws InterruptedException {
        homepage.SingUp_FullName().sendKeys("Sajim Uddin");
        Thread.sleep(wait);
    }
    @When("Check the Sing Up Send Code Button")
    public void checkSingUpSend() throws InterruptedException {
        Assert.assertTrue(homepage.SingUp_CodeSend().isDisplayed());
        Thread.sleep(wait);
    }
    @Then("Click on the Sing Up Send Code Button")
    public void clickSingUpSend() throws InterruptedException {
        homepage.SingUp_CodeSend().click();
        Thread.sleep(wait);
    }
    @When("Check the Sing Up Password field")
    public void checkSingUpPwdField() throws InterruptedException {
        Assert.assertTrue(homepage.SingUp_Password().isDisplayed());
        Thread.sleep(wait);
    }
    @Then("Click on the Sing Up Password field")
    public void clickSingUpPwd() throws InterruptedException {
        homepage.SingUp_Password().click();
        Thread.sleep(wait);
    }
    @Then("Enter Password on Sing Up Password field")
    public void EnterSingUpPwdValue() throws InterruptedException {
        homepage.SingUp_Password().sendKeys("!@#$asdfGH");
        Thread.sleep(wait);
    }

}




