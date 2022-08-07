public class Gryffindor extends Hogwarts{
    private int nobility;   //Р±Р»Р°РіРѕСЂРѕРґСЃС‚РІРѕ
    private int honour;      //С‡РµСЃС‚СЊ
    private int bravery;    //С…СЂР°Р±СЂРѕСЃС‚СЊ
    protected Gryffindor(String name, String surname, int witchcraft, int transgression,
                         int nobility, int honour, int bravery) {
        super(name, surname, witchcraft, transgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getBravery() {
        return bravery;
    }

    public int getHonour() {
        return honour;
    }

    public int getNobility() {
        return nobility;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void setHonour(int honor) { this.honour = honour; }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public int getGryffindorStudentScore(){
        return honour + nobility + bravery;
    }
}
