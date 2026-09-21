import java.util.Scanner;

public class matriz_q11 {

    static int[][] lerDadosAlunos(Scanner sc, int n) {
        int[][] m = new int[n][4];
        for (int i = 0; i < n; i++) {
            System.out.print("Matricula: ");
            m[i][0] = sc.nextInt();
            System.out.print("Media das provas: ");
            m[i][1] = sc.nextInt();
            System.out.print("Media dos trabalhos: ");
            m[i][2] = sc.nextInt();
            m[i][3] = m[i][1] + m[i][2];
        }
        return m;
    }

    static int matriculaMaiorNota(int[][] m) {
        int maiorNota = m[0][3];
        int matricula = m[0][0];
        for (int[] aluno : m) {
            if (aluno[3] > maiorNota) {
                maiorNota = aluno[3];
                matricula = aluno[0];
            }
        }
        return matricula;
    }

    static double mediaNotasFinais(int[][] m) {
        int soma = 0;
        for (int[] aluno : m) {
            soma += aluno[3];
        }
        return (double) soma / m.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = lerDadosAlunos(sc, 5);

        System.out.println("Matricula do aluno com maior nota final: " + matriculaMaiorNota(m));
        System.out.println("Media aritmetica das notas finais: " + mediaNotasFinais(m));

        sc.close();
    }
}
