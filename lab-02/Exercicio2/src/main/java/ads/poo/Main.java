package ads.poo;

import java.util.Random;

public class Main {
    static void main() {

        Random r = new Random();

        int numero = r.nextInt(1, 101);
        int contador = 0;
        int palpite;

        do {
            palpite = Integer.parseInt(IO.readln("Digite um número de 1 a 100: "));
            contador++;

            if (palpite == numero) {
                IO.println("Parabéns, você acertou!");
                IO.println("Número de tentativas: " + contador);
            } else if (palpite < numero) {
                IO.println("Chutou baixo demais, o número é maior");
            } else {
                IO.println("Tá alto, o número é menor");
            }
        } while (palpite != numero);

    }
}

