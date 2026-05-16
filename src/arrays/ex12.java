package arrays;
import java.util.ArrayList;

public class ex12 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        System.out.println("1º número: " + lista.getFirst());

        lista.set(1, 5);
        lista.removeFirst();

        for (int i : lista) {
            System.out.println(i);
        }
    }
}
