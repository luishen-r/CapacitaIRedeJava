package POO.C1;

public class ex16 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.setSaldo(1000);
        System.out.println("Saldo atual: " + contaBancaria.getSaldo());

        contaBancaria.sacar(200);
        System.out.println("Saldo atual: " + contaBancaria.getSaldo());

        contaBancaria.setSaldo(-1000);
    }
}
