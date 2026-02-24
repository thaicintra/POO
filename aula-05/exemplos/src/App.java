public class App {
    public static void main(String[] args) throws Exception {

        // um vertor em Java é um objeto
        int[] vetor = new int[5]; // todas as posições começam com o valor 0

        vetor[0] = 10;
        vetor[4] = 90;

        int[] outra = { 3, 4, 5, 8 }; // new int[]{2, 4, 5, 7}

        int[][] matriz = new int[3][2]; // lin, col

        matriz[2][1] = 50;

        // vetor de 100 posições e iniciar ele com números impares, começando em 3.

        int[] vetor2 = new int[100];
        int numeroImpar = 3;

        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = numeroImpar += 2;
            System.out.print(vetor2[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        // outra solução
        // int [] vetor3 = new int[100];
        // vetor3 [0] = 3;

        // for (int i = 1; i < vetor3.length; i++) {
        // vetor3[i] = vetor [i-1] + 2;
        

        // 1 2 3
        // 4 5 6
        // 7 8 9

        int[][] matriz2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < 3; i++) { // linhas
            for (int j = 0; j < 3; j++) { // colunas
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }

    // outra opção
    // int contador = 1;
    // for (int i = 0; i < 3; i++) {
    // for (int j = 0; j < 3; j++) {
    // matriz[i][j] = contador++;
    
    // para imprimir a diagonal principal
    // int[][] matriz3 = {{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};

    // for(int i = 0;i<3;i++) { // linhas
    // for (int j = 0; j < 3; j++) { // colunas
    // if (i == j) {
    // System.out.println(matriz3[i][j] + " ");
    // } else {
    // System.out.println(" ");
    // }
    // }
    // System.out.println();
    // }

    int a = -10;
    int b = Math.abs(a); //modulo

}


