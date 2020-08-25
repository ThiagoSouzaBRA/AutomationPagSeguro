#language: pt

  @TaxasETarifas
  Funcionalidade: Validar Simulação

    Contexto:
      Dado que eu acesse a pagina inicial "https://pagseguro.uol.com.br/"
      E clicar na aba " Para Seu Negócio "
      E clicar na aba " Taxas e tarifas "
      Entao devera ser exibida a mensagem "Veja quanto você recebe a cada venda (à vista e parcelada)"

    @PRD @Debito @VendasComMaquininha @Sucesso
    Cenario: CT01_ValidarValorNaHora_Debito_Sucesso
      Dado que seja selecionado a opcao "Vendas com maquininha"
      E que eu insira o valor "10000"
      Quando selecionar a forma de pagamento "Débito"
      Entao devera ser apresentado o valor "97,61" na hora


    @PRD @CreditoAVista @VendasComMaquininha @Sucesso
    Cenario: CT02_ValidarValorNaHora_CreditoAVista_Sucesso
      Dado que seja selecionado a opcao "Vendas com maquininha"
      E que eu insira o valor "10000"
      Quando selecionar a forma de pagamento "Crédito à vista"
      Entao devera ser apresentado o valor "95,01" na hora

    @PRD @2Parcelas @VendasComMaquininha @Sucesso
    Cenario: CT02_ValidarValorNaHora_2Parcelas_Sucesso
      Dado que seja selecionado a opcao "Vendas com maquininha"
      E que eu insira o valor "10000"
      Quando selecionar a forma de pagamento "2 parcelas"
      Entao devera ser apresentado o valor "90,09" na hora

    @PRD @2Parcelas @VendasComMaquininha @Invalido
    Cenario: CT02_ValidarValorNaHora_2Parcelas_Invalido
      Dado que seja selecionado a opcao "Vendas com maquininha"
      E que eu insira o valor "100"
      Entao a forma de pagamento "2 parcelas" nao devera ser exibida