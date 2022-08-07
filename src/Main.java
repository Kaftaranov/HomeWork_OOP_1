import java.util.Random;

public class Main {
    private static final String[] GRYFFINDORSTUDENTSLIST = new String[] {"Harry Potter", "Germiona Granger", "Rohn Weasley"};
    private static final String[] SLYTHERINSTUDENTSLIST = new String[] {"Dracko Malfoy", "Graham Montegue", "Gregory Goyle"};
    private static final String[] PUFFENDUYSTUDENTLIST = new String[] {"Zakharia Smith", "Sadrick Diggory", "Justin Finch-Fletchlie"};
    private static final String[] KOGTEVRANSTUDENTLIST = new String[] {"Chzhou Chang", "Padma Mateel", "Markus Balbie"};
    private static final Gryffindor[] GRYFFINDORSTUDENT = new Gryffindor[GRYFFINDORSTUDENTSLIST.length];
    private static final Puffenduy[] PUFFENDUYSTUDENT = new Puffenduy[PUFFENDUYSTUDENTLIST.length];
    private static final Kogtevran[] KOGTEVRANSTUDENT = new Kogtevran[KOGTEVRANSTUDENTLIST.length];
    private static final Slytherin[] SLYTHERINSTUDENT = new Slytherin[SLYTHERINSTUDENTSLIST.length];

    private static void gryffindorAdmission() {
        for (int i = 0; i < Main.GRYFFINDORSTUDENTSLIST.length; i++) {
            GRYFFINDORSTUDENT[i] = new Gryffindor(Main.GRYFFINDORSTUDENTSLIST[i].split(" ")[0],
                    Main.GRYFFINDORSTUDENTSLIST[i].split(" ")[1], new Random().nextInt(10, 100),
                    new Random().nextInt(10, 100), new Random().nextInt(10, 100),
                    new Random().nextInt(10, 100), new Random().nextInt(10, 100));
        }
    }

    private static void puffenduyadmission () {
        for (int i = 0; i < Main.PUFFENDUYSTUDENTLIST.length; i++) {
            PUFFENDUYSTUDENT[i] = new Puffenduy(Main.PUFFENDUYSTUDENTLIST[i].split(" ")[0],
                    Main.PUFFENDUYSTUDENTLIST[i].split(" ")[1], new Random().nextInt(10, 100),
                    new Random().nextInt(10, 100),new Random().nextInt(10, 100),
                    new Random().nextInt(10, 100),new Random().nextInt(10, 100));
        }
    }

    private static void kogtevranAdmission () {
        for (int i = 0; i < Main.KOGTEVRANSTUDENTLIST.length; i++) {
            KOGTEVRANSTUDENT[i] = new Kogtevran(Main.KOGTEVRANSTUDENTLIST[i].split(" ")[0],
                    Main.KOGTEVRANSTUDENTLIST[i].split(" ")[1], new Random().nextInt(10, 100),
                    new Random().nextInt(10, 100),new Random().nextInt(10, 100),
                    new Random().nextInt(10, 100),new Random().nextInt(10, 100),
                    new Random().nextInt(10, 100));
        }
    }

