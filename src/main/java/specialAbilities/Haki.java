package specialAbilities;

public class Haki {
    private String type;
    private boolean advanced;

    public Haki() {
    }

    public Haki(String type, boolean advanced) {
        this.type = type;
        this.advanced = advanced;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAdvanced() {
        return advanced;
    }

    public void setAdvanced(boolean advanced) {
        this.advanced = advanced;
    }

    @Override
    public String toString() {
        return "Haki{" +
                "type='" + type + '\'' +
                ", advanced=" + advanced +
                '}';
    }
}
