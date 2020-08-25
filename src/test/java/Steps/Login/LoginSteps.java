package Steps.Login;

import Pages.LoginPage;
import Utils.BaseTest;
import io.cucumber.java.pt.*;
import org.junit.Assert;

public class LoginSteps extends BaseTest {

    LoginPage loginpage = new LoginPage(GetDriver());

    @Quando("clicar no botao entrar")
    public void clicar_no_botao(String string) {
        loginpage.clickBtnEntrar();
    }

    @Entao("devera apresentar a mensagem {string}")
    public void devera_apresentar_a_mensagem(String mensagem) {
        Assert.assertTrue(loginpage.checkAviso(mensagem));
    }

}
