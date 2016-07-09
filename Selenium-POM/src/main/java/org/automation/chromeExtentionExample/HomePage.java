package org.automation.chromeExtentionExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

/**
 * Created by shantonu on 7/9/16.
 * AUto generated POM using Chrome extention => https://chrome.google.com/webstore/detail/selenium-page-object-gene/epgmnmcjdhapiojbohkkemlfkegmbebb
 *Small edited for number  asdded as webelement (java does not support as variable)
 *
 */
public class HomePage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#slideshow0 ol.flex-control-nav.flex-control-paging li:nth-of-type(1) a.flex-active")
    @CacheLookup
    private WebElement _11;

    @FindBy(css = "#slideshow0 ol.flex-control-nav.flex-control-paging li:nth-of-type(2) a")
    @CacheLookup
    private WebElement _12;

    @FindBy(css = "#carousel0 ol.flex-control-nav.flex-control-paging li:nth-of-type(1) a")
    @CacheLookup
    private WebElement _21;

    @FindBy(css = "#carousel0 ol.flex-control-nav.flex-control-paging li:nth-of-type(2) a.flex-active")
    @CacheLookup
    private WebElement _22;

    @FindBy(css = "#carousel0 ol.flex-control-nav.flex-control-paging li:nth-of-type(3) a")
    @CacheLookup
    private WebElement _3;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=information/information&information_id=4']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(1) div.product-thumb.transition div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart1;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(2) div.product-thumb.transition div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart2;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(3) div.product-thumb.transition div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart3;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(4) div.product-thumb.transition div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart4;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=affiliate/account']")
    @CacheLookup
    private WebElement affiliates;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(3) div.product-thumb.transition div:nth-of-type(1) a")
    @CacheLookup
    private WebElement appleCinema301;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(3) div.product-thumb.transition div:nth-of-type(2) h4 a")
    @CacheLookup
    private WebElement appleCinema302;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/manufacturer']")
    @CacheLookup
    private WebElement brands;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=33']")
    @CacheLookup
    private WebElement cameras;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(4) div.product-thumb.transition div:nth-of-type(1) a")
    @CacheLookup
    private WebElement canonEos5d1;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(4) div.product-thumb.transition div:nth-of-type(2) h4 a")
    @CacheLookup
    private WebElement canonEos5d2;

    @FindBy(css = "a[title='Checkout']")
    @CacheLookup
    private WebElement checkout;

    @FindBy(css = "#menu div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(3) a.dropdown-toggle")
    @CacheLookup
    private WebElement components;

    @FindBy(css = ".common-home footer div.container div.row div:nth-of-type(2) ul.list-unstyled li:nth-of-type(1) a")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "button.btn.btn-link.dropdown-toggle")
    @CacheLookup
    private WebElement currency;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=information/information&information_id=6']")
    @CacheLookup
    private WebElement deliveryInformation;

    @FindBy(css = "#menu div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(1) a.dropdown-toggle")
    @CacheLookup
    private WebElement desktops;

    @FindBy(name = "EUR")
    @CacheLookup
    private WebElement euro;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=account/voucher']")
    @CacheLookup
    private WebElement giftVouchers;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(2) div.product-thumb.transition div:nth-of-type(1) a")
    @CacheLookup
    private WebElement iphone1;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(2) div.product-thumb.transition div:nth-of-type(2) h4 a")
    @CacheLookup
    private WebElement iphone2;

    @FindBy(css = "a[href='index.php?route=product/product&path=57&product_id=49']")
    @CacheLookup
    private WebElement iphone6;

    @FindBy(css = "button.btn.btn-inverse.btn-block.btn-lg.dropdown-toggle")
    @CacheLookup
    private WebElement items0000;

    @FindBy(css = "#menu div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(2) a.dropdown-toggle")
    @CacheLookup
    private WebElement laptopsNotebooks;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=account/login']")
    @CacheLookup
    private WebElement login;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=20_27']")
    @CacheLookup
    private WebElement mac1;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(1) div.product-thumb.transition div:nth-of-type(1) a")
    @CacheLookup
    private WebElement macbook1;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(1) div.product-thumb.transition div:nth-of-type(2) h4 a")
    @CacheLookup
    private WebElement macbook2;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=18_46']")
    @CacheLookup
    private WebElement macs0;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=25_29']")
    @CacheLookup
    private WebElement miceAndTrackballs0;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=25_28']")
    @CacheLookup
    private WebElement monitors2;

    @FindBy(css = "#menu div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(8) a.dropdown-toggle")
    @CacheLookup
    private WebElement mp3Players;

    @FindBy(css = "a[title='My Account']")
    @CacheLookup
    private WebElement myAccount1;

    @FindBy(css = ".common-home footer div.container div.row div:nth-of-type(4) ul.list-unstyled li:nth-of-type(1) a")
    @CacheLookup
    private WebElement myAccount2;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=account/newsletter']")
    @CacheLookup
    private WebElement newsletter;

    @FindBy(css = "#slideshow0 ul.flex-direction-nav li:nth-of-type(2) a.flex-next")
    @CacheLookup
    private WebElement next1;

    @FindBy(css = "#carousel0 ul.flex-direction-nav li:nth-of-type(2) a.flex-next")
    @CacheLookup
    private WebElement next2;

    @FindBy(css = "a[href='http://www.opencart.com']")
    @CacheLookup
    private WebElement opencart;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=account/order']")
    @CacheLookup
    private WebElement orderHistory;

    private final String pageLoadedText = "Powered by an Intel Core 2 Duo processor at speeds up to 2";

    private final String pageUrl = "/";

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=20_26']")
    @CacheLookup
    private WebElement pc0;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=24']")
    @CacheLookup
    private WebElement phonesPdas;

    @FindBy(name = "GBP")
    @CacheLookup
    private WebElement poundSterling;

    @FindBy(css = "#slideshow0 ul.flex-direction-nav li:nth-of-type(1) a.flex-prev")
    @CacheLookup
    private WebElement previous1;

    @FindBy(css = "#carousel0 ul.flex-direction-nav li:nth-of-type(1) a.flex-prev")
    @CacheLookup
    private WebElement previous2;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=25_30']")
    @CacheLookup
    private WebElement printers0;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=information/information&information_id=3']")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=account/register']")
    @CacheLookup
    private WebElement register;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=account/return/add']")
    @CacheLookup
    private WebElement returns;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=25_31']")
    @CacheLookup
    private WebElement scanners0;

    @FindBy(css = "#menu div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(3) div.dropdown-menu a.see-all")
    @CacheLookup
    private WebElement seeAllComponents;

    @FindBy(css = "#menu div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(1) div.dropdown-menu a.see-all")
    @CacheLookup
    private WebElement seeAllDesktops;

    @FindBy(css = "#menu div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(2) div.dropdown-menu a.see-all")
    @CacheLookup
    private WebElement seeAllLaptopsNotebooks;

    @FindBy(css = "#menu div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(8) div.dropdown-menu a.see-all")
    @CacheLookup
    private WebElement seeAllMp3Players;

    @FindBy(css = "a[title='Shopping Cart']")
    @CacheLookup
    private WebElement shoppingCart;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=information/sitemap']")
    @CacheLookup
    private WebElement siteMap;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=17']")
    @CacheLookup
    private WebElement software;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/special']")
    @CacheLookup
    private WebElement specials;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=57']")
    @CacheLookup
    private WebElement tablets;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=information/information&information_id=5']")
    @CacheLookup
    private WebElement termsConditions;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_43']")
    @CacheLookup
    private WebElement test110;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_44']")
    @CacheLookup
    private WebElement test120;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_47']")
    @CacheLookup
    private WebElement test150;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_48']")
    @CacheLookup
    private WebElement test160;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_49']")
    @CacheLookup
    private WebElement test170;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_50']")
    @CacheLookup
    private WebElement test180;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_51']")
    @CacheLookup
    private WebElement test190;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_52']")
    @CacheLookup
    private WebElement test200;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_53']")
    @CacheLookup
    private WebElement test210;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_54']")
    @CacheLookup
    private WebElement test220;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_55']")
    @CacheLookup
    private WebElement test230;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_56']")
    @CacheLookup
    private WebElement test240;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_38']")
    @CacheLookup
    private WebElement test40;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_37']")
    @CacheLookup
    private WebElement test50;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_39']")
    @CacheLookup
    private WebElement test60;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_40']")
    @CacheLookup
    private WebElement test70;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_41']")
    @CacheLookup
    private WebElement test80;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_42']")
    @CacheLookup
    private WebElement test90;

    @FindBy(name = "USD")
    @CacheLookup
    private WebElement usDollar;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=25_32']")
    @CacheLookup
    private WebElement webCameras0;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=18_45']")
    @CacheLookup
    private WebElement windows0;

    @FindBy(css = ".common-home footer div.container div.row div:nth-of-type(4) ul.list-unstyled li:nth-of-type(3) a")
    @CacheLookup
    private WebElement wishList;

    @FindBy(id = "wishlist-total")
    @CacheLookup
    private WebElement wishList0;

    @FindBy(name = "search")
    @CacheLookup
    private WebElement yourShoppingCartIsEmpty;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=common/home']")
    @CacheLookup
    private WebElement yourStore;

    public HomePage() {
    }

    public HomePage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public HomePage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public HomePage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on 1 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage click1Link1() {
        _11.click();
        return this;
    }

    /**
     * Click on 2 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage click1Link2() {
        _12.click();
        return this;
    }

    /**
     * Click on 1 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage click2Link1() {
        _21.click();
        return this;
    }

    /**
     * Click on 2 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage click2Link2() {
        _22.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Add To Cart Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart1Button() {
        addToCart1.click();
        return this;
    }

    /**
     * Click on Add To Cart Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart2Button() {
        addToCart2.click();
        return this;
    }

    /**
     * Click on Add To Cart Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart3Button() {
        addToCart3.click();
        return this;
    }

    /**
     * Click on Add To Cart Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAddToCart4Button() {
        addToCart4.click();
        return this;
    }

    /**
     * Click on Affiliates Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAffiliatesLink() {
        affiliates.click();
        return this;
    }

    /**
     * Click on Apple Cinema 30 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAppleCinema301Link() {
        appleCinema301.click();
        return this;
    }

    /**
     * Click on Apple Cinema 30 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAppleCinema302Link() {
        appleCinema302.click();
        return this;
    }

    /**
     * Click on Brands Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBrandsLink() {
        brands.click();
        return this;
    }

    /**
     * Click on Cameras Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCamerasLink() {
        cameras.click();
        return this;
    }

    /**
     * Click on Canon Eos 5d Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCanonEos5d1Link() {
        canonEos5d1.click();
        return this;
    }

    /**
     * Click on Canon Eos 5d Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCanonEos5d2Link() {
        canonEos5d2.click();
        return this;
    }

    /**
     * Click on Checkout Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCheckoutLink() {
        checkout.click();
        return this;
    }

    /**
     * Click on Components Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickComponentsLink() {
        components.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Currency Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCurrencyButton() {
        currency.click();
        return this;
    }

    /**
     * Click on Delivery Information Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDeliveryInformationLink() {
        deliveryInformation.click();
        return this;
    }

    /**
     * Click on Desktops Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickDesktopsLink() {
        desktops.click();
        return this;
    }

    /**
     * Click on Euro Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEuroButton() {
        euro.click();
        return this;
    }

    /**
     * Click on Gift Vouchers Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickGiftVouchersLink() {
        giftVouchers.click();
        return this;
    }

    /**
     * Click on Iphone Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickIphone1Link() {
        iphone1.click();
        return this;
    }

    /**
     * Click on Iphone Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickIphone2Link() {
        iphone2.click();
        return this;
    }

    /**
     * Click on Iphone 6 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickIphone6Link() {
        iphone6.click();
        return this;
    }

    /**
     * Click on 0 Items 0.00 Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickItems000Button0() {
        items0000.click();
        return this;
    }

    /**
     * Click on Laptops Notebooks Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLaptopsNotebooksLink() {
        laptopsNotebooks.click();
        return this;
    }

    /**
     * Click on 3 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLink3() {
        _3.click();
        return this;
    }

    /**
     * Click on Login Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLoginLink() {
        login.click();
        return this;
    }

    /**
     * Click on Mac 1 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMac1Link() {
        mac1.click();
        return this;
    }

    /**
     * Click on Macbook Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMacbook1Link() {
        macbook1.click();
        return this;
    }

    /**
     * Click on Macbook Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMacbook2Link() {
        macbook2.click();
        return this;
    }

    /**
     * Click on Macs 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMacs0Link() {
        macs0.click();
        return this;
    }

    /**
     * Click on Mice And Trackballs 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMiceAndTrackballs0Link() {
        miceAndTrackballs0.click();
        return this;
    }

    /**
     * Click on Monitors 2 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMonitors2Link() {
        monitors2.click();
        return this;
    }

    /**
     * Click on Mp3 Players Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMp3PlayersLink() {
        mp3Players.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMyAccount1Link() {
        myAccount1.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMyAccount2Link() {
        myAccount2.click();
        return this;
    }

    /**
     * Click on Newsletter Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickNewsletterLink() {
        newsletter.click();
        return this;
    }

    /**
     * Click on Next Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickNext1Link() {
        next1.click();
        return this;
    }

    /**
     * Click on Next Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickNext2Link() {
        next2.click();
        return this;
    }

    /**
     * Click on Opencart Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOpencartLink() {
        opencart.click();
        return this;
    }

    /**
     * Click on Order History Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOrderHistoryLink() {
        orderHistory.click();
        return this;
    }

    /**
     * Click on Pc 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPc0Link() {
        pc0.click();
        return this;
    }

    /**
     * Click on Phones Pdas Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPhonesPdasLink() {
        phonesPdas.click();
        return this;
    }

    /**
     * Click on Pound Sterling Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPoundSterlingButton() {
        poundSterling.click();
        return this;
    }

    /**
     * Click on Previous Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrevious1Link() {
        previous1.click();
        return this;
    }

    /**
     * Click on Previous Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrevious2Link() {
        previous2.click();
        return this;
    }

    /**
     * Click on Printers 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrinters0Link() {
        printers0.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

    /**
     * Click on Register Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickRegisterLink() {
        register.click();
        return this;
    }

    /**
     * Click on Returns Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickReturnsLink() {
        returns.click();
        return this;
    }

    /**
     * Click on Scanners 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickScanners0Link() {
        scanners0.click();
        return this;
    }

    /**
     * Click on See All Components Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSeeAllComponentsLink() {
        seeAllComponents.click();
        return this;
    }

    /**
     * Click on See All Desktops Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSeeAllDesktopsLink() {
        seeAllDesktops.click();
        return this;
    }

    /**
     * Click on See All Laptops Notebooks Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSeeAllLaptopsNotebooksLink() {
        seeAllLaptopsNotebooks.click();
        return this;
    }

    /**
     * Click on See All Mp3 Players Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSeeAllMp3PlayersLink() {
        seeAllMp3Players.click();
        return this;
    }

    /**
     * Click on Shopping Cart Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickShoppingCartLink() {
        shoppingCart.click();
        return this;
    }

    /**
     * Click on Site Map Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSiteMapLink() {
        siteMap.click();
        return this;
    }

    /**
     * Click on Software Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSoftwareLink() {
        software.click();
        return this;
    }

    /**
     * Click on Specials Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSpecialsLink() {
        specials.click();
        return this;
    }

    /**
     * Click on Tablets Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTabletsLink() {
        tablets.click();
        return this;
    }

    /**
     * Click on Terms Conditions Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTermsConditionsLink() {
        termsConditions.click();
        return this;
    }

    /**
     * Click on Test 11 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest110Link() {
        test110.click();
        return this;
    }

    /**
     * Click on Test 12 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest120Link() {
        test120.click();
        return this;
    }

    /**
     * Click on Test 15 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest150Link() {
        test150.click();
        return this;
    }

    /**
     * Click on Test 16 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest160Link() {
        test160.click();
        return this;
    }

    /**
     * Click on Test 17 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest170Link() {
        test170.click();
        return this;
    }

    /**
     * Click on Test 18 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest180Link() {
        test180.click();
        return this;
    }

    /**
     * Click on Test 19 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest190Link() {
        test190.click();
        return this;
    }

    /**
     * Click on Test 20 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest200Link() {
        test200.click();
        return this;
    }

    /**
     * Click on Test 21 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest210Link() {
        test210.click();
        return this;
    }

    /**
     * Click on Test 22 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest220Link() {
        test220.click();
        return this;
    }

    /**
     * Click on Test 23 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest230Link() {
        test230.click();
        return this;
    }

    /**
     * Click on Test 24 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest240Link() {
        test240.click();
        return this;
    }

    /**
     * Click on Test 4 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest40Link() {
        test40.click();
        return this;
    }

    /**
     * Click on Test 5 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest50Link() {
        test50.click();
        return this;
    }

    /**
     * Click on Test 6 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest60Link() {
        test60.click();
        return this;
    }

    /**
     * Click on Test 7 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest70Link() {
        test70.click();
        return this;
    }

    /**
     * Click on Test 8 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest80Link() {
        test80.click();
        return this;
    }

    /**
     * Click on Test 9 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTest90Link() {
        test90.click();
        return this;
    }

    /**
     * Click on Us Dollar Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickUsDollarButton() {
        usDollar.click();
        return this;
    }

    /**
     * Click on Web Cameras 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWebCameras0Link() {
        webCameras0.click();
        return this;
    }

    /**
     * Click on Windows 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWindows0Link() {
        windows0.click();
        return this;
    }

    /**
     * Click on Wish List 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWishList0Link() {
        wishList0.click();
        return this;
    }

    /**
     * Click on Wish List Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWishListLink() {
        wishList.click();
        return this;
    }

    /**
     * Click on Your Store Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickYourStoreLink() {
        yourStore.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the HomePage class instance.
     */
    public HomePage fill() {
        setYourShoppingCartIsEmptyTextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the home page of open cart class instance.
     */
    public HomePage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Your Shopping Cart Is Empty Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setYourShoppingCartIsEmptyTextField() {
        return setYourShoppingCartIsEmptyTextField(data.get("YOUR_SHOPPING_CART_IS_EMPTY"));
    }

    /**
     * Set value to Your Shopping Cart Is Empty Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setYourShoppingCartIsEmptyTextField(String yourShoppingCartIsEmptyValue) {
        yourShoppingCartIsEmpty.sendKeys(yourShoppingCartIsEmptyValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the home page of open cart class instance.
     */
    public HomePage submit() {
        clickCurrencyButton();
        HomePage target = new HomePage(driver, data, timeout);
        PageFactory.initElements(driver, target);
        return target;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the HomePage class instance.
     */
    public HomePage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the HomePage class instance.
     */
    public HomePage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

