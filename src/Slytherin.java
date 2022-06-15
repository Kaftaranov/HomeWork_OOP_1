import java.util.Random;

public class Slytherin extends Hogwarts{
    private int trick;          //С…РёС‚СЂРѕСЃС‚СЊ
    private int determination;  //СЂРµС€РёС‚РµР»СЊРЅРѕСЃС‚СЊ
    private int ambition;       //Р°РјР±РёС†РёРѕР·РЅРѕСЃС‚СЊ
    private int ingenuity;      //РЅР°С…РѕРґС‡РёРІРѕСЃС‚СЊ
    private int power_thirsty;  //Р¶Р°Р¶РґР° РІР»Р°СЃС‚Рё

    protected Slytherin(String name, String surname) {
        super(name, surname);
        trick = new Random().nextInt(10,100);
        determination = new Random().nextInt(10,100);
        ambition = new Random().nextInt(10,100);
        ingenuity = new Random().nextInt(10,100);
        power_thirsty = new Random().nextInt(10,100);
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
    public int getStudentScore(){
        return trick + ingenuity + power_thirsty + determination + ambition;
    }

}
