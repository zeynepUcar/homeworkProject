package Utilities;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null) {
<<<<<<< HEAD
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\omero\\Selenium\\ChromeDriver\\chromedriver.exe");
            driver = new ChromeDriver(  );
=======
            ChromeDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
>>>>>>> origin/master

        }
        return driver;
    }


    }

