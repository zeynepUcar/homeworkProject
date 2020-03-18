package PageObjectModel;

import Utilities.Driver;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class sgnin {


      WebDriver driver;

      public sgnin(){
          driver = Driver.getDriver();
          PageFactory.initElements(driver, this);
      }


}
