import java.util.Arrays;
import java.util.Random;

public class matriz_q9 {

    static boolean existeNaCartela(int[][] cartela, int valor) {
        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela[i].length; j++) {
                if (cartela[i][j] == valor) {
                    return true;
                }
            }
        }
        return false;
    }

    static int[][] gerarCartela() {
        int[][] cartela = new int[5][5];
        
        
        for (int i = 0; i < 5; i++) {
            Arrays.fill(cartela[i], -1);
        }

        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int valor;
                do {
                    valor = rnd.nextInt(100);
                } while (existeNaCartela(cartela, valor));

                cartela[i][j] = valor;
            }
        }
        return cartela;
    }

    static void imprimirCartela(int[][] cartela) {
        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela[i].length; j++) {
                System.out.printf("%3d ", cartela[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] cartela = gerarCartela();
        imprimirCartela(cartela);
    }
}