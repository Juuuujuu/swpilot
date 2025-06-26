package process3.ex6.classes;
import java.util.Collections;
import java.util.List;

public class additional {
    public void resort(List<animal> animalList){
        //tiger가 사슴보다 앞에 있어야 한다.
        for(int i=0;i<animalList.size();i++)
            if(animalList.get(i).type==animaltype.bambi){
                for(int j=i+1;j<animalList.size();j++){
                    if(animalList.get(j).type==animaltype.tiger){
                        animalList.add(i,animalList.get(j));
                        animalList.remove(j+1);
                        break;
                    }
                }
                break;
            }
        //5살 이하 코끼리는 호랑이 뒤에 있어야한다.
        for(int i=0;i<animalList.size();i++)
            if(animalList.get(i).type==animaltype.elephant&&animalList.get(i).age<=5){
                for(int j=i+1;j<animalList.size();j++){
                    if(animalList.get(j).type==animaltype.tiger){
                        animalList.add(i,animalList.get(j));
                        animalList.remove(j+1);
                        break;
                    }
                }
                break;
            }

    }

}
