import java.util.Scanner;

public class matriz_q1 {

    static int[][] lerMatriz(Scanner sc, int linhas, int colunas) {
        int[][] m = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    static int contarMaioresQue10(int[][] m) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > 10) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = lerMatriz(sc, 4, 4);
        System.out.println("Quantidade de valores maiores que 10: " + contarMaioresQue10(m));
        sc.close();
    }
}
