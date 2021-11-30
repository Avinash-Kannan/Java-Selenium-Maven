import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class testProject extends BaseTest {

  //private WebDriver driver = SingletonDriver.getInstance().get();
 // private WebDriver driver = DriverFactory.getInstance().get("chrome");

  /*
  @BeforeMethod
    public void setUp() throws Exception {
      //WebDriverManager.chromedriver().setup();
      //System.setProperty("webdriver.chrome.driver","/Users/avinash.kannanthoughtworks.com/Documents/chromedriver");
      // driver =new ChromeDriver();
      driver.get("http://localhost:3000/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  } */


  @Test
    public void main() throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement btnDismiss = driver.findElement(By.xpath("//button//span[text()='Dismiss']"));
        btnDismiss.click();

        WebElement btnAccount = driver.findElement(By.id("navbarAccount"));
        wait.until(ExpectedConditions.visibilityOf(btnAccount));
        btnAccount.click();

        WebElement btnLogin = driver.findElement(By.xpath("//button//span[text()=' Login ']"));
        wait.until(ExpectedConditions.visibilityOf(btnLogin));
        btnLogin.click();

        Thread.sleep(5000);

        WebElement btnRegisterCust = driver.findElement(By.xpath("//a[text()='Not yet a customer?']/parent::div"));
        wait.until(ExpectedConditions.elementToBeClickable(btnRegisterCust));
        btnRegisterCust.click();

        WebElement txtInputEmail = driver.findElement(By.id("emailControl"));
        txtInputEmail.sendKeys("abc@gmail.com");

        WebElement txtInputPwd = driver.findElement(By.id("passwordControl"));
        txtInputPwd.sendKeys("abc@123");

        WebElement txtInputRepeatPwd = driver.findElement(By.id("repeatPasswordControl"));
        txtInputRepeatPwd.sendKeys("abc@123");

        WebElement ddSecQn=driver.findElement(By.xpath("//mat-select[@aria-label='Selection list for the security question']"));
      ddSecQn.click();

      WebElement ddOption1=driver.findElement(By.xpath("//mat-option[2]"));
      ddOption1.click();
        //Select ddSecQn = new Select(driver.findElement(By.xpath("//mat-select[@aria-label='Selection list for the security question']")));
        //ddSecQn.selectByIndex(1);

      WebElement txtSecAns = driver.findElement(By.id("securityAnswerControl"));
      txtSecAns.sendKeys("def");

      Thread.sleep(5000);

      WebElement btnRegister = driver.findElement(By.id("registerButton"));
      wait.until(ExpectedConditions.visibilityOf(btnRegister));
     //if (btnRegister.getAttribute("disabled")=="false")
      /*if (btnRegister.isEnabled())
      {
          System.out.println("Able to Register New Customer Successfully");
      }
      else{
          System.out.println("Register New Customer Failed");
      }*/
      Assert.assertTrue(btnRegister.isEnabled(),"Register New Customer Failed");

    }
/*
        @AfterMethod
        public void tearDown() throws Exception{
        driver.quit();

    } */
}
