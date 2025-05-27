package process3.ex5.classes;

import java.util.ArrayList;
import java.util.List;

public class Sorcerer {
    private String name;
    private List<AncientArtifact> artifacts;

    public Sorcerer(String name) {
        this.name = name;
        this.artifacts = new ArrayList<AncientArtifact>();
        System.out.printf("마법사 \'%s\'이 소환되었습니다.\n",name);
    }

    public void addArtifact(AncientArtifact artifact) {
        artifacts.add(artifact);
        System.out.printf("마법사 \'%s\'이 %s을 소유하게 되었습니다.\n", name,artifact.getName());
    }
    public void checkArtifacts(AncientArtifact artifact) {
        System.out.printf("마법사 \'%s\'이 %s의 능력을 확인합니다.\n",name,artifact.getName());
        System.out.println();
        artifact.describe();
    }
    public void useArtifact(AncientArtifact artifact, String A) {
        if(A.equals("Energy")){
            System.out.printf("마법사 \'%s\'이 %s의 에너지 생성 능력을 확인합니다.\n",name,artifact.getName());
            ((EnergyGenerator) artifact).generateEnergy(); //강제 타입 변환
        }
        else if(A.equals("Weather")){
            System.out.printf("마법사 \'%s\'이 %s의 날씨 조절 능력을 확인합니다.\n",name,artifact.getName());
            ((WeatherController) artifact).controlWeather();
        }
    }

}
