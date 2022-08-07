public class Kogtevran extends Hogwarts{
    private int clever;     //СѓРј
    private int wit;        //РѕСЃС‚СЂРѕСѓРјРёРµ
    private int wisdom;     //РјСѓРґСЂРѕСЃС‚СЊ
    private int creative;   //С‚РІРѕСЂС‡РµСЃС‚РІРѕ
    protected Kogtevran(String name, String surname, int witchcraft, int transgression,
                        int clever, int wit, int wisdom, int creative) {
        super(name, surname, witchcraft, transgression);
        this.clever = clever;
        this.wit = wit;
        this.wisdom = wisdom;
        this.creative = creative;
    }

    public int getClever() {
        return clever;
    }

    public int getWit() {
        return wit;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCreative() {
        return creative;
    }

    public void setClever(int clever) {
        this.clever = clever;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
    public int getKogtevranStudentScore(){
        return wisdom + wit + clever + creative;
    }
    public void compareKogtevranStudent (Kogtevran student) {
        int score1 = getKogtevranStudentScore();
        int score2 = student.getKogtevranStudentScore();
        if (score1 > score2) {
            System.out.printf("Kogtevran student %s %s with score %d is better than student %s %s with score %d\n",
                    getName(), getSurname(), score1, student.getName(), student.getSurname(), score2);
        } else if (score1 < score2) {
            System.out.printf("Kogtevran student %s %s with score %d is better than student %s %s with score %d\n",
                    student.getName(), student.getSurname(), score2, getName(), getSurname(), score1);
        } else {
            System.out.printf("Kogtevran students %s %s and %s %s have same scores of %d\n", getName(), getSurname(),
                    student.getName(), student.getSurname(), score1);
        }
    }

}
