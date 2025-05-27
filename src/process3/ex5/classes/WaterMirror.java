package process3.ex5.classes;

public class WaterMirror extends AncientArtifact implements WeatherController, EnergyGenerator{

    public WaterMirror() {
        super("물의 거울");
        System.out.println("물의 거울 유물이 생성되었습니다.");
    }

    @Override
    public void describe() {
        System.out.println("\"물의 거울! 수증기를 모아 에너지를 생성하고, 날씨를 조절합니다.\"");
    }

    @Override
    public void generateEnergy() {
        System.out.println("\"물의 거울을 이용해 수증기로 에너지를 생성했습니다!\"");
    }

    @Override
    public void controlWeather() {
        System.out.println("\"물의 거울을 이용해 습도의 영향을 받으며 비와 눈을 내립니다!\"");

    }
}
