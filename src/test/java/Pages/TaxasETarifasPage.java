package Pages;

import Utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TaxasETarifasPage extends PageBase {

    public WebDriver localdriver;

    @FindBy(xpath = "//h1[@class='banner__title' and text()='Taxas e tarifas']")
    @CacheLookup
    WebElement checkPage;

    @FindBy(id = "price")
    @CacheLookup
    WebElement inputValor;

    @FindBy(xpath = "//select[@id='select']")
    @CacheLookup
    WebElement selectFormaPagamento;

    public TaxasETarifasPage(WebDriver driver)
    {
        localdriver = driver;
        PageFactory.initElements(localdriver, this);

    }

    public boolean checkPage(){
        waitForElement(checkPage);
        return checkPage.isDisplayed();
    }

    public boolean checkFormaPagamento(String formaPagamento){

        try{
            WebElement el = localdriver.findElement(By.xpath("//option[text()='" + formaPagamento + "']"));
            scrollToElement(el);
            waitForElement(el);
            return checkPage.isDisplayed();
        }catch (Exception e){

        }
        return false;
    }

    public boolean checkMensagemH2(String mensagem){
        WebElement el = localdriver.findElement(By.xpath("//h2[text()='" + mensagem + "']"));
        scrollToElement(el);
        waitForElement(el);
        return el.isDisplayed();
    }

    public void clickOpcao(String opcao){
        WebElement el = localdriver.findElement(By.xpath("//label[text()='" + opcao + "']"));
        scrollToElement(el);
        waitForElement(el);
        try {
            el.click();
        }catch (Exception e){

        }
    }

    public void setInputValor(String valor){
        waitForElement(inputValor);
        scrollToElement(inputValor);
        inputValor.sendKeys(valor);
    }

    public void selecionarFormaPagamento(String formaPagamento){
        waitForElement(selectFormaPagamento);
        scrollToElement(selectFormaPagamento);
        selectFormaPagamento.click();

        WebElement el = localdriver.findElement(By.xpath("//option[text()='" + formaPagamento + "']"));
        try {
            waitForElement(el);
            el.click();
        }
        catch (Exception e){

        }
    }

    public boolean checkSaldoNaHora(String valor){
        WebElement el = localdriver.findElement(By.xpath("(//strong[@class='selling-simulation__received-value'] and text()='" + valor + "')[1]"));
        waitForElement(el);
        scrollToElement(el);

        return el.isDisplayed();

    }

}
