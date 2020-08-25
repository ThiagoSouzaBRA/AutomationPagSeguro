package Steps.Simulacao;

import Pages.TaxasETarifasPage;
import Utils.BaseTest;
import io.cucumber.java.pt.*;
import org.junit.Assert;


public class TaxasETarifasSteps extends BaseTest {

    private TaxasETarifasPage taxasetarifaspage = new TaxasETarifasPage(GetDriver());

    @Entao("devera ser exibida a mensagem {string}")
    public void devera_ser_exibida_a_mensagem(String mensagem) {
        Assert.assertTrue(taxasetarifaspage.checkPage());
        Assert.assertTrue(taxasetarifaspage.checkMensagemH2(mensagem));
    }


    @Dado("que seja selecionado a opcao {string}")
    public void que_seja_selecionado_a_opcao(String opcao) {
        taxasetarifaspage.clickOpcao(opcao);
    }

    @Dado("que eu insira o valor {string}")
    public void que_eu_insira_o_valor(String valor) {
        taxasetarifaspage.setInputValor(valor);
    }

    @Quando("selecionar a forma de pagamento {string}")
    public void selecionar_a_forma_de_pagamento(String formaPagamento) {
        taxasetarifaspage.selecionarFormaPagamento(formaPagamento);
    }

    @Entao("devera ser apresentado o valor {string} na hora")
    public void devera_ser_apresentado_o_valor_na_hora(String string) {
        Assert.assertTrue(taxasetarifaspage.checkPage());

    }

    @Entao("a forma de pagamento {string} nao devera ser exibida")
    public void a_forma_de_pagamento_nao_devera_ser_exibida(String pagamento) {
        Assert.assertFalse(taxasetarifaspage.checkFormaPagamento(pagamento));

    }

}
