public class ex04 {
    public static void main(String[] args) {
        boolean temCarteira = true;
        boolean refezTesteToxicologico = false;

        boolean podeDirigir = temCarteira && refezTesteToxicologico;

        System.out.println("Está hábil a dirigir? " + podeDirigir);

        boolean acessoRestrito = temCarteira || refezTesteToxicologico;
        System.out.println("Tem algum acesso? " + acessoRestrito);

        System.out.println("Não refez o teste? " + !refezTesteToxicologico);
    }
}
