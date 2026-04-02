package ads.poo;

public class Main {
    static void main() {

        Ponto a = new Ponto(3, 5);
        Ponto b = new Ponto(6,8);
        Ponto c = new Ponto(7,8);

        System.out.println(a.distanciaPonto(b));
        System.out.println(a.distanciaPonto(c));

        Horario d = new Horario(22, 10, 58);
        Horario e = new Horario(23, 50, 0);
        Horario f =  new Horario(1,52,18);
        System.out.println(e.diferencaHorarios(d));
        System.out.println(d.toString());

        Retangulo r = new Retangulo(5,8, "ASCII");
        System.out.println(r.toString());
    }
}
