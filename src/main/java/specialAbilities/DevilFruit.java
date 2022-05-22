package specialAbilities;

public class DevilFruit {
    private String name;
    private String type;
    private boolean mythical;


    public DevilFruit() {
    }

    public DevilFruit(String name, String type, boolean mythical) {
        this.name = name;
        this.type = type;
        this.mythical = mythical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isMythical() {
        return mythical;
    }

    public void setMythical(boolean mythical) {
        this.mythical = mythical;
    }

    @Override
    public String toString() {
        return "DevilFruit{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", mythical=" + mythical +
                '}';
    }
}





