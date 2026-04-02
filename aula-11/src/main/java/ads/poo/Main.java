package ads.poo;

public class Main {
    static void main() {

        Carro c = new Carro("fusca", 80);
        Carro d = new Carro("gol");

        Pessoa p = new Pessoa("Juca","763.757.280-37", "juquinha96@hotmail.com");
//        p.setNome();
//        p.setCpf();
//        p.setEmail();

        IO.println(p);

    }
}
