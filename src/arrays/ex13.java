package arrays;

public class ex13 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(matriz1[1][2]);

        for (int i=0; i < matriz1.length; i++) {
            for (int j=0; j < matriz1[i].length; j++) {
                System.out.print("[" + matriz1[i][j] + "]" + " ");
            }
            System.out.println();
        }
    }
}
