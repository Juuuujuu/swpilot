package process3.ex3;

import process3.ex3.Organism;

public class Plant extends Organism {
    public String seasons;
    public String berry;

    public Plant(String name, String type, String habitat,String seasons, String berry) {
        super(name, type, habitat);
        setSeasons(seasons);
        setBerry(berry);
    }
    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.printf("%s, %s\n",getSeasons(),getBerry());
    }
    public String getSeasons() {
        return this.seasons;
    }
    public String getBerry() {
        return this.berry;
    }
    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }
    public void setBerry(String berry) {
        this.berry = berry;
    }
}
