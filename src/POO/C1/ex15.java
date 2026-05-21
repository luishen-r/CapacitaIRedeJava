package POO.C1;

public class ex15 {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "4x4";
        meuCarro.cor = "Preto";
        meuCarro.ano = 2021;

        System.out.println("Meu carro é uma " + meuCarro.modelo + " de cor " + meuCarro.cor + " e ano " + meuCarro.ano);
        meuCarro.buzinar();
    }
}