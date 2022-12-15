package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Detailhotelpage extends Pagebase {
Select select ;

    public Detailhotelpage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//span[contains(text(),'queen bed')])[1]")
    WebElement queenbedradiobtn ;

    public WebElement  queenbedradiobtn(){
    return   queenbedradiobtn;

    }

    @FindBy(xpath = "(//select[@data-room-id='78883120'])[1]")
    WebElement amountlist ;

    public WebElement  select1fromlist(){


        return   amountlist;
    }


    @FindBy(xpath = "//span[@class='bui-button__text js-reservation-button__text']")
    WebElement reservebtn ;

    public WebElement  clickonreservebtn(){
        return   reservebtn;
    }



}
