package process3.ex4;

import java.util.Scanner;

public class ground extends EnergySource{
    public ground(String SourceName) {
        super(SourceName);
    }

    @Override
    public void produceSource() {
        Scanner sc = new Scanner(System.in);
        int heat = sc.nextInt();
        setEnergyAmount(heat*5+20);
        System.out.printf("%s를 %d 생산했습니다.\n",getSourceName(),getEnergyAmount());
    }
}
