import java.util.Scanner;

public class vetor_q7 {

    static int[] lerVetor(Scanner sc, int n) {
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        return v;
    }

    static int[] intercalar(int[] a, int[] b) {
        int[] r = new int[a.length + b.length];
        int junta = 0;
        for (int i = 0; i < a.length; i++) {
            r[junta++] = a[i];
            r[junta++] = b[i];
        }
        return r;
    }

    static void imprimirVetor(int[] v) {
        for (int x : v) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o vetor 1 (20 numeros):");
        int[] v1 = lerVetor(sc, 20);
        System.out.println("Digite o vetor 2 (20 numeros):");
        int[] v2 = lerVetor(sc, 20);

        int[] v3 = intercalar(v1, v2);
        System.out.println("Vetor intercalado:");
        imprimirVetor(v3);

        sc.close();
    }
}
