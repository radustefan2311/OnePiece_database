package characters;


import crews.Crew;
import services.ServiceEmperor;
import services.ServiceWarlord;
import special_abilities.DevilFruit;
import special_abilities.Haki;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Devil Fruit objects

        DevilFruit devilFruit1 = new DevilFruit("Tremor Tremor", "Paramicia", false);
        DevilFruit devilFruit2 = new DevilFruit("Dragon Dragon", "Zoan", true);
        DevilFruit devilFruit3 = new DevilFruit("Slice Slice", "Paramecia", false);
        DevilFruit devilFruit4 = new DevilFruit("Human Human", "Zoan", true);
        DevilFruit devilFruit5 = new DevilFruit("String String", "Paramecia", false);
       // DevilFruit devilFruit6 = new DevilFruit("Dragon Dragon", "Zoan", true);


        // Haki objects
        Haki armamentF = new Haki("Armament", false);
        Haki observationF = new Haki("Observation", false);
        Haki kingF = new Haki("King", false);
        Haki armamentT = new Haki("Armament", true);
        Haki observationT = new Haki("Observation", true);
        Haki kingT = new Haki("King", true);

        // Emperor objects

        Emperor emperor1 = new Emperor("Edward Newgate","Grand Line",72,"Deceased",devilFruit1,new LinkedList<>(),10,300,"high",12,"Sphinx");
        Emperor emperor2 = new Emperor("Kaido","Grand Line",59,"Alive/Wanted",devilFruit2,new LinkedList<>(),10,600,"high",3,"Onigashima");

        emperor1.addHaki(armamentF);
        emperor1.addHaki(observationF);
        emperor1.addHaki(kingF);

//        System.out.println("TEST HAKI ----------------------");
//        System.out.println(emperor1);
//        System.out.println("\nFINISH TEST ----------------------");
//        System.out.println(emperor2);

        Warlord warlord1 = new Warlord("Buggy The Clown","Grand Line",39,"Alive",devilFruit3,new LinkedList<>(),8,150,"medium",5,2);
        Warlord warlord2 = new Warlord("Donquixote Doflamingo","Red Line",41,"Alive/Captured",devilFruit5,new LinkedList<>(),10,15,"high",2,1);

//        System.out.println(warlord1);
       
       
//        List<Character> crewMembers = new LinkedList<>();
//        crewMembers.add(emperor1);
//        System.out.println(crewMembers);

        WorstGeneration worstGeneration1 = new WorstGeneration("Monkey D. Luffy","East Blue",19,"Alive/Wanted",devilFruit4,new LinkedList<>(),9,500,"high",20,true);
        WorstGeneration worstGeneration2 = new WorstGeneration("Roronoa Zoro","East Blue",21,"Alive/Wanted",null,new LinkedList<>(),7,500,"medium",20,true);


        worstGeneration1.addHaki(armamentT);
        worstGeneration1.addHaki(observationT);
        worstGeneration1.addHaki(kingT);

        worstGeneration2.addHaki(kingF);
        worstGeneration2.addHaki(armamentF);

        Crew Strawhats = new Crew("Strawhats","Thousand Sunny",worstGeneration1);
        Crew Whitebeard = new Crew("Whitebeard","Moby Dick",emperor1);

        Strawhats.addCrewMember(worstGeneration1);
        Strawhats.addCrewMember(worstGeneration2);
        Whitebeard.addCrewMember(emperor1);

        System.out.println("CREW--------------------");
        System.out.println(Strawhats);
        System.out.println(Whitebeard);
        
        System.out.println("HASH-LIST--------------------");
        HashSet<DevilFruit> devilFruits = new HashSet<>();
        devilFruits.add(devilFruit5);
        devilFruits.add(devilFruit4);
        System.out.println(devilFruits);
        

        List<Character> charactersList = new LinkedList<>();

        charactersList.add(emperor1);
        charactersList.add(emperor2);
        charactersList.add(warlord2);
        charactersList.add(worstGeneration1);
        charactersList.add(worstGeneration2);
        
        
        Collections.sort((List<Character>) charactersList);
        System.out.println("SORTARE----------------------");
        System.out.println(charactersList);
        
        System.out.println("SERVICE----------------------");
        ServiceEmperor serviceEemperor = new ServiceEmperor();
        serviceEemperor.addEmperor(emperor1); 
        serviceEemperor.printListEmperors();
        ServiceWarlord serivceWarlord = new ServiceWarlord();
        serivceWarlord.addWarlord(warlord1);
        serivceWarlord.addWarlord(warlord2);
        serivceWarlord.removeWarlordByIndex(1);
        serivceWarlord.printListWarlordsByMissions();
        serivceWarlord.printListWarlords();
        
        serivceWarlord.removelistWarlordByName("Buggy the Clown");
        serivceWarlord.printListWarlords();
        
        
    }
}
