import java.util.Scanner;

public class matriz_q12 {

    static double[][] lerMatriz(Scanner sc, int n) {
        double[][] m = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextDouble();
            }
        }
        return m;
    }

    static double[][] somar(double[][] a, double[][] b) {
        int n = a.length;
        double[][] r = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r[i][j] = a[i][j] + b[i][j];
            }
        }
        return r;
    }

    static double[][] subtrairPrimeiraDaSegunda(double[][] a, double[][] b) {
        int n = a.length;
        double[][] r = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r[i][j] = b[i][j] - a[i][j];
            }
        }
        return r;
    }

    static void adicionarConstante(double[][] a, double[][] b, double c) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] += c;
                b[i][j] += c;
            }
        }
    }

    static void imprimirMatriz(double[][] m) {
        for (double[] linha : m) {
            for (double v : linha) {
                System.out.printf("%.2f ", v);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a matriz A (2x2):");
        double[][] a = lerMatriz(sc, 2);
        System.out.println("Digite a matriz B (2x2):");
        double[][] b = lerMatriz(sc, 2);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\nMenu:");
            System.out.println("1 - Somar as duas matrizes");
            System.out.println("2 - Subtrair a primeira matriz da segunda");
            System.out.println("3 - Adicionar uma constante as duas matrizes");
            System.out.println("4 - Imprimir as matrizes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado da soma:");
                    imprimirMatriz(somar(a, b));
                    break;
                case 2:
                    System.out.println("Resultado da subtracao (B - A):");
                    imprimirMatriz(subtrairPrimeiraDaSegunda(a, b));
                    break;
                case 3:
                    System.out.print("Digite a constante: ");
                    double c = sc.nextDouble();
                    adicionarConstante(a, b, c);
                    System.out.println("Constante adicionada as matrizes A e B.");
                    break;
                case 4:
                    System.out.println("Matriz A:");
                    imprimirMatriz(a);
                    System.out.println("Matriz B:");
                    imprimirMatriz(b);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }
        sc.close();
    }
}
