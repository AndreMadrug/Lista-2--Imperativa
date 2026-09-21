import java.util.Scanner;

public class vetor_q11 {

    
    static double media(int[] v) {
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return (double) soma / v.length;
    }

    static double desvioPadrao(int[] v, double m) {
        double soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += Math.pow(v[i] - m, 2);
        }
        return Math.sqrt(soma / (v.length - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }

        double m = media(v);
        double dp = desvioPadrao(v, m);

        System.out.println("Media: " + m);
        System.out.println("Desvio padrao: " + dp);

        sc.close();
    }
}