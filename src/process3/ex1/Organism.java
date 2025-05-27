package process3.ex1;

public class Organism {
    public String name;
    public String type;
    public String habitat;
    public Organism(String name, String type, String habitat) {
        this.name = name;
        this.type = type;
        this.habitat = habitat;
    }
    public void displayinfo(){
        System.out.printf("%s, %s, %s\n",this.name, this.type, this.habitat);
    }

}
