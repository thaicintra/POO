package ads.poo;

public class Main {
    static void main(String[] args) {

        String figura = args[0].toLowerCase();

        switch (figura) {
            case "triangulo":
                int alturaTriangulo = Integer.parseInt(args[1]);
                for (int i = 1; i <= alturaTriangulo; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case "losango":
                int alturaLosango = Integer.parseInt(args[1]);
                for (int i = 1; i <= alturaLosango; i += 2) {
                    for (int j = 0; j < (alturaLosango - i) / 2; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = alturaLosango - 2; i >= 1; i -= 2) {
                    for (int j = 0; j < (alturaLosango - i) / 2; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case "retangulo":
                int alturaRetangulo = Integer.parseInt(args[1]);
                int larguraRetangulo = Integer.parseInt(args[2]);
                for (int i = 0; i < alturaRetangulo; i++) {
                    for (int j = 0; j < larguraRetangulo; j++) {
                        if (i == 0 || i == alturaRetangulo - 1 || j == 0 || j == larguraRetangulo - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Figura inválida. Utilize triangulo, losango ou retangulo");
            }
        }
    }


