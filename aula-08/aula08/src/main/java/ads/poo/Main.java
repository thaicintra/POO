package ads.poo;

import ads.poo.Caneta;

import java.awt.font.LayoutPath;

public class Main {
    static void main(String[] args) {

//        Lampada a = new Lampada();
//        Lampada b = new Lampada();
//
//        a.ligarDesligar();
//
//        System.out.println(a.isLigada());
//        System.out.println(b.isLigada());

        Caneta bic = new Caneta();
        bic.abertaFechada();
        bic.setCor("azul");
        bic.setNivelTinta(0.01);

        System.out.println(bic.desenhar(1,1,1,2));






    }
}
