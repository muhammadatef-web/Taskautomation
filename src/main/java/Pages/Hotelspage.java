package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hotelspage extends  Pagebase {


    public Hotelspage(WebDriver driver) {
        super(driver);
    }

@FindBy(xpath = "//div[contains(text(),'Tolip Hotel Alexandria')]")
    WebElement hoteltolip ;
    public WebElement Scrolltofindtoliphotel (){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", hoteltolip);
        return hoteltolip;
    }
    @FindBy(xpath = "//div[contains(text(),'Tolip Hotel Alexandria')]/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*/parent::*")
    WebElement seeavailaibitybtnparent ;

    @FindBy(xpath = ".//span[contains(text(),'See availability')]")
    WebElement seeavaiablebtn = seeavailaibitybtnparent.findElement(By.xpath(".//span[contains(text(),'See availability')]")) ;
    public WebElement Seeavaiablebtn (){

        return seeavaiablebtn;
    }











}
