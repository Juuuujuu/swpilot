package process3.ex4;

public class EnergyManager {
    public void useEnergy(EnergySource k, int use){
        k.setEnergyAmount(k.getEnergyAmount()-use);
        System.out.printf("%s를 %d 사용했습니다.\n",k.getSourceName(),use);
    }
    public void addAll(EnergySource s, EnergySource w, EnergySource g){
        System.out.printf("남은 에너지 : %d",s.getEnergyAmount()+w.getEnergyAmount()+g.getEnergyAmount());
    }
}
