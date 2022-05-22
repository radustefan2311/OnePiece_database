package characters;

import java.util.LinkedList;

import specialAbilities.DevilFruit;
import specialAbilities.Haki;

public class Navy extends Character {
    private String rank;
    private String marineBase;
    private Integer yearsOfService;

    public Navy() {
    }

    public Navy(String name, String sea, Integer age, String status, DevilFruit devilFruit, LinkedList<Haki> hakis, String rank, String marineBase, Integer yearsOfService) {
        super(name, sea, age, status, devilFruit, hakis);
        this.rank = rank;
        this.marineBase = marineBase;
        this.yearsOfService = yearsOfService;

        calcBounty();
    }

    @Override
    protected void addHaki(Haki haki) {
        hakis.add(haki);
    }

    @Override
    protected void calcBounty() {
        this.bounty = (double)(age * yearsOfService);
    }

    @Override
    public void showBounty() {
        System.out.println("Reputation calculation:\n" +
                "Age: " + age + "\n" +
                "Years of service: " + yearsOfService+ "\n" +
                "Reputation = " + age + " * " + yearsOfService + " = " + bounty);
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getMarineBase() {
        return marineBase;
    }

    public void setMarineBase(String marineBase) {
        this.marineBase = marineBase;
    }

    public Integer getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(Integer yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    @Override
    public String toString() {
        if(devilFruit == null && hakis.isEmpty())
            return super.toString() + "\n" +
                    "Rank: " + rank + "\n" +
                    "Marine Base: " + marineBase + "\n" +
                    "Years of Service: " + yearsOfService + "\n" +
                    "Bounty: " + bounty + "\n";

        else
            return super.toString() + "\n" +
                    "Rank: " + rank + "\n" +
                    "Marine Base: " + marineBase + "\n" +
                    "Years of Service: " + yearsOfService + "\n" +
                    "Bounty: " + bounty + "\n" +
                    "Devil Fruit: " + devilFruit + "\n" +
                    "Haki: " + hakis;

    }
}
