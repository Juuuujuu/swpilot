package process3.ex4;

public abstract class EnergySource {
    private final String SourceName;
    public int energyAmount;
    public EnergySource(String SourceName) {
        this.SourceName = SourceName;

    }
    public String getSourceName() {
        return this.SourceName;
    }
    public int getEnergyAmount() {
        return this.energyAmount;
    }
    public void setEnergyAmount(int energyAmount){
        this.energyAmount = energyAmount;
    }
    public abstract void produceSource();

}
