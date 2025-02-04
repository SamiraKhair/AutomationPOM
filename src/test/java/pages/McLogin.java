package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class McLogin {
    @FindBy(id = "username")
    WebElement textUserInput;

    @FindBy(id = "password")
    WebElement textPasswordInput;

    @FindBy(xpath = "//div/button[@type='submit']")
    WebElement btnSubmitLogin;

//    @FindBy(className = "btn-info")
//    List<WebElement> btnSubmit;

    public McLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void login(String username,String password) throws InterruptedException {
        textUserInput.sendKeys(username);
        Thread.sleep(500);
        textPasswordInput.sendKeys(password);
        Thread.sleep(500);
        btnSubmitLogin.click();
        Thread.sleep(1000);

    }

}