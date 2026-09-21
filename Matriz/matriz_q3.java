public class matriz_q3 {

    static int[][] preencherProduto(int linhas, int colunas) {
        int[][] m = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                m[i][j] = i * j;
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
        int[][] m = preencherProduto(4, 4);
        imprimirMatriz(m);
    }
}
