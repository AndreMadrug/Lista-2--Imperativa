import java.util.Scanner;

public class vetor_q8 {

    static int[] lerVetor(Scanner sc, int n) {
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        return v;
    }

    static int[] combinar(int[] a, int[] b) {
        int[] r = new int[a.length + b.length];
        for (int i = 0; i < r.length; i++) {
            if (i % 2 == 0) {
                r[i] = a[i / 2];
            } else {
                r[i] = b[i / 2];
            }
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
        System.out.println("Digite o primeiro vetor (10 posicoes):");
        int[] a = lerVetor(sc, 10);
        System.out.println("Digite o segundo vetor (10 posicoes):");
        int[] b = lerVetor(sc, 10);

        int[] r = combinar(a, b);
        System.out.println("Vetor resultante:");
        imprimirVetor(r);

        sc.close();
    }
}
