package crews;

import characters.Character;

import java.util.LinkedList;

public class Crew {
    private String name;
    private String ship;
    private Character captain;

    private LinkedList<Character> members;

    public Crew(String name, String ship, Character captain) {
        this.name = name;
        this.ship = ship;
        this.captain = captain;
        members = new LinkedList<>();
    }



    public void addCrewMember(Character character)
    {
        members.add(character);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public Character getCaptain() {
        return captain;
    }

    public void setCaptain(Character captain) {
        this.captain = captain;
    }

    public LinkedList<Character> getMembers() {
        return members;
    }

    public void setMembers(LinkedList<Character> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "name='" + name + '\'' +
                ", ship='" + ship + '\'' +
                ", captain=" + captain +
                ", members=" + members +
                '}';
    }
}
