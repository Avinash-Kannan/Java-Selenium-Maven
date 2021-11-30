import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Locale;

//***** Implementing Driver Class for Parallelization *****

public class DriverFactory {

    private WebDriver driver;
    private static DriverFactory d;

    public static DriverFactory getInstance(){
        if(d==null){
            d=new DriverFactory();
        }
        return d;
    }

    public WebDriver get(String browserName){
        WebDriver driver;
        switch (browserName.toLowerCase()){
            case "ie" :
                WebDriverManager.iedriver().setup();
                driver=new InternetExplorerDriver();
                break;
            case "chrome" :
                WebDriverManager.chromedriver().setup();
                driver =new ChromeDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver =new ChromeDriver();

        }
        return driver;
    }
}
