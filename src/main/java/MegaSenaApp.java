import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class MegaSenaApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos jogos devo gerar? ");

        int numeroDeJogos = scanner.nextInt();
        System.out.println("Gerando " + numeroDeJogos + " jogos para a Mega-Sena:\n");

        for (int i = 1; i <= numeroDeJogos; i++) {
            Set<Integer> jogo = gerarJogo();
            System.out.println("Jogo " + i + ": " + jogo);
        }

        scanner.close();
    }

    public static Set<Integer> gerarJogo() {
        Set<Integer> numeros = new HashSet<>();
        Random random = new Random();

        while (numeros.size() < 6) {
            int numero = random.nextInt(60) + 1;
            numeros.add(numero);
        }

        return numeros;
    }

}
