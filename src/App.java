import io.appium.java_client.AppiumDriver;
import screens.ContactScreen;
import screens.MainScreen;

public class App {

    private AppiumDriver driver;

    public App (AppiumDriver driver){
        this.driver = driver;
    }

    public MainScreen mainScreen() {
        return new MainScreen(driver);
    }

    public ContactScreen contactScreen() {
        return new ContactScreen(driver);
    }
}
