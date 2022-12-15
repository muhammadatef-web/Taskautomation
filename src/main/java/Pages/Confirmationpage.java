package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Confirmationpage extends Pagebase {
    public Confirmationpage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "(//span[contains(text(),' 20, 2022')])[1]")
    WebElement dayarrive ;

    public WebElement  dayarrive(){


        return   dayarrive;
    }
    @FindBy(xpath = "(//span[contains(text(),' 27, 2022')])[1]")
    WebElement dayleave ;

    public WebElement  dayleave(){


        return   dayleave;
    }

    @FindBy(xpath = "//h1[contains(text(),'Tolip Hotel Alexandria')]")
    WebElement namehotel ;

    public WebElement  namehotel(){


        return   namehotel;
    }




}
