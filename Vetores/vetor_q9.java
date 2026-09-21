public class vetor_q9 {

    static boolean valido(int n) {
        if (n % 7 == 0) {
            return false;
        }
        if (n % 10 == 7) {
            return false;
        }
        return true;
    }

    static int[] preencherVetor() {
        int[] v = new int[100];
        int count = 0;
        int n = 1;
        while (count < 100) {
            if (valido(n)) {
                v[count] = n;
                count++;
            }
            n++;
        }
        return v;
    }

    static void imprimirVetor(int[] v) {
        for (int x : v) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int[] v = preencherVetor();
        imprimirVetor(v);
    }
}
