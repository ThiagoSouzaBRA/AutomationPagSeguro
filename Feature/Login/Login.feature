#language: pt

  @Login
  Funcionalidade: Validar login's

    @PRD @Invalido
    Cenario: CT01_ValidarLogin_Invalido
      Dado que eu acesse a pagina inicial "https://pagseguro.uol.com.br/"
      Quando clicar na aba "Acessar minha conta"
      E clicar na aba "Entrar"
      E clicar no botao entrar
      Entao devera apresentar a mensagem "Preencha o campo de usuário / Preencha sua senha"
