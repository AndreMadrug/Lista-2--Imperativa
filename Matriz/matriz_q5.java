import java.util.Scanner;

public class matriz_q5 {

    static int[][] lerMatriz(Scanner sc, int n) {
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    static int[] buscarValor(int[][] m, int x) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == x) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = lerMatriz(sc, 5);
        System.out.print("Digite o valor X a buscar: ");
        int x = sc.nextInt();

        int[] pos = buscarValor(m, x);
        if (pos == null) {
            System.out.println("nao encontrado");
        } else {
            System.out.println("Encontrado na linha " + pos[0] + " e coluna " + pos[1]);
        }
        sc.close();
    }
}
