import java.util.Scanner;

public class vetor_q6 {

    static double calcularMedia(int[] idades) {
        int soma = 0;
        for (int j = 0; j < idades.length; j++) {
            soma += idades[j];
        }
        return (double) soma / idades.length;
    }

    static void imprimirAcimaMedia(String[] nomes, int[] idades, double media) {
        for (int i = 0; i < nomes.length; i++) {
            if (idades[i] > media) {
                System.out.println(nomes[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;
        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine();
        }

        double media = calcularMedia(idades);
        System.out.println("Idade media do grupo: " + media);
        System.out.println("Pessoas com idade acima da media:");
        imprimirAcimaMedia(nomes, idades, media);

        sc.close();
    }
}
