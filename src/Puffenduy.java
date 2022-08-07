public class Puffenduy extends Hogwarts{
    private int diligence;  //С‚СЂСѓРґРѕР»СЋР±РёРµ
    private int loyalty;    //РІРµСЂРЅРѕСЃС‚СЊ
    private int honesty;    //С‡РµСЃС‚РЅРѕСЃС‚СЊ
    protected Puffenduy(String name, String surname, int witchcraft, int transgression,
                        int diligence, int loyalty, int honesty) {
        super(name, surname, witchcraft, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getHonesty() {
        return honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }
    public int getPuffenduyStudentScore(){
        return honesty + loyalty + diligence;
    }
    public void comparePuffenduyStudent (Puffenduy student) {
        int score1 = getPuffenduyStudentScore();
        int score2 = student.getPuffenduyStudentScore();
        if (score1 > score2) {
            System.out.printf("Puffenduy student %s %s with score %d is better than student %s %s with score %d\n",
                    getName(), getSurname(), score1, student.getName(), student.getSurname(), score2);
        } else if (score1 < score2) {
            System.out.printf("Puffenduy student %s %s with score %d is better than student %s %s with score %d\n",
                    student.getName(), student.getSurname(), score2, getName(), getSurname(), score1);
        } else {
            System.out.printf("Puffenduy students %s %s and %s %s have same scores of %d\n", getName(), getSurname(),
                    student.getName(), student.getSurname(), score1);
        }
    }

}
