package com.softserve.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.softserve.opencart.data.User;
import com.softserve.opencart.pages.HomePage;
import com.softserve.opencart.pages.account.EditAccountPage;
import com.softserve.opencart.pages.account.UnsuccessfulLoginPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

// TODO
@Owner(value = "OWNER First name")
@Epic("EPIC AllureTest")
@Feature("FEATURE SearchAllureTes")
public class LoginTest extends OpencartTestRunner {

    @DataProvider//(parallel = true)
    public Object[][] customers() {
        return new Object[][] {
            { new User("hahaha@gmail.com", "qwerty", "hahaha") },
        };
    }
    
    //@Test(dataProvider = "customers")
    public void checkSuccessful(User validUser) {
        // Steps
        EditAccountPage editAccountPage = loadApplication()
                .gotoLoginPage()
                .successfulLogin(validUser)
                .gotoRightPanelEditAccount();
        presentationSleep(); // For Presentation ONLY
        //
        // Check
        Assert.assertEquals(editAccountPage.getFirstNameFieldText(),
                validUser.getFirstName());
        //
        // Return to Previous State
        HomePage homePage = editAccountPage.gotoContinue() // optional
                .gotoRightPanelLogout()
                //.logout()
                .gotoContinue();
        //
        // Check (optional)
        Assert.assertTrue(homePage
                .getSlideshow0FirstImageAttributeSrcText()
                .contains(HomePage.EXPECTED_IPHONE6));
        presentationSleep(); // For Presentation ONLY
    }
    
    
    @DataProvider//(parallel = true)
    public Object[][] invalidUsers() {
        return new Object[][] {
            { new User("hahaha1@gmail.com", "qwerty1", "hahaha1") },
        };
    }
    
    @Description("TEST DESCRIPTION: class SearchAllureTest; findByXPath().")
    @Severity(SeverityLevel.BLOCKER)
    @Story("STORY SearchAllureTest")
    @Issue("SSITAGT-1")
    @Link(name = "LINK goto site", url = "http://taqc-opencart.epizy.com/")
    //@TmsLink(value = "TL-678")
    @Test(dataProvider = "invalidUsers")
    public void unsuccessfulLogin(User invalidUser) {
        logger.info("Method unsuccessfulLogin(" + invalidUser + ") Start");
        // Steps
        UnsuccessfulLoginPage  unsuccessfulLoginPage = loadApplication()
                .gotoLoginPage()
                .unsuccessfulLogin(invalidUser);
        presentationSleep(); // For Presentation ONLY
        //
        // Check
        Assert.assertEquals(unsuccessfulLoginPage.getAlertWarningText(),
                UnsuccessfulLoginPage.EXPECTED_LOGIN_MESSAGE);
        //
        // Return to Previous State
        HomePage homePage = unsuccessfulLoginPage.gotoHomePage();
        //
        // Check (optional)
        Assert.assertTrue(homePage
                .getSlideshow0FirstImageAttributeSrcText()
                .contains(HomePage.EXPECTED_IPHONE6));
        presentationSleep(); // For Presentation ONLY
    }
}
