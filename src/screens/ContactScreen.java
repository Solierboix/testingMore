package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ContactScreen {

    private AppiumDriver driver;

    private static final String CONTACT_TEXT_XPATH = "//android.widget.TextView[@text='Kontakt'])";


    @AndroidFindBy (xpath = CONTACT_TEXT_XPATH)
    private MobileElement contactToolbarTextl;

    public ContactScreen(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 15, TimeUnit.SECONDS), this);
    }

    public boolean isActive() {
        try {
            new WebDriverWait(driver, 15)
                    .until(ExpectedConditions.visibilityOf(contactToolbarTextl));
            return true;
        } catch (NotFoundException e){
            return false;
        }
    }

}
