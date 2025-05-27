package process3.ex5.classes;

public abstract class AncientArtifact {
    private String name; // 고대유물 이름

    public AncientArtifact(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public abstract void describe();
}
