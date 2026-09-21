import java.util.Scanner;

public class matriz_q13 {

    static int[][] inicializarTeatro(int fileiras, int poltronas) {
        int[][] m = new int[fileiras][poltronas];
        for (int i = 0; i < fileiras; i++) {
            for (int j = 0; j < poltronas; j++) {
                m[i][j] = -1;
            }
        }
        return m;
    }

    static void venderIngresso(int[][] teatro, int fila, int poltrona) {
        int i = fila - 1;
        int j = poltrona - 1;
        if (teatro[i][j] == -1) {
            teatro[i][j] = 1;
        } else {
            System.out.println("Poltrona ja foi vendida");
        }
    }

    static void imprimirTeatro(int[][] teatro) {
        for (int[] linha : teatro) {
            for (int v : linha) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] teatro = inicializarTeatro(10, 10);

        System.out.print("Numero de tentativas de compra: ");
        int n = sc.nextInt();

        for (int k = 0; k < n; k++) {
            System.out.print("Fila: ");
            int fila = sc.nextInt();
            System.out.print("Poltrona: ");
            int poltrona = sc.nextInt();
            venderIngresso(teatro, fila, poltrona);
        }

        imprimirTeatro(teatro);
        sc.close();
    }
}
