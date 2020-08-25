package Pages;

import Utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase {

    public WebDriver localdriver;

    @FindBy(xpath = "//a[text()=' PagSeguro ' and @href='https://pagseguro.uol.com.br']")
    @CacheLookup
    WebElement checkPageLogo;

    public HomePage(WebDriver driver)
    {
        localdriver = driver;
        PageFactory.initElements(localdriver, this);
    }


    public boolean checkPage(){
        waitForElement(checkPageLogo);
        return checkPageLogo.isDisplayed();
    }

    public void clickAba(String titulo){
        WebElement el = localdriver.findElement(By.xpath("//a[text()='" + titulo + "']"));
        waitForElement(el);
        el.click();
    }

}
