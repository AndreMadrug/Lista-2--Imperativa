import java.util.Scanner;

public class matriz_q14 {

    static String[] lerPresencas(Scanner sc, int dias) {
        String[] presencas = new String[dias];
        for (int i = 0; i < dias; i++) {
            presencas[i] = sc.next();
        }
        return presencas;
    }

    static int contarFaltas(String[] presencas) {
        int faltas = 0;
        for (String p : presencas) {
            if (p.equals("F")) {
                faltas++;
            }
        }
        return faltas;
    }

    static String diasDeFalta(String[] presencas) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < presencas.length; i++) {
            if (presencas[i].equals("F")) {
                sb.append(i + 1).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de alunos: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        String[][] presencasAlunos = new String[n][30];

        for (int i = 0; i < n; i++) {
            System.out.print("Nome do aluno: ");
            nomes[i] = sc.nextLine();
            presencasAlunos[i] = lerPresencas(sc, 30);
            sc.nextLine();
        }

        System.out.println("\nAlunos reprovados por falta:");
        for (int i = 0; i < n; i++) {
            int faltas = contarFaltas(presencasAlunos[i]);
            if (faltas > 10) {
                String dias = diasDeFalta(presencasAlunos[i]);
                System.out.println(nomes[i] + " - dias: " + dias);
            }
        }

        sc.close();
    }
}
