package Steps.Login;

import Pages.LoginPage;
import Utils.BaseTest;
import io.cucumber.java.pt.*;
import org.junit.Assert;

public class LoginSteps extends BaseTest {

    private LoginPage loginpage = new LoginPage(GetDriver());


    @Quando("inserir cpf com {string}")
    public void inserir_cpf_com(String cpf) {
        loginpage.inputCPF(cpf);
    }

    @Quando("inserir senha com {string}")
    public void inserir_senha_com(String senha) {
        loginpage.inputSenha(senha);
    }

    @Quando("clicar no botao de login")
    public void clicar_no_botao_de_login() {
        loginpage.clickBtnEntrar();
    }

    @Entao("devera apresentar a mensagem de erro {string}")
    public void devera_apresentar_a_mensagem_de_erro(String mensagem) {
        Assert.assertTrue(loginpage.checkMensagemErro(mensagem));
    }
}
