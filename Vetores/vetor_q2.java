import java.util.Scanner;

public class vetor_q2 {

    static int[] lerVetor(Scanner sc, int n) {
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
        return v;
    }

    static void imprimirVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            int x = v[i];
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = lerVetor(sc, 6);
        System.out.println("Valores lidos:");
        imprimirVetor(v);
        sc.close();
    }
}
