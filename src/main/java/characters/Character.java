package characters;

import java.util.LinkedList;

import specialAbilities.DevilFruit;
import specialAbilities.Haki;

public abstract class Character implements Comparable<Character> {
    protected String name;
    protected String sea;
    protected Integer age;

    protected String status;
    protected Double bounty;

    protected DevilFruit devilFruit;
    protected LinkedList<Haki> hakis;

    //basic constructors
    public Character() {
    }

    public Character(String name, String sea, Integer age, String status, DevilFruit devilFruit, LinkedList<Haki> hakis) {
        this.name = name;
        this.sea = sea;
        this.age = age;
        this.status = status;
        this.devilFruit = devilFruit;
        this.hakis = new LinkedList<>();
    }
    
    public Character(String name, String sea, Integer age, String status) {
        this.name = name;
        this.sea = sea;
        this.age = age;
        this.status = status;
    }

    protected abstract void calcBounty();
    public abstract void showBounty();
    protected abstract void addHaki (Haki haki);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSea() {
        return sea;
    }

    public void setSea(String sea) {
        this.sea = sea;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getBounty() {
        return bounty;
    }

    public void setBounty(Double bounty) {
        this.bounty = bounty;
    }

    public DevilFruit getDevilFruit() {
        return devilFruit;
    }

    public void setDevilFruit(DevilFruit devilFruit) {
        this.devilFruit = devilFruit;
    }

    public LinkedList<Haki> getHakis() {
        return hakis;
    }

    public void setHakis(LinkedList<Haki> hakis) {
        this.hakis = hakis;
    }

    @Override
    public int compareTo(Character c) {
        if(this.getAge() == c.getAge())
            return 0;
        else if (this.getAge() < c.getAge())
            return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", sea='" + sea + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                ", bounty=" + bounty +
                ", devilFruit=" + devilFruit +
                ", hakis=" + hakis +
                '}';
    }
}
