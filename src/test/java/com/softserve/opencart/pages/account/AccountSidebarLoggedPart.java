package com.softserve.opencart.pages.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AccountSidebarLoggedPart extends AccountSidebarPart {

    private WebElement editAccountRight;
    private WebElement passwordRight;
    private WebElement logoutRight;

    public AccountSidebarLoggedPart(WebDriver driver) {
        super(driver);
        initElements();
        //ApplicationStatus.get().setLogged(true);
    }

    private void initElements() {
        // init elements
        editAccountRight = driver.findElement(By.xpath("//div[@class='list-group']/a[contains(@href, 'account/edit')]"));
        passwordRight = driver.findElement(By.xpath("//div[@class='list-group']/a[contains(@href, 'account/password')]"));
        logoutRight = driver.findElement(By.xpath("//div[@class='list-group']/a[contains(@href, 'account/logout')]"));
    }

    // Page Object

    // editAccountRight
    public WebElement getEditAccountRight() {
        return editAccountRight;
    }

    public String getEditAccountRightText() {
        return getEditAccountRight().getText();
    }

    public void clickEditAccountRight() {
        getEditAccountRight().click();
    }

    // passwordRight
    public WebElement getPasswordRight() {
        return passwordRight;
    }

    public String getPasswordRightText() {
        return getPasswordRight().getText();
    }

    public void clickPasswordRight() {
        getPasswordRight().click();
    }

    // logoutRight
    public WebElement getLogoutRight() {
        return logoutRight;
    }

    public String getLogoutRightText() {
        return getLogoutRight().getText();
    }

    public void clickLogoutRight() {
        getLogoutRight().click();
    }

    // Functional

//    @Override
//    protected void defaultLogin(IUser user) {
//    }

    // Business Logic

    public EditAccountPage gotoRightPanelEditAccount() {
        clickEditAccountRight();
        return new EditAccountPage(driver);
    }
    
    /*-
    public ChangePasswordPage gotoRightPanelPassword() {
        clickPasswordRight();
        return new ChangePasswordPage(driver);
    }
    */

    public AccountLogoutPage gotoRightPanelLogout() {
        clickLogoutRight();
        return new AccountLogoutPage(driver);
    }

    // Business Logic from AccountSidebarPart

    public MyAccountPage gotoRightPanelMyAccount() {
        clickMyAccountRight();
        return new MyAccountPage(driver);
    }

    /*-
    public AddressBookPage gotoRightPanelAddressBook() {
        clickAddressBookRight();
        return new AddressBookPage(driver);
    }

    public WishListPage gotoRightPanelWishList() {
        clickWishListRight();
        return new WishListPage(driver);
    }
    */

//    public OrderHistoryPage gotoRightPanelOrderHistory() {}
//    public DownloadsPage gotoRightPanelDownloadst() {}
//    public RecurringpaymentsPage gotoRightPanelRecurringpayments() {}
//    public RewardPointsPage gotoRightPanelRewardPoints() {}
//    public ReturnsPage gotoRightPanelReturnsR() {}
//    public TransactionsPage gotoRightPanelTransactions() {}
//    public NewsletterPage gotoRightPanelNewsletter() {}

}
