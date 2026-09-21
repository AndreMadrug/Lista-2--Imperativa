import java.util.Random;

public class matriz_q8 {

    static int[][] gerarMatriz(int n, int min, int max) {
        int[][] m = new int[n][n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = min + rnd.nextInt(max - min + 1);
            }
        }
        return m;
    }

    static int[][] copiarMatriz(int[][] m) {
        int n = m.length;
        int[][] copia = new int[n][n];
        for (int i = 0; i < n; i++) {
            copia[i] = m[i].clone();
        }
        return copia;
    }

    static void transformarTriangularInferior(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (j > i) {
                    m[i][j] = 0;
                }
            }
        }
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
        int[][] original = gerarMatriz(4, 1, 20);
        int[][] transformada = copiarMatriz(original);
        transformarTriangularInferior(transformada);

        System.out.println("Matriz original:");
        imprimirMatriz(original);

        System.out.println("Matriz transformada (triangular inferior):");
        imprimirMatriz(transformada);
    }
}
