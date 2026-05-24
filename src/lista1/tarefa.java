package lista1;

import java.util.Scanner;

public class tarefa {
    public static void main(String[] args) {
        int numero = 15;
        if (numero >= 10 && numero <= 20) {
            System.out.println("Está entre 10 e 20");
        }

        // --- 1. TIPOS INTEIROS ---

        // byte: Armazena números bem pequenos. Ocupa 1 byte (8 bits).
        // Intervalo: -128 até 127
        byte idade = 26;

        // short: Para números pequenos. Ocupa 2 bytes (16 bits).
        // Intervalo: -32.768 até 32.767
        short ano = 2026;

        // int: O mais comum para números inteiros. Ocupa 4 bytes (32 bits).
        // Intervalo: cerca de -2 bilhões até 2 bilhões
        int populacaoFicticia = 1500000;

        // long: Para números gigantescos. Ocupa 8 bytes (64 bits).
        // Nota: É obrigatório colocar a letra 'L' (ou 'l') no final do valor.
        long estrelasNoUniverso = 7000000000000000000L;


        // --- 2. TIPOS DECIMAIS (PONTO FLUTUANTE) ---

        // float: Precisão simples. Ocupa 4 bytes (32 bits).
        // Nota: É obrigatório colocar a letra 'F' (ou 'f') no final do valor.
        float precoAlface = 4.99f;

        // double: Precisão dupla (o padrão para decimais). Ocupa 8 bytes (64 bits).
        // É o mais usado para cálculos científicos ou comuns devido à precisão.
        double valorPi = 3.141592653589793;


        // --- 3. TIPO CARACTERE ---

        // char: Armazena apenas uma letra, número ou símbolo. Ocupa 2 bytes.
        // Nota: Deve ser escrito obrigatoriamente entre ASPAS SIMPLES ('').
        char inicialDoNome = 'G';


        // --- 4. TIPO BOOLEANO ---

        // boolean: Armazena apenas dois estados. Ocupa apenas 1 bit de informação.
        // Valores possíveis: true (verdadeiro) ou false (falso)
        boolean javaETranquilo = true;


        // --- EXIBINDO OS VALORES NA TELA ---

        System.out.println("=== TIPOS PRIMITIVOS EM JAVA ===\n");

        System.out.println("Inteiros:");
        System.out.println("-> byte: " + idade);
        System.out.println("-> short: " + ano);
        System.out.println("-> int: " + populacaoFicticia);
        System.out.println("-> long: " + estrelasNoUniverso);

        System.out.println("\nDecimais:");
        System.out.println("-> float: " + precoAlface);
        System.out.println("-> double: " + valorPi);

        System.out.println("\nCaractere:");
        System.out.println("-> char: '" + inicialDoNome + "'");

        System.out.println("\nBooleano:");
        System.out.println("-> boolean: " + javaETranquilo);

        Scanner sc = new Scanner(System.in);
        int n1, n2, resultado, opc;

        do {
            System.out.println("\n1 - Somar dois números\n" +
                    "2 - Subtrair dois números\n" +
                    "3 - Sair");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Informe o primeiro número");
                    n1 = sc.nextInt();
                    System.out.println("Informe o segundo número");
                    n2 = sc.nextInt();
                    resultado = n1 + n2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    System.out.println("Informe o primeiro número");
                    n1 = sc.nextInt();
                    System.out.println("Informe o segundo número");
                    n2 = sc.nextInt();
                    resultado = n1 - n2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opc != 3);


        int num;
        System.out.println("Informe um núemero para fazer a tabuada: ");
        num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }


        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        String texto = leitor.nextLine();

        String modificado = texto.replace("e", "*");

        System.out.println("Texto modificado: " + modificado);



        String[] pessoas = {"Maria", "João", "Carlos", "Beatriz"};
        System.out.println("Digite o seu nome: ");
        String nome = leitor.nextLine();
        boolean busca = false;

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].equalsIgnoreCase(nome)) {
                busca = true;
                break;
            }
        }
        if (busca) {
            System.out.println("Está na lista!");
        } else {
            System.out.println("Não está na lista");
        }


        int fat = 1;
        int num2;

        System.out.println("Informe um número para saber o seu fatorial: ");
        num2 = sc.nextInt();
        for (int i = 1; i <= num2; i++) {
            fat *= i;
        }

        System.out.println("O fatorial de " + num2 + " é igual a " + fat);


        System.out.println("Informe o seu nome: ");
        String nomeCompleto = leitor.nextLine().trim();

        String[] pedacos = nomeCompleto.split(" ");

        String primeiro = pedacos[0];
        String segundo = pedacos[1];

        System.out.println("Primeiro nome: " +  primeiro);
        System.out.println("Segundo nome: " +  segundo);



        System.out.print("Digite uma frase: ");
        String frase = leitor.nextLine().trim();

        if (frase.isEmpty()) {
            System.out.println("A frase possui 0 palavras.");
        } else {
            String[] palavras = frase.split("\\s+");

            int quantidadePalavras = palavras.length;

            System.out.println("A frase possui " + quantidadePalavras + " palavra(s).");
        }
        leitor.close();
        sc.close();
    }
}
