package process3.ex3;

import process3.ex3.Organism;

public class Animal extends Organism {
    public String digestion;
    public String food;
    public Animal(String name, String type, String habitat,String digestion,String food) {
        super(name, type, habitat);
        setDigestion(digestion);
        setFood(food);
    }
    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.printf("%s, %s\n", getDigestion(), getFood());
    }
    public String getDigestion() {
        return this.digestion;
    }
    public void setDigestion(String digestion) {
        this.digestion = digestion;
    }
    public String getFood() {
        return this.food;
    }
    public void setFood(String food) {
        this.food = food;
    }
}
