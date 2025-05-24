package process3.ex2;

import process3.ex2.LifeNest;
import process3.ex2.Organism;

public class BiodomeFamily02 {
    public static void main(String[] args) {
        Organism p = new Organism("펭귄","동물","남극");
        Organism c = new Organism("코알라","동물","호주");
        Organism s = new Organism("선인장","식물","사막");
        Organism pp=new Organism("페퍼민트", "식물","정원");

        LifeNest list = new LifeNest();
        list.addlist(p);
        list.addlist(c);
        list.addlist(s);
        list.addlist(pp);

        list.printlist();
        list.deletelist(c);
        list.deletelist(s);
        Organism mp = new Organism("펭귄","동물","해변");
        list.modifyy(mp);
        list.printlist();

    }
}
