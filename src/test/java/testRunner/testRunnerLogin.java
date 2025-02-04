package testRunner;

import defaultSetup.defaultConfig;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Agreement;
import pages.McLogin;
import pages.Package;
import java.sql.Driver;
import pages.*;


public class testRunnerLogin extends defaultConfig {

    @Test(priority = 1,description = "Login With valid user credential")
    public void dologin() throws InterruptedException {
        McLogin mcLogin = new McLogin(driver);
        mcLogin.login("data.migration", "Testuser1234#");
        Thread.sleep(2000);
        String textActual=driver.findElement(By.xpath("//div/h1[text()='Dashboard']")).getText();
        String textExpected="Dashboard";
        Assert.assertTrue(textActual.contains(textExpected));
    }


    @Test(priority = 2, description = "Create new agreement between MiME and MAC Reseller")
    public void doAgreement() throws InterruptedException {
        Thread.sleep(1500);
        Agreement agreement = new Agreement(driver);
        agreement.makeAgreement();
        Thread.sleep(500);
    }

    @Test(priority = 3, description = "Create New package for MAC Reseller")
    public void createPackage() throws InterruptedException {
        Package newpackage = new Package(driver);
        newpackage.createPackage();
        Thread.sleep(500);
    }

//


    @Test(priority = 4, enabled = false, description = "Make Collection")
    public void makeCollection() throws InterruptedException {
        Collection collection=new Collection(driver);
        collection.makeCollection(driver);
        Thread.sleep(1000);
    }
}
