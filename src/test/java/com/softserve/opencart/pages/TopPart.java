package com.softserve.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.softserve.edu21.Appl;
import com.softserve.opencart.data.Currencies;
import com.softserve.opencart.pages.account.AccountLogoutPage;
import com.softserve.opencart.pages.account.LoginPage;

import io.qameta.allure.Step;

public abstract class TopPart {
    public static final Logger logger = LoggerFactory.getLogger(TopPart.class);
    //
    protected final String OPTION_NULL_MESSAGE = "DropdownComponent is null";
    protected final String OPTION_NOT_FOUND_MESSAGE = "Option %s not found in %s";
    protected final String PAGE_DO_NOT_EXIST = "Page do not exist!!!";
    //
    protected final String TAG_ATTRIBUTE_VALUE = "value";
    protected final String TAG_ATTRIBUTE_SRC = "src";
    //
    protected final String LIST_CURRENCIES_CSSSELECTOR = "div.btn-group.open ul.dropdown-menu li";
    protected final String DROPDOWN_MYACCOUNT_CSSSELECTOR = ".dropdown-menu-right li";
    //
    protected WebDriver driver;
    //
    // private final String BUTTON_CURRENCY_CSSSELECTOR =
    // ".btn.btn-link.dropdown-toggle";
    private WebElement currency;
    private WebElement myAccount;
    private WebElement wishList;
    private WebElement shoppingCart;
    private WebElement checkout;
    private WebElement logo;
    private WebElement searchTopField;
    private WebElement searchTopButton;
    private WebElement cartButton;
    //
    // private MainMenuComponent MainMenuComponent;
    private DropdownComponent dropdownComponent;
    // ButtonCartContainerComponent
    private DropdownGuest dropdownGuest;
    private DropdownLogged dropdownLogged;

    public TopPart(WebDriver driver) {
        this.driver = driver;
        initElements();
    }

    private void initElements() {
        // init elements
        currency = driver.findElement(By.cssSelector(".btn.btn-link.dropdown-toggle"));
        myAccount = driver.findElement(By.cssSelector(".list-inline > li > a.dropdown-toggle"));
        wishList = driver.findElement(By.id("wishlist-total"));
        shoppingCart = driver.findElement(By.cssSelector("a[title='Shopping Cart']"));
        checkout = driver.findElement(By.cssSelector("a[title='Checkout']"));
        logo = driver.findElement(By.cssSelector("#logo a"));
        searchTopField = driver.findElement(By.name("search"));
        searchTopButton = driver.findElement(By.cssSelector("button.btn.btn-default"));
        cartButton = driver.findElement(By.cssSelector("#cart > button"));
    }

    // Page Object

    // currency
    public WebElement getCurrency() {
        // return driver.findElement(By.cssSelector(".btn.btn-link.dropdown-toggle"));
        // return driver.findElement(By.cssSelector(BUTTON_CURRENCY_CSSSELECTOR));
        return currency;
    }

    public String getCurrencyText() {
        return getCurrency().getText();
    }

    public void clickCurrency() {
        getCurrency().click();
    }

    // myAccount
    public WebElement getMyAccount() {
        return myAccount;
    }

    public String getMyAccountText() {
        return getMyAccount().getText();
    }

    public void clickMyAccount() {
        getMyAccount().click();
    }

    // wishList
    public WebElement getWishList() {
        return wishList;
    }

    public String getWishListText() {
        return getWishList().getText();
    }

    public void clickWishList() {
        getWishList().click();
    }

//    public int getWishListNumber() {
//        Use getWishListText()
//    }

    // shoppingCart
    public WebElement getShoppingCart() {
        return shoppingCart;
    }

    public String getShoppingCartText() {
        return getShoppingCart().getText();
    }

    public void clickShoppingCart() {
        getShoppingCart().click();
    }

    // checkout
    public WebElement getCheckout() {
        return checkout;
    }

    public String getCheckoutText() {
        return getCheckout().getText();
    }

    public void clickCheckout() {
        getCheckout().click();
    }

    // logo
    public WebElement getLogo() {
        return logo;
    }

    public void clickLogo() {
        getLogo().click();
    }

    // searchTopField
    public WebElement getSearchTopField() {
        return searchTopField;
    }

    public String getSearchTopFieldText() {
        return getSearchTopField().getAttribute(TAG_ATTRIBUTE_VALUE);
    }

    public void clearSearchTopField() {
        getSearchTopField().clear();
    }

    public void clickSearchTopField() {
        getSearchTopField().click();
    }

    public void setSearchTopField(String text) {
        getSearchTopField().sendKeys(text);
    }

    // searchTopButton
    public WebElement getSearchTopButton() {
        return searchTopButton;
    }

    public void clickSearchTopButton() {
        getSearchTopButton().click();
    }

    // cartButton
    public WebElement getCartButton() {
        return cartButton;
    }

    public String getCartButtonText() {
        return getCartButton().getText();
    }

    public void clickCartButton() {
        getCartButton().click();
    }

//  public int getCartButtonCount() {
//  Use getCartButtonText()
//}

//  public int getCartButtonSum() {
//  Use getCartButtonText()
//}

    // dropdownComponent
    protected DropdownComponent getDropdownComponent() {
        // LeaveUtils.castExceptionByCondition(dropdownOptions == null,
        // OPTION_NULL_MESSAGE);
        if (dropdownComponent == null) {
            // TODO Develop Custom Exception
            throw new RuntimeException(OPTION_NULL_MESSAGE);
        }
        return dropdownComponent;
    }

