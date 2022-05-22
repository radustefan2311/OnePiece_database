package characters;

import java.util.LinkedList;

import specialAbilities.DevilFruit;
import specialAbilities.Haki;

public class Warlord extends Pirate {
    private Integer missionsDone;
    private Integer yearsOfService;

    public Warlord() {
    }

    public Warlord(String name, String sea, Integer age, String status, DevilFruit devilFruit, LinkedList<Haki> hakis, Integer threatLevel, Integer crewSize, String notority, Integer missionsDone, Integer yearsOfService) {
        super(name, sea, age, status, devilFruit, hakis, threatLevel, crewSize, notority);
        this.missionsDone = missionsDone;
        this.yearsOfService = yearsOfService;

        decreaseBounty();
    }
    
    public Warlord(String name, String sea, Integer age, String status, Integer threatLevel, Integer crewSize, String notority, Integer missionsDone, Integer yearsOfService) {
        super(name, sea, age, status, threatLevel, crewSize, notority);
        this.missionsDone = missionsDone;
        this.yearsOfService = yearsOfService;
        
        decreaseBounty();
        
    }

    @Override
    protected void addHaki(Haki haki) {
        hakis.add(haki);
    }

    protected void decreaseBounty() {
        
        this.bounty = (double) (missionsDone * yearsOfService);
        
    }

    @Override
    public void showBounty() {
        System.out.println("Bounty calculator:\n" +
                "Missions Done: " + yearsOfService + "\n" +
                "Years Of Service: " + yearsOfService + "\n" +
                "Curent bounty: " + bounty);
    }


    public Integer getMissionsDone() {
        return missionsDone;
    }

    public void setMissionsDone(Integer missionsDone) {
        this.missionsDone = missionsDone;
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
                    "Missions Done: " + missionsDone + "\n" +
                    "Years of service: " + yearsOfService + "\n" +
                    "Bounty: " + bounty + "\n";

        else
            return super.toString() + "\n" +
                    "Missions Done: " + missionsDone + "\n" +
                    "Years of service: " + yearsOfService + "\n" +
                    "Devil Fruit: " + devilFruit + "\n" +
                    "Haki: " + hakis + "\n" +
                    "Bounty: " + bounty +  "\n";

    }
}
