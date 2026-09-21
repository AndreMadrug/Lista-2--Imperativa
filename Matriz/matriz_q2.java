public class matriz_q2 {

    static int[][] criarMatrizIdentidade(int n) {
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = (i == j) ? 1 : 0;
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

    public static void main(String[] args) {
        int[][] m = criarMatrizIdentidade(5);
        imprimirMatriz(m);
    }
}