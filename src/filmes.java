public class filmes {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        /* as 2 linhas abaixo não estão sendo executadas*/
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Média calculada pela 3 notas do filme
        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);

        /* Descrição de sinopse do filme*/
        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);

        int classificacao = (int) (media/ 2);
        System.out.println(classificacao);
    }
}
