import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AbstractTest {

    protected AppiumDriver<MobileElement> driver;
    protected App app;

    private final static String APPIUM_SERVER_URL = "http://127.0.0.1:4723/wd/hub";

    @Before
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
        driver = new AndroidDriver<MobileElement>(new URL(APPIUM_SERVER_URL), capabilities);
        app = new App(driver);
    }

    @After
    public void quitDriver(){
        driver.quit();
    }


}
