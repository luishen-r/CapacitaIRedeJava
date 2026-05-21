package POO.C1;

public class ContaBancaria {
    private double saldo;

    //Getter - retorna o saldo atual
    public double getSaldo() {
        return saldo;
    }

    //Setter - permite controlar o saldo de maneira controlada
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("ERRO! Saldo inválido");
        }
    }

    public void depositar(double valor){
        if (valor > 0) {
            setSaldo(this.saldo + valor);
            System.out.println("Depositado com sucesso! Valor: R$" + valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            setSaldo(this.saldo - valor);
            System.out.println("Sacado com sucesso! Valor: R$" + valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido");
        }
    }
}