    private static void slytherinAdmission () {
        for (int i = 0; i < Main.SLYTHERINSTUDENTSLIST.length; i++) {
            SLYTHERINSTUDENT[i] = new Slytherin(Main.SLYTHERINSTUDENTSLIST[i].split(" ")[0],
                    Main.SLYTHERINSTUDENTSLIST[i].split(" ")[1], new Random().nextInt(10, 100),
                    new Random().nextInt(10, 100),new Random().nextInt(10, 100),
                    new Random().nextInt(10, 100),new Random().nextInt(10, 100),
                    new Random().nextInt(10, 100), new Random().nextInt(10, 100));
        }
    }
    private static void printFooter(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
    public static void printGryffindorStudents(){
        String headingForName = "| Gryffindor Student ";
        String headingForWitchcraft = "| Witchcraft ";
        String headingForTransgression = "| Transgression ";
        String headingForNobility = "| Nobility ";
        String headingForHonour = "| Honour ";
        String headingForBravery = "| Bravery |";
        int headingLength = headingForName.length() + headingForWitchcraft.length() + headingForTransgression.length() +
                headingForBravery.length() + headingForHonour.length() + headingForNobility.length();
        printFooter(headingLength);
        System.out.println(headingForName + headingForWitchcraft+headingForTransgression+headingForNobility+
                headingForHonour+headingForBravery);
        printFooter(headingLength);
        for (Gryffindor gryffindor : GRYFFINDORSTUDENT) {
            System.out.print("| "+gryffindor.getName() + " " + gryffindor.getSurname());
            for (int i = 0; i < headingForName.length()-1-gryffindor.getName().length()-1
                    -gryffindor.getSurname().length()-1 ; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.print("\t   " + gryffindor.getWitchCraft() + "\t  |");
            System.out.print("\t\t" + gryffindor.getTransgression() + "\t      |");
            System.out.print("\t   " + gryffindor.getNobility() + "\t |");
            System.out.print("   " + gryffindor.getHonour() + "   |");
            System.out.println("\t   " + gryffindor.getBravery() + "   |");
        }
        printFooter(headingLength);
    }
    public static void printPuffenduyStudents(){
        String headingForName = "| Puffenduy Student       ";
        String headingForWitchcraft = "| Witchcraft ";
        String headingForTransgression = "| Transgression ";
        String headingForDiligence = "| Diligence ";
        String headingForHonesty = "| Honesty ";
        String headingForLoyalty = "| Loyalty |";
        int headingLength = headingForName.length() + headingForWitchcraft.length() + headingForTransgression.length() +
                headingForLoyalty.length() + headingForHonesty.length() + headingForDiligence.length();
        printFooter(headingLength);
        System.out.println(headingForName + headingForWitchcraft+headingForTransgression+ headingForDiligence +
                headingForHonesty+headingForLoyalty);
        printFooter(headingLength);
        for (Puffenduy puffenduy : PUFFENDUYSTUDENT) {
            System.out.print("| " + puffenduy.getName() + " " + puffenduy.getSurname());
            for (int i = 0; i < headingForName.length()-1-puffenduy.getName().length()-1
                    -puffenduy.getSurname().length()-1 ; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.print("\t   " + puffenduy.getWitchCraft() + "\t   |");
            System.out.print("\t    " + puffenduy.getTransgression() + "\t   |");
            System.out.print("\t " + puffenduy.getDiligence() + "\t   |");
            System.out.print("\t" + puffenduy.getHonesty() + "   |");
            System.out.println("\t " + puffenduy.getLoyalty() + "    |");
        }
        printFooter(headingLength);
    }
    public static void printKogtevranStudents(){
        String headingForName = "| Kogtevran Student ";
        String headingForWitchcraft = "| Witchcraft ";
        String headingForTransgression = "| Transgression ";
        String headingForClever = "| Clever ";
        String headingForWit = "| Wit ";
        String headingForWisdom = "| Wisdom ";
        String headingForCreative = "| Creative |";
        int headingLength = headingForName.length() + headingForWitchcraft.length() + headingForTransgression.length() +
                headingForWisdom.length() + headingForWit.length() + headingForClever.length() + headingForCreative.length();
        printFooter(headingLength);
        System.out.println(headingForName + headingForWitchcraft+headingForTransgression+ headingForClever +
                headingForWit + headingForWisdom + headingForCreative);
        printFooter(headingLength);
        for (Kogtevran kogtevran : KOGTEVRANSTUDENT) {
            System.out.print("| " + kogtevran.getName() + " " + kogtevran.getSurname());
            for (int i = 0; i < headingForName.length()-1-kogtevran.getName().length()-1
                    -kogtevran.getSurname().length()-1 ; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.print("\t  " + kogtevran.getWitchCraft() + "\t |");
            System.out.print("\t    " + kogtevran.getTransgression() + "\t     |");
            System.out.print("\t " + kogtevran.getClever() + "   |");
            System.out.print("  " + kogtevran.getWit() + " |");
            System.out.print("\t" + kogtevran.getWisdom() + "   |");
            System.out.println("    " + kogtevran.getCreative() + "    |");
        }
        printFooter(headingLength);
    }
    public static void printSlytherinStudents(){
        String headingForName = "| Slytherin Student ";
        String headingForWitchcraft = "| Witchcraft ";
        String headingForTransgression = "| Transgression ";
        String headingForTrick = "| Trick ";
        String headingForDetermination = "| Determination ";
        String headingForAmbition = "| Ambition ";
        String headingForIngenuity = "| Ingenuity ";
        String headingForPower_Thirsty = "| Power thirsty |";
        int headingLength = headingForName.length() + headingForWitchcraft.length() + headingForTransgression.length() +
                headingForAmbition.length() + headingForDetermination.length() + headingForIngenuity.length() +
                headingForTrick.length() + headingForPower_Thirsty.length();
        printFooter(headingLength);
        System.out.println(headingForName + headingForWitchcraft+headingForTransgression+ headingForTrick +
                headingForDetermination + headingForAmbition + headingForIngenuity + headingForPower_Thirsty );
        printFooter(headingLength);
        for (Slytherin slytherin : SLYTHERINSTUDENT) {
            System.out.print("| " + slytherin.getName() + " " + slytherin.getSurname());
            for (int i = 0; i < headingForName.length()-1-slytherin.getName().length()-1
                    -slytherin.getSurname().length()-1 ; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.print("\t  " + slytherin.getWitchCraft() + "\t |");
            System.out.print("\t    " + slytherin.getTransgression() + "\t     |");
            System.out.print("\t " + slytherin.getTrick() + "  |");
            System.out.print("\t    " + slytherin.getDetermination()  + "       |");
            System.out.print("\t  " + slytherin.getAmbition() + "   |");
            System.out.print("\t  " + slytherin.getIngenuity() + "    |");
            System.out.println("\t   " + slytherin.getPower_thirsty() + "\t    |");
        }
        printFooter(headingLength);
    }

    public static void main(String[] args) {
        gryffindorAdmission();
        printGryffindorStudents();
        GRYFFINDORSTUDENT[3].compareGryffindorStudent(GRYFFINDORSTUDENT[1]);
        puffenduyadmission();
        printPuffenduyStudents();
        PUFFENDUYSTUDENT[1].comparePuffenduyStudent(PUFFENDUYSTUDENT[3]);
        kogtevranAdmission();
        printKogtevranStudents();
        KOGTEVRANSTUDENT[2].compareKogtevranStudent(KOGTEVRANSTUDENT[1]);
        slytherinAdmission();
        printSlytherinStudents();
        SLYTHERINSTUDENT[2].compareSlytherinStudent(SLYTHERINSTUDENT[3]);
        System.out.println();
        GRYFFINDORSTUDENT[2].CompareHogwartsStudents(SLYTHERINSTUDENT[1]);
    }
}