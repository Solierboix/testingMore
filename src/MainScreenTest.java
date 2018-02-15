import org.junit.Test;
import  static org.junit.Assert.assertTrue;

public class MainScreenTest extends AbstractTest {

    @Test
    public void enterContactScreen(){
        app.mainScreen().waitUntilLoaded();
        app.mainScreen().displayContantForms();
        assertTrue(app.contactScreen().isActive());
    }

}
