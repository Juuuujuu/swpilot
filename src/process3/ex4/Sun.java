package process3.ex4;

import java.util.Scanner;

public class Sun extends EnergySource{

    public Sun(String SourceName) {
        super(SourceName);
    }

    @Override
    public void produceSource() {
        Scanner sc = new Scanner(System.in);
        int time= sc.nextInt();
        setEnergyAmount(time-10);
        System.out.printf("%s를 %d 생산했습니다.\n",getSourceName(),getEnergyAmount());
    }
}
