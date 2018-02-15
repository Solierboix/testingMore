package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainScreen {
    
    private AppiumDriver driver;

    @AndroidFindBy (xpath = REGISTER_TEXT_XPATH)
    private MobileElement registerNewAccount;

    @AndroidFindBy (xpath = ACTIVATE_TEXT_XPATH)
    private MobileElement activateNewAccount;

    @AndroidFindBy (xpath = DEMO_TEXT_XPATH)
    private MobileElement demoVersion;

    @AndroidFindBy (xpath = CONTACT_TEXT_XPATH)
    private MobileElement contactForm;


    public MainScreen(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 15, TimeUnit.SECONDS), this);
    }

    public void waitUntilLoaded() {
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(REGISTER_TEXT_XPATH)));
    }

    public void displayContantForms(){
        contactForm.click();
    }






}
