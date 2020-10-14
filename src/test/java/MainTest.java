import org.testng.annotations.Test;
import utils.ReadProperties;

public class MainTest extends BaseTest {


    @Test
    public void firstTest() {
        webDriver.get(ReadProperties.url);
    }


}
