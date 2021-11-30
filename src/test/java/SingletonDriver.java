import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//*****Implementing Singleton Driver Class*****
public class SingletonDriver {

    private WebDriver driver;
    private static SingletonDriver d;

    private SingletonDriver(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
    }

    public static SingletonDriver getInstance(){
        if(d==null){
            d=new SingletonDriver();
        }
        return d;
    }

    public WebDriver get(){
        return driver;
    }
}
