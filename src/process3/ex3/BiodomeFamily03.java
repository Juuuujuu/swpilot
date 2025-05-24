package process3.ex3;

public class BiodomeFamily03 {
    public static void main(String[] args) {
        Animal p = new Animal("펭귄","동물","남극","육식","물고기");
        Animal c = new Animal("코알라","동물","호주","초식","유칼립투스");
        Plant s = new Plant("선인장","식물","사막","11월","열매 있음");
        Plant pp=new Plant("페퍼민트","식물","정원","7월","열매 없음");

        LifeNest n = new LifeNest();
        n.addOrganism(p);
        n.addOrganism(c);
        n.addOrganism(s);
        n.addOrganism(pp);

        n.displayAll();

        n.removeOrganism(c);
        n.removeOrganism(s);

        n.displayAll();

    }
}
