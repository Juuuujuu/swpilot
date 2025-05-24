package process3.ex4;

public class BiodomeFamily04 {
    public static void main(String[] args) {
        EnergySource sun = new Sun("태양광 에너지");
        EnergySource wind = new wind("풍력 에너지");
        EnergySource ground = new ground("지열 에너지");

        sun.produceSource();
        wind.produceSource();
        ground.produceSource();
        System.out.println();
        EnergyManager em = new EnergyManager();
        em.useEnergy(sun,30);
        em.useEnergy(wind,30);
        em.useEnergy(ground,30);
        System.out.println();
        em.addAll(sun,wind,ground);

    }
}
