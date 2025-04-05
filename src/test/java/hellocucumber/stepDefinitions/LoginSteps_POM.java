package hellocucumber.stepDefinitions;

import hellocucumber.pagefactory.LoginPage_PF;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Author: tina
 * @Date: 25/03/25 12:04 PM
 */
public class LoginSteps_POM {
    LoginPage_PF loginPage_PF;
    WebDriver driver;

    @Given("browser is open")
    public void browser_is_open() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() throws InterruptedException {
        driver.navigate().to("https://testerhome.com/account/sign_in");
        Thread.sleep(1000);
        //实例化
        loginPage_PF = new LoginPage_PF(driver);
    }

    @When("I enter {string} as username")
    public void i_enter_as_username(String username) throws InterruptedException {
//        loginPage_PF.enterUserName(username);
        System.out.println("i_enter_as_username" + username);
        Thread.sleep(1000);
    }

    @When("I enter {string} as password")
    public void i_enter_as_password(String password) throws InterruptedException {
//        loginPage_PF.enterPassword(password);
        System.out.println("i_enter_as_password" + password);
        Thread.sleep(1000);
    }

    @When("I click the login button")
    public void i_click_the_login_button() throws InterruptedException {
//        loginPage_PF.login();
        Thread.sleep(2000);
    }

    @Then("I should see the home page")
    public void i_should_see_the_home_page() {
        loginPage_PF.close();
        System.out.println("close browser");
    }

}
