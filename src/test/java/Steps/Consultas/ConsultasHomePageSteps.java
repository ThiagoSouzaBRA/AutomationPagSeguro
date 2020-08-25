package Steps.Consultas;
import Pages.HomePage;
import Utils.BaseTest;
import io.cucumber.java.pt.*;
import org.junit.Assert;


public class ConsultasHomePageSteps extends BaseTest {

    public HomePage homepage =  new HomePage(GetDriver());

    @Dado("que eu acesse a pagina inicial {string}")
    public void que_eu_acesse_a_pagina_inicial(String url) {

        goToURL("https://pagseguro.uol.com.br/");

    }

    @Entao("a logo do PagSeguro devera ser exibida")
    public void a_logo_do_pag_seguro_devera_ser_exibida() {
        Assert.assertTrue(homepage.checkPage());
    }


}
