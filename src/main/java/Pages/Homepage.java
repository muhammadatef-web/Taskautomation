package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage  extends  Pagebase{
     protected WebDriverWait wait;

    public Homepage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "ss" )
    WebElement  Search ;

    public WebElement Search (){
        return Search;
    }

    @FindBy(xpath = "//*[@data-mode='checkin' or @class='ed2ff9f661']" )
    WebElement  checkin ;

    public WebElement checkin (){
        //wait.until(ExpectedConditions.visibilityOf(checkin));
        return checkin;
    }
    @FindBy(xpath = "//*[@data-date='2022-12-20']" )
    WebElement  day20 ;

    public WebElement day20 (){

        return day20;
    }


    @FindBy(xpath = "//*[@data-date='2022-12-27']" )
    WebElement  day27 ;

    public WebElement day27 (){

        return day27;
    }

    @FindBy(xpath = "//span[contains(text(),'Search')]" )
    WebElement  Searchbtn ;
    public WebElement Serarchbtn (){

        return  Searchbtn ;
    }









}
