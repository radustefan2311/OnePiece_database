package characters;

import special_abilities.DevilFruit;
import special_abilities.Haki;

import java.util.LinkedList;

public class WorstGeneration extends Pirate {
    private Integer agaistWorldG; //Number of actions that provoked the Navy
    private boolean supernova; //Most powerful out of his crew

    public WorstGeneration (){
    }

    public WorstGeneration(String name, String sea, Integer age, String status, DevilFruit devilFruit, LinkedList<Haki> hakis, Integer threatLevel, Integer crewSize, String notority, Integer agaistWorldG, boolean supernova) {
        super(name, sea, age, status, devilFruit, hakis, threatLevel, crewSize, notority);
        this.agaistWorldG = agaistWorldG;
        this.supernova = supernova;

        wgBountyCalculation();
    }

    protected void wgBountyCalculation() {
        if (supernova == true)
            this.bounty = (double) (crewSize * threatLevel * agaistWorldG);
        else {
            this.bounty = (double) (crewSize * threatLevel);
        }
    }

    @Override
    protected void addHaki(Haki haki) {
        hakis.add(haki);
    }

    @Override
    public void showBounty() {
        System.out.println("Bounty calculator:\n" +
                "Crew Size: " + crewSize+ "\n" +
                "Threat Level: " + threatLevel + "\n" +
                "Provoke Actions: " + agaistWorldG + "\n" +
                "Bounty = " + crewSize + " * " + threatLevel + " * " + agaistWorldG +
                " = " + bounty);
    }

    public Integer getAgaistWorldG() {
        return agaistWorldG;
    }

    public void setAgaistWorldG(Integer agaistWorldG) {
        this.agaistWorldG = agaistWorldG;
    }

    public boolean isSupernova() {
        return supernova;
    }

    public void setSupernova(boolean supernova) {
        this.supernova = supernova;
    }

    @Override
    public String toString() {
        if(devilFruit == null && hakis.isEmpty())
            return super.toString() + "\n" +
                    "Provoke Actions: " + agaistWorldG+ "\n" +
                    "Supernova: " + supernova + "\n" +
                    "Bounty: " + bounty + "\n";

        else
            return super.toString() + "\n" +
                    "Provoke Actions: " + agaistWorldG+ "\n" +
                    "Supernova: " + supernova + "\n" +
                    "Bounty: " + bounty + "\n" +
                    "Devil Fruit: " + devilFruit + "\n" +
                    "Haki: " + hakis;

    }
}
