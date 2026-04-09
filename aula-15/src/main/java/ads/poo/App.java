package ads.poo;

import java.util.ArrayList;

public class App {

    private ArrayList<Conta> contas;

    public App(){
        this.contas = new ArrayList<>();
    }

    public void cadastrar(){
        var titular = IO.readln("Nome do titular: ");
        var numero = IO.readln("Número da conta: ");
        var saldo = Double.parseDouble(IO.readln("Saldo inicial: "));

        var novaConta = new Conta(titular, numero, saldo);

        this.contas.add(novaConta);
    }

    public void listar(){
        // For each
        // for ( tipo variavelLocal : colecaoQueSeráPercorida )
        //for (Conta c : contas) {
            //IO.println(c);
        //}

        contas.forEach(IO::println);
    }

    public void depositar(){
        var numero = IO.readln("Digite o número da conta: ");
        for (Conta c : contas) {
            if (c.getNumero().equals(numero)) {
                double valor = Double.parseDouble(IO.readln("Valor do Depósito: "));
                c.depositar(valor);
                IO.println(String.format("Depósito de %.2f realizado, na conta %s", valor, c));
                IO.println(String.format("Valor atual da conta %.2f", c.getSaldo()));
                return;
            }
        }
    }

    public void sacar(){
        var numero = IO.readln("Digite o número da conta: ");
        for (Conta c : contas) {
            if (c.getNumero().equals(numero)) {
                double valor = Double.parseDouble(IO.readln("Valor do Saque: "));
                c.sacar(valor);
                IO.println(String.format("Saque de %.2f realizado, na conta %s", valor, c));
                IO.println(String.format("Valor atual da conta %.2f", c.getSaldo()));
                return;
            }
        }
    }

    void menu(){
        int opcao;
        do {
            IO.println();
            opcao = Integer.parseInt(IO.readln("Entre com uma opção: \n" +
                    "1 - Cadastrar conta\n" +
                    "2 - Listar todas as contas\n" +
                    "3 - Depositar em uma conta\n" +
                    "4 - Sacar de uma conta\n" +
                    "5 - Sair\n"));
            IO.println();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    sacar();
                    break;
                case 5:
                    IO.println("Saindo...");
                    break;
                default:
                    IO.println("Opção inválida. Digite novamente");
            }
            } while (opcao != 5);
    }

    static void main(String[] args) {
        App app = new App();

        app.menu();

    }

}

