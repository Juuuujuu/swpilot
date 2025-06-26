package process3.ex6;

import process3.ex6.classes.additional;
import process3.ex6.classes.animal;
import process3.ex6.classes.animaltype;

public class BiodomeFamily06 {
    public static void main(String[] args) {
        new animal("제니", animaltype.monkey,4);
        new animal("고먀",animaltype.elephant,5);
        new animal("타이",animaltype.tiger,9);
        new animal("로아",animaltype.rhino,5);
        new animal("바비",animaltype.bambi,7);
        additional ad = new additional();
        ad.resort(animal.animalList);

        animal.printt();
    }
}
