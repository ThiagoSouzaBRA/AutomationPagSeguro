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

public class ModerninhaPage extends PageBase {

    public WebDriver localdriver;


    @FindBy(xpath = "//a[text()=' PagSeguro ' and @href='https://pagseguro.uol.com.br']")
    @CacheLookup
    WebElement checkPageLogo;

    public ModerninhaPage(WebDriver driver)
    {
        localdriver = driver;
        PageFactory.initElements(localdriver, this);

    }

    public boolean checkPage(){
        waitForElement(checkPageLogo);
        return checkPageLogo.isDisplayed();
    }

    public boolean checkMensagemH1(String texto){
        WebElement el = localdriver.findElement(By.xpath("//h1[text()='"+ texto +"']"));
        waitForElement(el);
        scrollToElement(el);
        return el.isDisplayed();
    }

    public boolean checkPromocaoModerninha(String promocao){

        WebElement el = localdriver.findElement(By.xpath("//p[@class='price-block__disclaimer-text' and text()='" + promocao + "']"));
        waitForElement(checkPageLogo);
        scrollToElement(el);
        return el.isDisplayed();

    }


}
