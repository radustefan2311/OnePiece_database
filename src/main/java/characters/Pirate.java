package characters;


import special_abilities.DevilFruit;
import special_abilities.Haki;

import java.util.LinkedList;

public class Pirate extends Character {
    protected Integer threatLevel; //ranges from 0 to 10
    protected Integer crewSize;
    protected String notority; //(low, medium, high)

    public  Pirate() {
    }


    public Pirate(String name, String sea, Integer age, String status, DevilFruit devilFruit, LinkedList<Haki> hakis, Integer threatLevel, Integer crewSize, String notority) {
        super(name, sea, age, status, devilFruit, hakis);
        this.threatLevel = threatLevel;
        this.crewSize = crewSize;
        this.notority = notority;

        calcBounty();
    }

    @Override
    protected void calcBounty() {
        if (notority == "high")
            this.bounty = (double) (crewSize * threatLevel * 100);
        else if (notority == "low" || notority == "medium")
            this.bounty = (double) (crewSize * threatLevel);
    }

    @Override
    public void showBounty() {
        System.out.println("Bounty calculator:\n" +
                "Crew Size: " + crewSize+ "\n" +
                "Threat Level: " + threatLevel + "\n" +
                "Bounty = " + crewSize + " * " + threatLevel + " = " + bounty);
    }

    @Override
    protected void addHaki(Haki haki) {
        hakis.add(haki);
    }


    public Integer getThreatLevel() {
        return threatLevel;
    }

    public void setThreatLevel(Integer threatLevel) {
        this.threatLevel = threatLevel;
    }

    public Integer getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(Integer crewSize) {
        this.crewSize = crewSize;
    }

    public String getNotority() {
        return notority;
    }

    public void setNotority(String notority) {
        this.notority = notority;
    }

    @Override
    public String toString() {
        return "Pirate{" +
                "name='" + name + '\'' +
                ", sea='" + sea + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                ", bounty=" + bounty +
                ", devilFruit=" + devilFruit +
                ", hakis=" + hakis +
                ", threatLevel=" + threatLevel +
                ", crewSize=" + crewSize +
                ", notority='" + notority + '\'' +
                '}';
    }
}
