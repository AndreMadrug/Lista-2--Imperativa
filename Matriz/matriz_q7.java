import java.util.Scanner;

public class matriz_q7 {

    static int[][] lerMatriz(Scanner sc, int n) {
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    static int somaAcima(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i < j) {
                    soma += m[i][j];
                }
            }
        }
        return soma;
    }

    static int somaAbaixo(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i > j) {
                    soma += m[i][j];
                }
            }
        }
        return soma;
    }

    static int somaDiagonalPrincipal(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            soma += m[i][i];
        }
        return soma;
    }

    static int somaDiagonalSecundaria(int[][] m) {
        int soma = 0;
        int n = m.length;
        for (int i = 0; i < n; i++) {
            soma += m[i][n - 1 - i];
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = lerMatriz(sc, 3);

        System.out.println("Soma acima da diagonal principal: " + somaAcima(m));
        System.out.println("Soma abaixo da diagonal principal: " + somaAbaixo(m));
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal(m));
        System.out.println("Soma da diagonal secundaria: " + somaDiagonalSecundaria(m));

        sc.close();
    }
}
