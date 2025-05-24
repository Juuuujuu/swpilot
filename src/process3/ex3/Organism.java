package process3.ex3;

public class Organism {
    private String name;
    private String type;
    private String habitat;
    public Organism(String name, String type, String habitat) {
        setName(name);
        setType(type);
        setHabitat(habitat);
    }
    public void displayinfo(){
        System.out.printf("%s, %s, %s",name,type,habitat);
    }
    public String getName() {
        return this.name;
    }
    public String getType() {
        return this.type;
    }
    public String getHabitat() {
        return this.habitat;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
