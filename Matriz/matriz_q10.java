import java.util.Scanner;

public class matriz_q10 {

    static int[][] lerMatriz(Scanner sc, int linhas, int colunas) {
        int[][] m = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    static int[] somaColunas(int[][] m) {
        int colunas = m[0].length;
        int[] r = new int[colunas];
        for (int j = 0; j < colunas; j++) {
            int soma = 0;
            for (int i = 0; i < m.length; i++) {
                soma += m[i][j];
            }
            r[j] = soma;
        }
        return r;
    }

    public static void imprimirVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
        System.out.print(v[i] + (i < v.length - 1 ? " " : ""));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = lerMatriz(sc, 3, 3);
        int[] v = somaColunas(m);
        System.out.println("Vetor com a soma das colunas:");
        imprimirVetor(v);
        sc.close();
    }
}
