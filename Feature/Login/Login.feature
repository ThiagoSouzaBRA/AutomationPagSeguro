#language: pt

  @Login
  Funcionalidade: Validar login

    @PRD @Sucesso
    Cenario: CT01_ValidarLogin_Sucesso
      Dado que eu acesse a pagina inicial "https://pagseguro.uol.com.br/"
      Quando clicar na aba "Acessar minha conta"
      E clicar na aba "Entrar"
      E inserir cpf com "00000000030"
      E inserir senha com "teste123"
      E clicar no botao de login
      Entao devera apresentar a mensagem de erro "Usuário inválido"
