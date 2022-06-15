import java.util.Random;

public class Kogtevran extends Hogwarts{
    private int clever;     //СѓРј
    private int wit;        //РѕСЃС‚СЂРѕСѓРјРёРµ
    private int wisdom;     //РјСѓРґСЂРѕСЃС‚СЊ
    private int creative;   //С‚РІРѕСЂС‡РµСЃС‚РІРѕ
    protected Kogtevran(String name, String surname) {
        super(name, surname);
        clever = new Random().nextInt(100);
        wit = new Random().nextInt(100);
        wisdom = new Random().nextInt(100);
        creative = new Random().nextInt(100);
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
    public int getStudentScore(){
        return wisdom + wit + clever + creative;
    }

}
