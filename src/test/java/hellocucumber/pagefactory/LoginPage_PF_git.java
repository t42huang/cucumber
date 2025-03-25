package hellocucumber.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @Author: tina
 * @Date: 25/03/25 11:20 AM
 */
public class LoginPage_PF_git {
    @FindBy(id = "login_field")
    WebElement txtUserName;

    @FindBy(id = "password")
    WebElement txtPassword;

    @FindBy(name = "commit")
    WebElement btnLogin;

    WebDriver driver;
    public LoginPage_PF_git(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
//        PageFactory.initElements(driver,LoginPage_PF.class);

    }

    public void enterUserName(String username){
        txtUserName.sendKeys(username);
    }
    public void enterPassword(String password){
        txtPassword.sendKeys(password);
    }

    public void login(){
        btnLogin.click();
    }

    public void quit(){
        driver.quit();
    }
//    public void login(String username, String password){
//        txtUserName.sendKeys(username);
//        txtPassword.sendKeys(password);
//    }
}
