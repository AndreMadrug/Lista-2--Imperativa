public class vetor_q1 {

    static int[] preencherVetor() {
        return new int[]{1, 0, 5, -2, -5, 7};
    }

    static int somarPosicoes(int[] a, int p1, int p2, int p3) {
        return a[p1] + a[p2] + a[p3];
    }

    static void modificarPosicao(int[] a, int pos, int valor) {
        a[pos] = valor;
    }

    static void imprimirVetor(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int v = a[i];
            System.out.println(v);
        }   
    }

    public static void main(String[] args) {
        int[] A = preencherVetor();

        int soma = somarPosicoes(A, 0, 1, 5);
        System.out.println("Soma A[0] + A[1] + A[5] = " + soma);

        modificarPosicao(A, 4, 100);

        System.out.println("Vetor final:");
        imprimirVetor(A);
    }
}
