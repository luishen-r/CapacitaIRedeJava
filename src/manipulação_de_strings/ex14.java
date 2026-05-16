package manipulação_de_strings;

public class ex14 {
    public static void main(String[] args) {
        String nome = "Luis";
        String saudacao = "Olá " + nome;
        System.out.println(saudacao);

        String frase = "Java é divertido!";
        char letra = frase.toUpperCase().charAt(0);
        System.out.println(frase.length());
        System.out.println(letra);
        //toUppercase() e toLowercase(), bem parecido com python
        System.out.println(frase.contains("Java"));
        System.out.println(frase.startsWith("Java"));

        String palavra = "Paralelepípedo";
        String particao = palavra.substring(0, 5);
        System.out.println(particao);

        String suja = "   texto";
        String limpar = suja.trim();
        System.out.println(limpar);

        String data = "2026-15-05";
        String[] formatado = data.split("-");
        System.out.println(formatado[0]);
        System.out.println(formatado[1]);

        //método equals() usado para verificar igualdade, e método equalIgnorecase() iguala ignorando maiusculas e minisculas

    }
}
