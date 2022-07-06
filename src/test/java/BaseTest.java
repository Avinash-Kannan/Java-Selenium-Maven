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
// Test Activities  :

// Sprint  Start

// User story kick off - Both QA’s, BA’s, Dev

// Create QA : Manual - Sub task 
// {Description : Platform , OS Version, Device Model , Functionality}

// QA Work -  TCs -> VSO  ( Assign priorities )

// Create  DevBox sub task - QA / Both QA’s, BA’s, Dev

// User Story - QA In Progress -> Manual Execution -> Bug sub tasks if any ( screenshots ) 

// After QA complete (If Bugs are open) - Change story to Bug fixing

// User Story ( QA and Bug fixing Done) - QA Sign Off

// [ In Sprint /  n+1 Sprint ]
// Create Regression / Smoke Automation Story - Link TCs  (Add Tags - Regression , Smoke)

// End of Sprint 
