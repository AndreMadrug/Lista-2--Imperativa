import java.util.Scanner;

public class vetor_q4 {

    static String[] lerNomes(Scanner sc, int n) {
        String[] nomes = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }
        return nomes;
    }

    static void imprimirInverso(String[] nomes) {
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = lerNomes(sc, 15);
        System.out.println("Nomes em ordem contraria:");
        imprimirInverso(nomes);
        sc.close();
    }
}
