package process3.ex6.classes;

import java.util.ArrayList;
import java.util.List;

public class animal {
    public String name;
    public animaltype type;
    public int age;
    public static List<animal> animalList = new ArrayList<>();
    public animal(String name,animaltype typ,int arg){
        this.name = name;
        this.type = typ;
        this.age = arg;
        animalList.add(this);
    }

    public static void printt(){
        System.out.print("[");
        for(animal a:animalList){
            System.out.printf("%s(%s, %d살), ",a.name,a.type,a.age);
        }
        System.out.print("\b\b]\n");
    }
}
