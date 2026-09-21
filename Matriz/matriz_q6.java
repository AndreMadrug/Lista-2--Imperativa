public class matriz_q6 {

    static int[][] gerarMatriz(int n) {
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    m[i][j] = 2 * i + 7 * j - 2;
                } else if (i == j) {
                    m[i][j] = 3 * i * i - 1;
                } else {
                    m[i][j] = 4 * i * i * i - 5 * j * j + 1;
                }
            }
        }
        return m;
    }

    static void imprimirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
             for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] m = gerarMatriz(10);
        imprimirMatriz(m);
    }
}
