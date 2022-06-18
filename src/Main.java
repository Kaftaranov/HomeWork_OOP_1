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
    private static void bestGryffindorStudent(){
        int maxScore = GRYFFINDORSTUDENT[0].getStudentScore();
        Gryffindor student = GRYFFINDORSTUDENT[0];
        for (Gryffindor gryffindor : GRYFFINDORSTUDENT) {
            if (gryffindor.getStudentScore() > maxScore) {
                maxScore = gryffindor.getStudentScore();
                student = gryffindor;
            }
        }
        System.out.println("The best student of Gryffindor is "+student.getName() + " " + student.getSurname() +
                " with total score " + maxScore + " points!");
    }
    private static void puffenduyadmission () {
        for (int i = 0; i < Main.PUFFENDUYSTUDENTLIST.length; i++) {
            PUFFENDUYSTUDENT[i] = new Puffenduy(Main.PUFFENDUYSTUDENTLIST[i].split(" ")[0],
                    Main.PUFFENDUYSTUDENTLIST[i].split(" ")[1], new Random().nextInt(10, 100),
                    new Random().nextInt(10, 100),new Random().nextInt(10, 100),
                    new Random().nextInt(10, 100),new Random().nextInt(10, 100));
        }
    }
    private  static void bestPuffenduyStudent() {
        int maxScore = PUFFENDUYSTUDENT[0].getStudentScore();
        Puffenduy student = PUFFENDUYSTUDENT[0];
        for (Puffenduy puffenduy : PUFFENDUYSTUDENT) {
            if (puffenduy.getStudentScore() > maxScore) {
                maxScore = puffenduy.getStudentScore();
                student = puffenduy;
            }
        }
        System.out.println("The best student of Puffenduy is "+ student.getName() + " " + student.getSurname() +
                " with total score " + maxScore + " points!");
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
    private static void bestKogtevranStudent(){
        int maxScore = KOGTEVRANSTUDENT[0].getStudentScore();
        Kogtevran student = KOGTEVRANSTUDENT[0];
        for (Kogtevran kogtevran : KOGTEVRANSTUDENT) {
            if (kogtevran.getStudentScore() > maxScore) {
                maxScore = kogtevran.getStudentScore();
                student = kogtevran;
            }
        }
        System.out.println("The best student of Kogtevran is "+student.getName() + " " + student.getSurname() +
                " with total score " + maxScore + " points!");
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
    private static void bestSlytherinStudent(){
        int maxScore = SLYTHERINSTUDENT[0].getStudentScore();
        Slytherin student = SLYTHERINSTUDENT[0];
        for (Slytherin slytherin : SLYTHERINSTUDENT) {
            if (slytherin.getStudentScore() > maxScore) {
                maxScore = slytherin.getStudentScore();
                student = slytherin;
            }
        }
        System.out.println("The best student of Slytherin is "+student.getName() + " " + student.getSurname() +
                " with total score " + maxScore + " points!");
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
public static void compareStudents() {
    int lengthOfHogwartsStudentsList = GRYFFINDORSTUDENT.length + PUFFENDUYSTUDENT.length + KOGTEVRANSTUDENT.length + SLYTHERINSTUDENT.length;
    String[] hogwartsStudents = new String[lengthOfHogwartsStudentsList];
    int[] witchcraft = new int[lengthOfHogwartsStudentsList];
    int[] transgression = new int[lengthOfHogwartsStudentsList];
    for (int i = 0; i < GRYFFINDORSTUDENT.length; i++) {
        hogwartsStudents[i] = GRYFFINDORSTUDENT[i].getName() + " " + GRYFFINDORSTUDENT[i].getSurname();
        witchcraft[i] = GRYFFINDORSTUDENT[i].getWitchCraft();
        transgression[i] = GRYFFINDORSTUDENT[i].getTransgression();
    }
        for (int j = 0; j < PUFFENDUYSTUDENT.length; j++){
            hogwartsStudents[GRYFFINDORSTUDENT.length + j] = PUFFENDUYSTUDENT[j].getName() + " " + PUFFENDUYSTUDENT[j].getSurname();
            witchcraft[GRYFFINDORSTUDENT.length + j] = PUFFENDUYSTUDENT[j].getWitchCraft();
            transgression[GRYFFINDORSTUDENT.length + j] = PUFFENDUYSTUDENT[j].getTransgression();
    }
        for (int j = 0; j < KOGTEVRANSTUDENT.length; j++) {
            hogwartsStudents[GRYFFINDORSTUDENT.length + PUFFENDUYSTUDENT.length + j] =
                             KOGTEVRANSTUDENT[j].getName() + " " + KOGTEVRANSTUDENT[j].getSurname();
            witchcraft[GRYFFINDORSTUDENT.length + PUFFENDUYSTUDENT.length + j] = KOGTEVRANSTUDENT[j].getWitchCraft();
            transgression[GRYFFINDORSTUDENT.length + PUFFENDUYSTUDENT.length + j] = KOGTEVRANSTUDENT[j].getTransgression();
        }
        for (int j = 0; j < SLYTHERINSTUDENT.length; j++) {
            hogwartsStudents[GRYFFINDORSTUDENT.length + PUFFENDUYSTUDENT.length + KOGTEVRANSTUDENT.length +j] =
                    SLYTHERINSTUDENT[j].getName() + " " + SLYTHERINSTUDENT[j].getSurname();
            witchcraft[GRYFFINDORSTUDENT.length + PUFFENDUYSTUDENT.length + KOGTEVRANSTUDENT.length +j] =
                    SLYTHERINSTUDENT[j].getWitchCraft();
            transgression[GRYFFINDORSTUDENT.length + PUFFENDUYSTUDENT.length + KOGTEVRANSTUDENT.length +j] =
                    SLYTHERINSTUDENT[j].getTransgression();
        }

    int i = new Random().nextInt(0, lengthOfHogwartsStudentsList);
    int j = new Random().nextInt(0, lengthOfHogwartsStudentsList);
    if (i == j) {
        j = new Random().nextInt(0, lengthOfHogwartsStudentsList);
    }
    System.out.println("Today we compare abilities of " + hogwartsStudents[i] + " and " + hogwartsStudents[j] + ".");
    System.out.println("Witchcraft of " + hogwartsStudents[i] + " is " + witchcraft[i] + " points, and his transgression is "
            + transgression[i] + " points.");
    System.out.print("His witchcraft is ");
    if (witchcraft[i] < witchcraft[j]) {
        System.out.print("weaker than");
    } else if (witchcraft[i] > witchcraft[j]) {
        System.out.print("stronger than");
    } else {
        System.out.print("equal to");}
        System.out.println(" witchcraft of " + hogwartsStudents[j] + " with " + witchcraft[j] + " points.");
        System.out.print("Transgression of " + hogwartsStudents[i] + " is ");
        if (transgression[i] < transgression[j]) {
            System.out.print("weaker than");
        } else if (transgression[i] > transgression[j]) {
            System.out.print("stronger than");
        } else {
            System.out.print("equal to");
        }
        System.out.println(" transgression of " + hogwartsStudents[j] + " with " + transgression[j] + " points.");

    }
    public static void main(String[] args) {
        gryffindorAdmission();
        printGryffindorStudents();
        bestGryffindorStudent();
        puffenduyadmission();
        printPuffenduyStudents();
        bestPuffenduyStudent();
        kogtevranAdmission();
        printKogtevranStudents();
        bestKogtevranStudent();
        slytherinAdmission();
        printSlytherinStudents();
        bestSlytherinStudent();
        System.out.println();
        compareStudents();
    }
}