    private DropdownComponent createDropdownComponent(By searchLocator) {
        dropdownComponent = new DropdownComponent(driver, searchLocator);
        return getDropdownComponent();
    }

    private void clickDropdownComponentByPartialName(String optionName) {
        // LeaveUtils.castExceptionByCondition(!getDropdownOptions().isExistDropdownOptionByPartialName(optionName),
        // String.format(OPTION_NOT_FOUND_MESSAGE, optionName,
        // dropdownOptions.getListOptionsText().toString()));
        if (!getDropdownComponent().isExistDropdownOptionByPartialName(optionName)) {
            // TODO Develop Custom Exception
            throw new RuntimeException(String.format(OPTION_NOT_FOUND_MESSAGE, optionName,
                    getDropdownComponent().getListOptionsText().toString()));
        }
        getDropdownComponent().clickDropdownOptionByPartialName(optionName);
        dropdownComponent = null;
        // TODO Create page; Refresh page
        // closeDropdownComponent();
    }

    private void closeDropdownComponent() {
        clickSearchTopField();
        dropdownComponent = null;
    }

    // dropdownGuest
    protected DropdownGuest getDropdownGuest() {
        if (dropdownGuest == null) {
            // TODO Develop Custom Exception
            throw new RuntimeException(OPTION_NULL_MESSAGE);
        }
        return dropdownGuest;
    }

    private DropdownGuest createDropdownGuest() {
        dropdownGuest = new DropdownGuest(driver);
        return getDropdownGuest();
    }

    private void clickDropdownGuestRegister() {
        getDropdownGuest().clickRegister();
        // dropdownGuest = null;
        closeDropdownGuest();
    }

    private void clickDropdownGuestLogin() {
        getDropdownGuest().clickLogin();
        dropdownGuest = null;
        //closeDropdownGuest();
    }

    private void closeDropdownGuest() {
        clickSearchTopField();
        dropdownGuest = null;
    }

    // dropdownLogged
    protected DropdownLogged getDropdownLogged() {
        if (dropdownLogged == null) {
            // TODO Develop Custom Exception
            throw new RuntimeException(OPTION_NULL_MESSAGE);
        }
        return dropdownLogged;
    }

    private DropdownLogged createDropdownLogged() {
        dropdownLogged = new DropdownLogged(driver);
        return getDropdownLogged();
    }

    private void clickDropdownLoggedMyAccount() {
        getDropdownLogged().clickMyAccount();
        dropdownLogged = null;
    }

    private void clickDropdownLoggedOrderHistory() {
        getDropdownLogged().clickOrderHistory();
        dropdownLogged = null;
    }

    private void clickDropdownLoggedTransactions() {
        getDropdownLogged().clickTransactions();
        dropdownLogged = null;
    }

    private void clickDropdownLoggedDownloads() {
        getDropdownLogged().clickDownloads();
        dropdownLogged = null;
    }

    private void clickDropdownLoggedLogout() {
        getDropdownLogged().clickLogout();
        dropdownLogged = null;
    }

    private void closeDropdownLogged() {
        clickSearchTopField();
        dropdownLogged = null;
    }

    // Functional

    // currency
    private void openCurrencyDropdownComponent() {
        // clickSearchTopField();
        closeDropdownComponent();
        clickCurrency();
        createDropdownComponent(By.cssSelector(LIST_CURRENCIES_CSSSELECTOR));
    }

    // protected void clickCurrencyByPartialName(String currencyName) { // Code
    // Smell
    protected void clickCurrencyByPartialName(Currencies optionName) {
        openCurrencyDropdownComponent();
        // clickDropdownComponentByPartialName(currencyName);
        clickDropdownComponentByPartialName(optionName.toString());
    }

    public List<String> getListCurrencyNames() {
        openCurrencyDropdownComponent();
        List<String> result = getDropdownComponent().getListOptionsText();
        closeDropdownComponent();
        return result;
    }

    // myAccount
    protected void openMyAccountDropdown() {
        clickSearchTopField();
        clickMyAccount();
    }

    // TODO myAccount

    // searchTopField
    private void fillSearchTopField(String searchText) {
        clickSearchTopField();
        clearSearchTopField();
        setSearchTopField(searchText);
    }

    /*-
    protected void defaultLogin(User user) {
        if (!ApplicationStatus.get().isLogged()) {
            new LoginPage(driver).fillLogin(user);
        } else {
            // TODO throw Custom Exception
        }
    }
    */

    // Business Logic

    @Step("STEP Goto HomePage")
    public HomePage gotoHomePage() {
        clickLogo();
        return new HomePage(driver);
    }

    // dropdownGuest
    @Step("STEP Goto LoginPage")
    public LoginPage gotoLoginPage() {
        logger.debug("gotoLoginPage() start");
        openMyAccountDropdown();
        createDropdownGuest();
        clickDropdownGuestLogin();
        logger.debug("gotoLoginPage() done");
        return new LoginPage(driver);
    }

    // dropdownLogged
    public AccountLogoutPage logout() {
        openMyAccountDropdown();
        createDropdownLogged();
        clickDropdownLoggedLogout();
        return new AccountLogoutPage(driver);
    }
    
}
