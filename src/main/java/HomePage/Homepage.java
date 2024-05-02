package HomePage;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

    @Getter
    WebDriver driver;


    By LoginButton = By.xpath("//span[normalize-space()='Login']");
    By Input_number = By.xpath("//input[@placeholder='Please enter your Phone Number or Email']");
    By Input_pass = By.xpath("//input[@placeholder='Please enter your password']");
    By SubmitLogin = By.xpath("//button[@type='submit']");

    By Category_view = By.xpath("//span[normalize-space()='Electronics Device']");
    By Product_view = By.xpath("//div[normalize-space()='M3 Mini Metal Portable Wireless Bluetooth Speaker Multi Color - Speaker - Speaker']");

    By SearchField = By.xpath("//input[@id='q']");
    By SearchFieldProduct = By.xpath("//body/div[@id='root']/div[@class='box--LNmE6']/div[@class='ant-row main--pIV2h']/div[@class='ant-col-24']/div[@class='ant-row']/div[@class='ant-col-19 ant-col-push-5 side-right--Tyehf']/div[@class='box--ujueT']/div[4]/div[1]/a[1]/div[2]/div[1]");

    By SingUp = By.xpath("//a[normalize-space()='Sign Up']");
    By EnterNumber = By.xpath("//input[@placeholder='Please enter your phone number']");
    By SingUpFullName = By.xpath("//input[@placeholder='Enter your first and last name']");
    By SingUpPassword = By.xpath("//input[@placeholder='Minimum 6 characters with a number and a letter']");
    By SingUpCodeSend = By.xpath("//button[@class='mod-sendcode-btn']");


    public Homepage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement LoginButton(){return driver.findElement(LoginButton);}
    public WebElement InputNum(){return driver.findElement(Input_number);}
    public WebElement InputPass(){return driver.findElement(Input_pass);}
    public WebElement LoginSub(){return driver.findElement(SubmitLogin);}
    public WebElement CategoryView(){return driver.findElement(Category_view);}
    public WebElement CategoryViewProduct(){return driver.findElement(Product_view);}
    public WebElement SearchField(){return driver.findElement(SearchField);}
    public WebElement SearchFieldProduct(){return driver.findElement(SearchFieldProduct);}
    public WebElement SingUpButton(){return driver.findElement(SingUp);}
    public WebElement SingUpNumber(){return driver.findElement(EnterNumber);}
    public WebElement SingUp_FullName(){return driver.findElement(SingUpFullName);}
    public WebElement SingUp_Password(){return driver.findElement(SingUpPassword);}
    public WebElement SingUp_CodeSend(){return driver.findElement(SingUpCodeSend);}




}