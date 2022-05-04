package characters;

import special_abilities.DevilFruit;
import special_abilities.Haki;

import java.util.LinkedList;

public class Emperor extends Pirate {
    private Integer kingdomsProtection;
    private String base;

    public Emperor() {
    }

    public Emperor(String name, String sea, Integer age, String status, DevilFruit devilFruit, LinkedList<Haki> hakis, Integer threatLevel, Integer crewSize, String notority, Integer kingdomsProtection, String base) {
        super(name, sea, age, status, devilFruit, hakis, threatLevel, crewSize, notority);
        this.kingdomsProtection = kingdomsProtection;
        this.base = base;
    }

    protected void yonkoBountyCalculation() {
        this.bounty = (double) (crewSize * threatLevel * kingdomsProtection * 100);
    }

    @Override
    public void showBounty() {
        System.out.println("Bounty calculator:\n" +
                "Crew Size: " + crewSize+ "\n" +
                "Threat Level: " + threatLevel + "\n" +
                "Kingdoms Protected: " + kingdomsProtection + "\n" +
                "Bounty = " + crewSize + " * " + threatLevel + " * " + kingdomsProtection +
                 " = " + bounty);
    }

    @Override
    protected void addHaki(Haki haki) {
        hakis.add(haki);
    }

    public Integer getKingdomsProtection() {
        return kingdomsProtection;
    }

    public void setKingdomsProtection(Integer kingdomsProtection) {
        this.kingdomsProtection = kingdomsProtection;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }


    @Override
    public String toString() {
        if(devilFruit == null && hakis.isEmpty())
            return super.toString() + "\n" +
                    "Kingdoms: " + kingdomsProtection + "\n" +
                    "Base: " + base + "\n" +
                    "Bounty: " + bounty + "\n";

        else
            return super.toString() + "\n" +
                    "Kingdoms: " + kingdomsProtection + "\n" +
                    "Base: " + base + "\n" +
                    "Devil Fruit: " + devilFruit + "\n" +
                    "Bounty: " + bounty +  "\n" +
                    "Haki: " + hakis;

    }
}
