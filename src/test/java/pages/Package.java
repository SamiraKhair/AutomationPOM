package pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Package {
    private WebDriver driver;

    JavascriptExecutor js;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy(className = "el-tooltip")
    WebElement sideNavBar;

    @FindBy(className = "sidebar-wrapper")
    WebElement sideMenu;

    @FindBy(className = "sidebar-menu-item")
    List<WebElement> configuration;//index: 5

    @FindBy(className = "sidebar-menu-item")
    List<WebElement> ISP;//index: 6, scroll up

    @FindBy(xpath = "//span[@class='sidebar-normal' and text()='Packages']")
    WebElement packagesMenu;

    @FindBy(xpath = "//div/button[(text()=' ADD NEW PACKAGE ')]")
    WebElement newPackage;

    @FindBy(className = "form-control")
    List<WebElement> pkgFor;//index 1

    @FindBy(xpath = "//select[@class='form-control']/option[@value='mac_based_package']")
    WebElement pkgForSelection;

    @FindBy(className = "form-control")
    List<WebElement> pkgType;//index: 2

    @FindBy(xpath = "//select[@class='form-control']/option[@value='isp_package']")
    WebElement pkgTypeSelection;


    @FindBy(className = "form-control")
    List<WebElement> pkgName;//index: 3

    @FindBy(className = "form-control")
    List<WebElement> defaultPrice;//index: 7

    @FindBy(className = "form-control")
    List<WebElement> upBWLimit;//index: 9

    @FindBy(className = "form-control")
    List<WebElement> downBWLimit;//index: 13

    @FindBy(id = "btnSubmit")
    WebElement btnSubmit;

    private Object Keys;


    public Package(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.js = (JavascriptExecutor) driver;

    }

    public void createPackage() throws InterruptedException {
        Thread.sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(sideNavBar)).click();
        Thread.sleep(500);
        js.executeScript("arguments[0].scrollTop += 450;", sideMenu);
        Thread.sleep(500);
        configuration.get(5).click();
        Thread.sleep(3000);
        ISP.get(6).click();
        Thread.sleep(4000);
        packagesMenu.click();
        Thread.sleep(8000);
        newPackage.click();
        Thread.sleep(4000);
        pkgFor.get(1).click();
        Thread.sleep(500);
        pkgForSelection.click();
        Thread.sleep(500);
        pkgType.get(2).click();
        Thread.sleep(500);
        pkgTypeSelection.click();
        Thread.sleep(500);


        pkgName.get(3).sendKeys("MAC Gaming package 10M");
        Thread.sleep(500);
        defaultPrice.get(7).clear();
        defaultPrice.get(7).sendKeys("200");
        Thread.sleep(500);
        upBWLimit.get(9).clear();
        upBWLimit.get(9).sendKeys("15");
        Thread.sleep(500);
        downBWLimit.get(11).clear();
        downBWLimit.get(11).sendKeys("15");
        Thread.sleep(500);
        btnSubmit.click();
        Thread.sleep(2000);



    }
}