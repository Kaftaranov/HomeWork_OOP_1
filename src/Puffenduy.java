import java.util.Random;

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
    public int getStudentScore(){
        return honesty + loyalty + diligence;
    }
}
