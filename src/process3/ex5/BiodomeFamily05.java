package process3.ex5;

public class BiodomeFamily05 {
    public static void main(String[] args) {
        Sorcerer sorcerer = new Sorcerer("아리엘");
        SolarStone solarStone = new SolarStone();
        WindAmulet windAmulet = new WindAmulet();
        WaterMirror waterMirror = new WaterMirror();
        System.out.println();
        sorcerer.addArtifact(solarStone);
        sorcerer.addArtifact(windAmulet);
        sorcerer.addArtifact(waterMirror);
        System.out.println();
        sorcerer.checkArtifacts(solarStone);
        System.out.println();
        sorcerer.useArtifact(waterMirror,"Energy");

    }
}
