package Steps.Consultas;

import Pages.HomePage;
import Pages.ModerninhaPage;
import Utils.BaseTest;
import io.cucumber.java.pt.*;
import org.junit.Assert;


public class ConsultasMaquininhasSteps extends BaseTest{

    public HomePage homepage =  new HomePage(GetDriver());
    public ModerninhaPage moderninhapage =  new ModerninhaPage(GetDriver());

    @Dado("clicar na aba {string}")
    public void clicar_na_aba(String titulo) {
        homepage.clickAba(titulo);
    }

    @Quando("acessar a pagina da Moderninha Smart")
    public void acessar_a_pagina_da_moderninha_smart() {
        Assert.assertTrue(moderninhapage.checkPage());
    }
    @Entao("devera ser apresentado a mensagem {string}")
    public void devera_ser_apresentado_a_mensagem(String texto) {
        Assert.assertTrue(moderninhapage.checkMensagemH1(texto));
    }
    @Entao("a promocao devera ser exibida {string}")
    public void a_promocao_devera_ser_exibida(String garantia) {
        Assert.assertTrue(moderninhapage.checkPromocaoModerninha(garantia));
    }
}
