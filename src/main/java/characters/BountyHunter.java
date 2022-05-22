package characters;

import java.util.LinkedList;

import specialAbilities.DevilFruit;
import specialAbilities.Haki;

public class BountyHunter extends Character {
    private Integer contracts;
    private Integer succesRate; // ranges from 0% to 100%


    public BountyHunter() {
    }

    public BountyHunter(String name, String sea, Integer age, String status, DevilFruit devilFruit, LinkedList<Haki> hakis, Integer contracts, Integer succesRate) {
        super(name, sea, age, status, devilFruit, hakis);
        this.contracts = contracts;
        this.succesRate = succesRate;

        calcBounty();
    }

    @Override
    protected void calcBounty() {
        this.bounty = (double) (contracts * succesRate);
    }

    @Override
    public void showBounty() {
        System.out.println("Bounty calculator:\n" +
                "Contracts : " + contracts + "\n" +
                "Succes Rate : " + succesRate + "\n" +
                "Bounty = " + contracts + " * " + succesRate + " = " + bounty);

    }

    @Override
    protected void addHaki(Haki haki) {
        hakis.add(haki);
    }

    public Integer getContracts() {
        return contracts;
    }

    public void setContracts(Integer contracts) {
        this.contracts = contracts;
    }

    public Integer getSuccesRate() {
        return succesRate;
    }

    public void setSuccesRate(Integer succesRate) {
        this.succesRate = succesRate;
    }


    @Override
    public String toString() {
        if(devilFruit == null && hakis.isEmpty())
            return super.toString() + "\n" +
                    "Contracts : " + contracts + "\n" +
                    "Succes rate: " + succesRate + "\n" +
                    "Bounty: " + bounty + "\n";
        else
            return super.toString() + "\n" +
                    "Contracts : " + contracts + "\n" +
                    "Succes rate: " + succesRate + "\n" +
                    "Devil Fruit: " + devilFruit + "\n" +
                    "Haki: " + hakis + "\n" +
                    "Bounty: " + bounty + "\n";
    }
}

