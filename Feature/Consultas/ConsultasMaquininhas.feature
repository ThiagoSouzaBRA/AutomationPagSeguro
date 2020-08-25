#language: pt

  @Maquininhas
  Funcionalidade: Validar Dados exibidos das Maquinhas PagSeguro

    @PRD @ModerninhaSmart @Sucesso
    Cenario: CT01_ValidarPaginaModerninhaSmart_Sucesso
      Dado que eu acesse a pagina inicial "https://pagseguro.uol.com.br/"
      E clicar na aba " Para Seu Negócio "
      E clicar na aba " Maquininhas "
      E clicar na aba " Moderninha Smart "
      Quando acessar a pagina da Moderninha Smart
      Entao devera ser apresentado a mensagem "Principais vantagens de vender com a Moderninha Smart"

    @PRD @ModerninhaSmart @Sucesso
    Cenario: CT02_ValidarPaginaModerninhaSmart_Promocao_Sucesso
      Dado que eu acesse a pagina inicial "https://pagseguro.uol.com.br/"
      E clicar na aba " Para Seu Negócio "
      E clicar na aba " Maquininhas "
      E clicar na aba " Moderninha Smart "
      Quando acessar a pagina da Moderninha Smart
      Entao a promocao devera ser exibida " Promoção válida até 31/08 "