package com.softserve.opencart.pages.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.softserve.opencart.data.User;

public abstract class AccountSidebarGuestPart extends AccountSidebarPart {

    private WebElement loginRight;
    private WebElement registerRight;
    private WebElement forgottenPasswordRight;

    public AccountSidebarGuestPart(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        // init elements
        loginRight = driver.findElement(By.xpath("//div[@class='list-group']/a[contains(@href, 'account/login')]"));
        registerRight = driver
                .findElement(By.xpath("//div[@class='list-group']/a[contains(@href, 'account/register')]"));
        forgottenPasswordRight = driver
                .findElement(By.xpath("//div[@class='list-group']/a[contains(@href, 'account/forgotten')]"));
    }

    // Page Object

    // loginRight
    public WebElement getLoginRight() {
        return loginRight;
    }

    public String LoginRight() {
        return getLoginRight().getText();
    }

    public void clickLoginRight() {
        getLoginRight().click();
    }

    // registerRight
    public WebElement getRegisterRight() {
        return registerRight;
    }

    public String getRegisterRightText() {
        return getRegisterRight().getText();
    }

    public void clickRegisterRight() {
        getRegisterRight().click();
    }

    // forgottenPasswordRight
    public WebElement getForgottenPasswordRight() {
        return forgottenPasswordRight;
    }

    public String getForgottenPasswordRightText() {
        return getForgottenPasswordRight().getText();
    }

    public void clickForgottenPasswordRight() {
        getForgottenPasswordRight().click();
    }

    // Functional

    protected void defaultLogin(User user) {
        new LoginPage(driver)
                .fillLogin(user);
    }

    // Business Logic

    public LoginPage gotoLoginRight() {
        clickLoginRight();
        return new LoginPage(driver);
    }

    /*-
    public RegisterPage gotoRegisterRight() {
    	clickRegisterRight();
    	return new RegisterPage(driver);
    }

    public ForgotPasswordPage gotoForgottenPasswordRight() {
    	clickForgottenPasswordRight();
    	return new ForgotPasswordPage(driver);
    }
    */

    // Business Logic from AccountSidebarPart

    public MyAccountPage gotoRightPanelMyAccount(User user) {
        clickMyAccountRight();
        defaultLogin(user);
        return new MyAccountPage(driver);
    }

    /*-
    public AddressBookPage gotoRightPanelAddressBook(User user) {
    	clickAddressBookRight();
    	defaultLogin(user);
    	return new AddressBookPage(driver);
    }

    public WishListPage gotoRightPanelWishList(User user) {
    	clickWishListRight();
    	defaultLogin(user);
    	return new WishListPage(driver);
    }
    */

//    public OrderHistoryPage gotoRightPanelOrderHistory(IUser user) {}
//    public DownloadsPage gotoRightPanelDownloads(IUser user) {}
//    public RecurringpaymentsPage gotoRightPanelRecurringpayments(IUser user) {}
//    public RewardPointsPage gotoRightPanelRewardPoints(IUser user) {}
//    public ReturnsPage gotoRightPanelReturns(IUser user) {}
//    public TransactionsPage gotoRightPanelTransactions(IUser user) {}
//    public NewsletterPage gotoRightPanelNewsletter(IUser user) {}

}