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

    public int getHogwartsStudentsScore() {
        return witchcraft + transgression;
    }

    public void CompareHogwartsStudents(Hogwarts student) {
        int score1 = getHogwartsStudentsScore(); //gets score of current instance of class Hogwarts (i.e. Harry or Goyle)
        int score2 = student.getHogwartsStudentsScore(); //gets score of the instance given in brackets - who the 1st student will be comparing to.
        if (score1 > score2)
        {System.out.printf("Student %s %s with score %d is better than student %s %s with score %d\n",
                getName(), getSurname(), score1, student.getName(), student.getSurname(), score2);
        } else if (score1 < score2)
        {System.out.printf("Student %s %s with score %d is better than student %s %s with score %d\n",
                student.getName(), student.getSurname(), score2, getName(), getSurname(), score1);
        } else {
            System.out.printf("Students %s %s and %s %s have same scores of %d\n", getName(), getSurname(),
                    student.getName(), student.getSurname(), score1);
        }
    }
}