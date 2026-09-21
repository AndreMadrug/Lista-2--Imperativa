import java.util.Scanner;

public class matriz_q4 {

    static int[][] lerMatriz(Scanner sc, int n) {
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    static void imprimirMatriz(int[][] m) {
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[i].length; j++) {
            System.out.print(m[i][j] + " ");
        }
        System.out.println();
    }
}

    static int[] localizarMaior(int[][] m) {
        int maxVal = m[0][0];
        int li = 0, cj = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > maxVal) {
                    maxVal = m[i][j];
                    li = i;
                    cj = j;
                }
            }
        }
        return new int[]{li, cj};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = lerMatriz(sc, 4);
        imprimirMatriz(m);
        int[] pos = localizarMaior(m);
        System.out.println("Maior valor esta na linha " + pos[0] + " e coluna " + pos[1]);
        sc.close();
    }
}
