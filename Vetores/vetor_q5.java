import java.util.Scanner;

public class vetor_q5 {

    static int[] lerVetor(Scanner sc, int n) {
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
        return v;
    }

    static void imprimirImpares(int[] v) {
        for (int i = 0; i < v.length; i++) {
            int x = v[i];
            if (x % 2 != 0) { 
                System.out.println(x);
            }
        }
    }

    static void imprimirPosicoesPares(int[] v) {
        for (int i = 0; i < v.length; i += 2) {
            System.out.println(v[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = lerVetor(sc, 20);

        System.out.println("Elementos com conteudo impar:");
        imprimirImpares(v);

        System.out.println("Elementos das posicoes pares:");
        imprimirPosicoesPares(v);

        sc.close();
    }
}
