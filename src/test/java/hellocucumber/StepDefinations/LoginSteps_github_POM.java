package hellocucumber.StepDefinations;

import hellocucumber.pagefactory.LoginPage_PF_git;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Author: tina
 * @Date: 25/03/25 12:04 PM
 */
public class LoginSteps_github_POM {
    LoginPage_PF_git login;
    WebDriver driver;

    @Given("open browser")
    public void open_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("on login page")
    public void on_open() throws InterruptedException {
        driver.navigate().to("https://github.com/login");
        Thread.sleep(1000);
        //实例化
        login = new LoginPage_PF_git(driver);
    }

    @When("enter {string} as username")
    public void enter_as_username(String username) throws InterruptedException {
        login.enterUserName(username);
        Thread.sleep(1000);
    }

    @When("enter {string} as password")
    public void enter_as_password(String password) throws InterruptedException {
        login.enterPassword(password);
        Thread.sleep(1000);
    }

    @Then("click the login button")
    public void click_the_login_button() throws InterruptedException {
        login.login();
        Thread.sleep(5000);
    }
    @And("close browser")
    public void close_browser() throws InterruptedException {
        login.quit();
        Thread.sleep(2000);
    }
}
