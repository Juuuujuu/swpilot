package process3.ex3;

import process3.ex3.Organism;

import java.util.ArrayList;
import java.util.List;

public class LifeNest {
    List<process3.ex3.Organism> organismlist = new ArrayList<process3.ex3.Organism>();
    public void addOrganism(process3.ex3.Organism list) {
        organismlist.add(list);
        System.out.printf("[LifeNest] %s 추가되었습니다.\n",list.getName());
    }
    public void removeOrganism(process3.ex3.Organism list) {
        organismlist.remove(list);
        System.out.printf("[LifeNest] %s 삭제되었습니다.\n",list.getName());
    }
    public void displayAll(){
        System.out.println("전체 동식물 출력");
        for(int i=0; i<organismlist.size(); i++){
            System.out.printf(i+1+".");
            organismlist.get(i).displayinfo();
        }
    }

}
