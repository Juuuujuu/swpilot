package process3.ex1;

public class BiodomeFamily01 {
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
        list.printlist();
    }
}
