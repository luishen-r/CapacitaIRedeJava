package POO.C2;

//Herança em java
public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá meu nome é " + nome + " e tenho " + idade + " anos");
    }
}

class Aluno extends Pessoa {
    int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void mostrarMatrciula() {
        System.out.println("Matricula do aluno: " + matricula);
    }
}

class Professor extends Pessoa {
    double salario;

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public void mostrarSalario() {
        System.out.println("Salario do professor: R$" + salario);
    }
}
