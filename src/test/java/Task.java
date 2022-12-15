import Pages.Confirmationpage;
import Pages.Detailhotelpage;
import Pages.Homepage;
import Pages.Hotelspage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Task {
    WebDriver driver;
    WebDriverWait wait;


    @BeforeClass
    public void Setup() {
        WebDriverManager.chromedriver().driverVersion("108.0.5359.71").setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.booking.com");
        driver.manage().window().maximize();
    }


           @Test
           public void Verifydatainconfiramationpage() throws InterruptedException, AWTException {
               driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
               Homepage homepage = new Homepage(driver);
               Detailhotelpage details = new Detailhotelpage(driver);
               Confirmationpage confirm = new Confirmationpage(driver);
               driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
               homepage.Search().sendKeys("Alexandria");
               driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
               homepage.Search().sendKeys(Keys.ARROW_DOWN);
               homepage.Search().click();
               homepage.checkin().click();
               homepage.day20().click();
               homepage.day27().click();
               driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
               homepage.Serarchbtn().click();
               Hotelspage hotelpage = new Hotelspage(driver);
               driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
               hotelpage.Scrolltofindtoliphotel();
               driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
               hotelpage.Seeavaiablebtn().click();
               // switch to new tab
               System.out.println(driver.getWindowHandles());
               ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
               driver.switchTo().window(tabs.get(1));
               driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
               details.queenbedradiobtn().click();
               details.select1fromlist().click();
               Select select = new Select(details.select1fromlist());
               select.selectByValue("1");
               details.clickonreservebtn().click();
               driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
               Assert.assertEquals(true, confirm.dayarrive().isDisplayed());
               Assert.assertEquals(true, confirm.dayleave().isDisplayed());
               Assert.assertEquals(true, confirm.namehotel().isDisplayed());
                }


                   @AfterClass
                   public void Teardown (){

                     driver.quit();

                   }


                                }





