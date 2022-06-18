import java.util.Random;
public class Hogwarts {
    private String name;
    private String surname;
    private int witchcraft;
    private int transgression;
    protected Hogwarts(String name, String surname, int witchcraft, int transgression) {
        this.name = name;
        this.surname = surname;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getWitchCraft() {
        return witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWitchCraft(int witchCraft) {
        this.witchcraft = witchCraft;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

}
