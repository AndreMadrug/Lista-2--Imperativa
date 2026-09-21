import java.util.Scanner;

public class vetor_q12 {

    static boolean existeNoVetor(int[] v, int tamanhoAtual, int valor) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (v[i] == valor) {
                return true;
            }
        }
        return false;
    }

    static int[] lerVetorSemRepeticao(Scanner sc, int n) {
        int[] v = new int[n];
        int i = 0;
        while (i < n) {
            System.out.print("Digite um numero: ");
            int valor = sc.nextInt();
            if (existeNoVetor(v, i, valor)) {
                System.out.println("Numero ja digitado! Digite outro numero.");
            } else {
                v[i] = valor;
                i++;
            }
        }
        return v;
    }

    static void imprimirVetor(int[] v) {
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = lerVetorSemRepeticao(sc, 10);
        System.out.println("Vetor final:");
        imprimirVetor(v);
        sc.close();
    }
}
