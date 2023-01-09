package tasksonea.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import taskonea.HomePage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    private WebDriver driver;
    private static final String DEMOWEBSHOP_URL = "http://demowebshop.tricentis.com/";

    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }


    @BeforeMethod
    public void testSetUp() {
        driver = new ChromeDriver();  //Екземпляр Chrome Driver
        driver.manage().window().maximize();  //Відкрити браузер на весь екран
        driver.get(DEMOWEBSHOP_URL);  //Відкрили потрібний сайт
    }

    @AfterTest
    public void tearDown() {
        driver.close();  //закриття драйвера
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());  //потрібно для того щоб визивати метод з класу
    }

}
