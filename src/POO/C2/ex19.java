package POO.C2;

public class ex19 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Luis", 18, 110277);
        Professor professor1 = new Professor("Saulo", 37, 3500.77);

        aluno1.apresentar();
        aluno1.mostrarMatrciula();

        professor1.apresentar();
        professor1.mostrarSalario();

    }
}
