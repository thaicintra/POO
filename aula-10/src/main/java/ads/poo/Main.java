package ads.poo;

public class Main {
    static void main() {

        Contador contador = new Contador();

        contador.setValorAtual(10);
        contador.incrementar();

        System.out.println("Contador: " + contador.getValorAtual());

        Personagem personagem = new Personagem();

        personagem.setName("Zé da Cimitarra");
        personagem.setClasse("Paladino");
        personagem.setHealthPoints(120);
        personagem.setDefense(80);
        personagem.setAttack(55);
        personagem.setSpell("Lança de Raio");
        personagem.setSpellStrenght(150);

        System.out.println(personagem.getStatus());
        System.out.println(personagem.getAction());

        }
    }

