package ads.poo;

import java.util.Scanner;

public class Main {

    static void main() {

        Scanner input = new Scanner(System.in);

        int dia;
        String mes, estacao;

        IO.print("Entre com o dia: ");
        dia = input.nextInt();

        IO.print("Entre com o mês: ");
        mes = input.next();

        if (mes.equals("dezembro") && dia >= 21 || mes.equals("janeiro") || mes.equals("março") && dia <= 20) {
            estacao = "verão";
        } else if (mes.equals("março") || mes.equals("abril") || mes.equals("maio") || mes.equals("junho") && dia <= 20) {
            estacao = "outono";
        } else if (mes.equals("junho") || mes.equals("julho") || mes.equals("agosto") || mes.equals("setembro") && dia <= 22) {
            estacao = "inverno";
        } else {
            estacao = "primavera";
        }

        IO.print("A estação do ano correspondente é: " + estacao);
    }
}