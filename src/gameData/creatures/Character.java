package gameData.creatures;

import gameData.enums.Race;

public class Character extends Creature{
    String name;
    Race race;
    String gender;
    String description;

    public Character(String name, Race race, String gender, String description) {
        this.name = name;
        this.race = race;
        this.gender = gender;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
