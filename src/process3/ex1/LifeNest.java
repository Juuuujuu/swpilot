//package process3.ex1;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class LifeNest {
//    List<Organism> organismList = new ArrayList<Organism>();
//    public void addlist(Organism organism) {
//        organismList.add(organism);
//        System.out.printf("[LifeNest] %s 추가되었습니다.\n",organism.name);
//    }
//    public void deletelist(Organism organism) {
//        organismList.remove(organism);
//        System.out.printf("[LifeNest] %s 삭제되었습니다.\n",organism.name);
//    }
//    public void printlist(){
//        System.out.println("전체 동식물 목록 출력:");
//        for(int i=0;i<organismList.size();i++){
//            System.out.print((i+1)+". ");
//            organismList.get(i).displayinfo();
//        }
//    }
//
//}
