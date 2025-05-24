package process3.ex2;

import java.util.ArrayList;
import java.util.List;

public class LifeNest {
    List<Organism> organilist = new ArrayList<Organism>();
    public void addlist(Organism list) {
        organilist.add(list);
        System.out.printf("[LifeNest] %s 추가되었습니다.\n",list.getName());
    }
    public void deletelist(Organism list) {
        organilist.remove(list);
        System.out.printf("[LifeNest] %s 삭제되었습니다.\n",list.getName());
    }
    public void printlist(){
        System.out.println("전체 동식물 출력");
        for(int i=0; i<organilist.size(); i++){
            System.out.printf(i+1+".");
            organilist.get(i).displayinfo();
        }
    }
    public void modifyy(Organism list) {
        for(int i=0; i<organilist.size(); i++){
            if(organilist.get(i).getName().equals(list.getName())){
                organilist.set(i, list);
            }
        }
        System.out.printf("[LifeNest] %s 서식지가 변경되었습니다.\n",list.getName());
    }
}
