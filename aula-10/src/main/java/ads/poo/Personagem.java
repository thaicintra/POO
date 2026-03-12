package ads.poo;

public class Personagem {

//    Modele um personagem de um jogo de aventura
//    Quais são os atributos e métodos essenciais para
//    esse personagem?
//    Implemente uma classe Java para representar
//    esse personagem
//    Crie uma outra classe com o método main e
//    instancie um objeto da classe Personagem

    private String name;
    private String classe;
    private int healthPoints;
    private int attack;
    private int defense;
    private String spell;
    private int spellStrenght;
    private String status;
    private String action;


    public void setName(String a) {
        name = a;
    }

    public void setClasse(String b) {
        classe = b;
    }

    public void setHealthPoints(int c) {
        healthPoints = c;
    }

    public void setAttack(int d) {
        attack = d;
    }

    public void setDefense(int e) {
        defense = e;
    }

    public void setSpell(String f) {
        spell = f;
    }

    public void setSpellStrenght(int g) {
        spellStrenght = g;
    }

    public String getStatus() {
        return "Nome: " + name + "\n Classe: " + classe + "\n Pontos de Ataque: " + attack + "\n Pontos de Defesa: " + defense;

    }

    public String getAction() {
        return "O " + name + " atacou com a magia " + spell + " com " + spellStrenght + " de força de ataque";
    }





}
