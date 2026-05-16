package arrays;

public class ex11 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println(numeros[0]);

        int[] newArray = new int[numeros.length + 1];
        System.arraycopy(numeros, 0, newArray, 0, numeros.length);
        System.out.println(newArray[0]);

        newArray[newArray.length - 1] = 6;

        System.out.println("Saída: [");

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i <  newArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
