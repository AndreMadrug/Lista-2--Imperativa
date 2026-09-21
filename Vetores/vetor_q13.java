import java.util.Scanner;

public class vetor_q13 {

    static long combinacao(int n, int k) {
        long resultado = 1;
        for (int i = 0; i < k; i++) {
            resultado = resultado * (n - i) / (i + 1);
        }
        return resultado;
    }

    static void imprimirTrianguloPascal(int n) {
        for (int linha = 0; linha < n; linha++) {
            for (int col = 0; col <= linha; col++) {
                System.out.print(combinacao(linha, col) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite n: ");
        int n = sc.nextInt();
        imprimirTrianguloPascal(n);
        sc.close();
    }
}
