import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver = DriverFactory.getInstance().get("chrome");

    @BeforeMethod
    public void setUp() throws Exception {
        driver.get("http://localhost:3000/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SingletonDriver.getInstance().get().quit();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        SingletonDriver.getInstance().get().quit();

    }
}
