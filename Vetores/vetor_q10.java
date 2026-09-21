import java.util.Scanner;

public class vetor_q10 {

    static int[] lerVetor(Scanner sc, int n) {
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        return v;
    }

    static int[] soma(int[] x, int[] y) {
        int[] r = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            r[i] = x[i] + y[i];
        }
        return r;
    }

    static int[] produto(int[] x, int[] y) {
        int[] r = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            r[i] = x[i] * y[i];
        }
        return r;
    }

    static boolean pertence(int[] v, int valor) {
        for (int x : v) {
            if (x == valor) {
                return true;
            }
        }
        return false;
    }

    static int[] diferenca(int[] x, int[] y) {
        int count = 0;
        for (int v : x) {
            if (!pertence(y, v)) {
                count++;
            }
        }
        int[] r = new int[count];
        int idx = 0;
        for (int v : x) {
            if (!pertence(y, v)) {
                r[idx++] = v;
            }
        }
        return r;
    }

    static int[] intersecao(int[] x, int[] y) {
        int count = 0;
        for (int v : x) {
            if (pertence(y, v)) {
                count++;
            }
        }
        int[] r = new int[count];
        int idx = 0;
        for (int v : x) {
            if (pertence(y, v)) {
                r[idx++] = v;
            }
        }
        return r;
    }

    static int[] uniao(int[] x, int[] y) {
        int count = x.length;
        for (int v : y) {
            if (!pertence(x, v)) {
                count++;
            }
        }
        int[] r = new int[count];
        int idx = 0;
        for (int v : x) {
            r[idx++] = v;
        }
        for (int v : y) {
            if (!pertence(x, v)) {
                r[idx++] = v;
            }
        }
        return r;
    }

    static void imprimirVetor(int[] v) {
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o vetor x (5 elementos):");
        int[] x = lerVetor(sc, 5);
        System.out.println("Digite o vetor y (5 elementos):");
        int[] y = lerVetor(sc, 5);

        System.out.println("Soma:");
        imprimirVetor(soma(x, y));

        System.out.println("Produto:");
        imprimirVetor(produto(x, y));

        System.out.println("Diferenca (x - y):");
        imprimirVetor(diferenca(x, y));

        System.out.println("Intersecao:");
        imprimirVetor(intersecao(x, y));

        System.out.println("Uniao:");
        imprimirVetor(uniao(x, y));

        sc.close();
    }
}
