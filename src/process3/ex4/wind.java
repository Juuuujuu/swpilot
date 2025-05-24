package process3.ex4;

import java.util.Scanner;

public class wind extends EnergySource{

    public wind(String SourceName) {
        super(SourceName);
    }

    @Override
    public void produceSource() {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        setEnergyAmount(speed-5);
        System.out.printf("%s를 %d 생산했습니다.\n",getSourceName(),getEnergyAmount());
    }
}
