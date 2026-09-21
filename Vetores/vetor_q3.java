import java.util.Scanner;

public class vetor_q3 {

    static int[] lerVetor(Scanner sc, int n) {
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
        return v;
    }

    static void imprimirPares(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                System.out.println(v[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = lerVetor(sc, 10);
        System.out.println("Elementos com conteudo par:");
        imprimirPares(v);
        sc.close();
    }
}
