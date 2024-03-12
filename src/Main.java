public class Main {
    public static void main(String[] args) {

        String senha = "12345";
        if (senha.equals("12346")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        String mensagem = """
                  Olá, mundo!
                  Este é um Text Block.
                  Ele permite escrever textos com múltiplas linhas
                  sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                  """;
        System.out.println(mensagem);

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

    }
}
