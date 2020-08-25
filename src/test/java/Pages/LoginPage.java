package Pages;

import Utils.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageBase {

    public WebDriver localdriver;

    @FindBy(xpath = "//img[@alt='Pagseguro Logotipo']")
    @CacheLookup
    WebElement checkPageLogo;

    @FindBy(xpath = "//label[text()='CPF, CNPJ ou E-mail']")
    @CacheLookup
    WebElement labelInputCPF;

    @FindBy(xpath = "//input[@placeholder='CPF, CNPJ ou E-mail']")
    @CacheLookup
    WebElement inputCPF;

    @FindBy(xpath = "//label[text()='Senha']")
    @CacheLookup
    WebElement labelInputSenha;

    @FindBy(xpath = "//input[@placeholder='Senha']")
    @CacheLookup
    WebElement inputSenha;

    @FindBy(xpath = "//button[text()='Entrar']")
    @CacheLookup
    WebElement btnEntrar;

    @FindBy(xpath = "//div[@id='alertLogin']//strong[text()='Usuário inválido']")
    @CacheLookup
    WebElement labelMsgLogin_Invalido;

    public LoginPage(WebDriver driver)
    {
        localdriver = driver;
        PageFactory.initElements(localdriver, this);
    }

    public void inputCPF(String cpf){
        waitForElement(inputCPF);
        inputCPF.sendKeys(cpf);
    }

    public void inputSenha(String senha){
        waitForElement(inputSenha);
        inputSenha.sendKeys(senha);
    }

    public boolean checkPage(){
        return checkPageLogo.isDisplayed();
    }

    public void clickBtnEntrar(){
        waitForElement(btnEntrar);
        btnEntrar.click();
    }

    public boolean checkMensagemErro(String mensagem){
        waitForElement(labelMsgLogin_Invalido);
        return labelMsgLogin_Invalido.isDisplayed();
    }

}
