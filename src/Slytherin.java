public class Slytherin extends Hogwarts{
    private int trick;          //С…РёС‚СЂРѕСЃС‚СЊ
    private int determination;  //СЂРµС€РёС‚РµР»СЊРЅРѕСЃС‚СЊ
    private int ambition;       //Р°РјР±РёС†РёРѕР·РЅРѕСЃС‚СЊ
    private int ingenuity;      //РЅР°С…РѕРґС‡РёРІРѕСЃС‚СЊ
    private int power_thirsty;  //Р¶Р°Р¶РґР° РІР»Р°СЃС‚Рё

    protected Slytherin(String name, String surname, int witchcraft, int transgression,
                        int trick, int determination, int ambition, int ingenuity, int power_thirsty ) {
        super(name, surname, witchcraft, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.power_thirsty = power_thirsty;
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public int getPower_thirsty() {
        return power_thirsty;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public void setPower_thirsty(int power_thirsty) {
        this.power_thirsty = power_thirsty;
    }
    public int getSlytherinStudentScore(){
        return trick + ingenuity + power_thirsty + determination + ambition;
    }
    public void compareSlytherinStudent (Slytherin student) {
        int score1 = getSlytherinStudentScore();
        int score2 = student.getSlytherinStudentScore();
        if (score1 > score2) {
            System.out.printf("Slytherin student %s %s with score %d is better than student %s %s with score %d\n",
                    getName(), getSurname(), score1, student.getName(), student.getSurname(), score2);
        } else if (score1 < score2) {
            System.out.printf("Slytherin student %s %s with score %d is better than student %s %s with score %d\n",
                    student.getName(), student.getSurname(), score2, getName(), getSurname(), score1);
        } else {
            System.out.printf("Slytherin students %s %s and %s %s have same scores of %d\n", getName(), getSurname(),
                    student.getName(), student.getSurname(), score1);
        }
    }

}
