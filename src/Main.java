import java.util.Random;

public class Main {
    private static final String[] gryffindorStudentsList = new String[] {"Harry Potter", "Germiona Granger", "Rohn Weasley"};
    private static final String[] slytherinStudentsList = new String[] {"Dracko Malfoy", "Graham Montegue", "Gregory Goyle"};
    private static final String[] puffenduyStudentsList = new String[] {"Zakharia Smith", "Sadrick Diggory", "Justin Finch-Fletchlie"};
    private static final String[] kogtevranStudentsList = new String[] {"Chzhou Chang", "Padma Mateel", "Markus Balbie"};
    private static final Gryffindor[] gryffindorStudent = new Gryffindor[gryffindorStudentsList.length];
    private static final Puffenduy[] puffenduyStudent = new Puffenduy[puffenduyStudentsList.length];
    private static final Kogtevran[] kogtevranStudent = new Kogtevran[kogtevranStudentsList.length];
    private static final Slytherin[] slytherinStudent = new Slytherin[slytherinStudentsList.length];

    private static void gryffindorAdmission() {
        for (int i = 0; i < Main.gryffindorStudentsList.length; i++) {
            gryffindorStudent[i] = new Gryffindor(Main.gryffindorStudentsList[i].split(" ")[0],
                    Main.gryffindorStudentsList[i].split(" ")[1]);
        }
    }
    private static void bestGryffindorStudent(){
        int maxScore = gryffindorStudent[0].getStudentScore();
        Gryffindor student = gryffindorStudent[0];
        for (Gryffindor gryffindor : gryffindorStudent) {
            if (gryffindor.getStudentScore() > maxScore) {
                maxScore = gryffindor.getStudentScore();
                student = gryffindor;
            }
        }
        System.out.println("The best student of Gryffindor is "+student.getName() + " " + student.getSurname() +
                " with total score " + maxScore + " points!");
    }
    private static void puffenduyadmission () {
        for (int i = 0; i < Main.puffenduyStudentsList.length; i++) {
            puffenduyStudent[i] = new Puffenduy(Main.puffenduyStudentsList[i].split(" ")[0],
                    Main.puffenduyStudentsList[i].split(" ")[1]);
        }
    }
    private  static void bestPuffenduyStudent() {
        int maxScore = puffenduyStudent[0].getStudentScore();
        Puffenduy student = puffenduyStudent[0];
        for (Puffenduy puffenduy : puffenduyStudent) {
            if (puffenduy.getStudentScore() > maxScore) {
                maxScore = puffenduy.getStudentScore();
                student = puffenduy;
            }
        }
        System.out.println("The best student of Puffenduy is "+ student.getName() + " " + student.getSurname() +
                " with total score " + maxScore + " points!");
    }

    private static void kogtevranAdmission () {
        for (int i = 0; i < Main.kogtevranStudentsList.length; i++) {
            kogtevranStudent[i] = new Kogtevran(Main.kogtevranStudentsList[i].split(" ")[0],
                    Main.kogtevranStudentsList[i].split(" ")[1]);
        }
    }
    private static void bestKogtevranStudent(){
        int maxScore = kogtevranStudent[0].getStudentScore();
        Kogtevran student = kogtevranStudent[0];
        for (Kogtevran kogtevran : kogtevranStudent) {
            if (kogtevran.getStudentScore() > maxScore) {
                maxScore = kogtevran.getStudentScore();
                student = kogtevran;
            }
        }
        System.out.println("The best student of Kogtevran is "+student.getName() + " " + student.getSurname() +
                " with total score " + maxScore + " points!");
    }

    private static void slytherinAdmission () {
        for (int i = 0; i < Main.slytherinStudentsList.length; i++) {
            slytherinStudent[i] = new Slytherin(Main.slytherinStudentsList[i].split(" ")[0],
                    Main.slytherinStudentsList[i].split(" ")[1]);
        }
    }
    private static void bestSlytherinStudent(){
        int maxScore = slytherinStudent[0].getStudentScore();
        Slytherin student = slytherinStudent[0];
        for (Slytherin slytherin : slytherinStudent) {
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
        for (Gryffindor gryffindor : gryffindorStudent) {
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
        for (Puffenduy puffenduy : puffenduyStudent) {
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
        for (Kogtevran kogtevran : kogtevranStudent) {
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
        for (Slytherin slytherin : slytherinStudent) {
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
    int lengthOfHogwartsStudentsList = gryffindorStudent.length + puffenduyStudent.length + kogtevranStudent.length + slytherinStudent.length;
    String[] hogwartsStudents = new String[lengthOfHogwartsStudentsList];
    int[] witchcraft = new int[lengthOfHogwartsStudentsList];
    int[] transgression = new int[lengthOfHogwartsStudentsList];
    for (int i = 0; i < gryffindorStudent.length; i++) {
        hogwartsStudents[i] = gryffindorStudent[i].getName() + " " + gryffindorStudent[i].getSurname();
        witchcraft[i] = gryffindorStudent[i].getWitchCraft();
        transgression[i] = gryffindorStudent[i].getTransgression();
    }
        for (int j = 0; j < puffenduyStudent.length; j++){
            hogwartsStudents[gryffindorStudent.length + j] = puffenduyStudent[j].getName() + " " + puffenduyStudent[j].getSurname();
            witchcraft[gryffindorStudent.length + j] = puffenduyStudent[j].getWitchCraft();
            transgression[gryffindorStudent.length + j] = puffenduyStudent[j].getTransgression();
    }
        for (int j = 0; j < kogtevranStudent.length; j++) {
            hogwartsStudents[gryffindorStudent.length + puffenduyStudent.length + j] =
                             kogtevranStudent[j].getName() + " " + kogtevranStudent[j].getSurname();
            witchcraft[gryffindorStudent.length + puffenduyStudent.length + j] = kogtevranStudent[j].getWitchCraft();
            transgression[gryffindorStudent.length + puffenduyStudent.length + j] = kogtevranStudent[j].getTransgression();
        }
        for (int j = 0; j < slytherinStudent.length; j++) {
            hogwartsStudents[gryffindorStudent.length + puffenduyStudent.length + kogtevranStudent.length +j] =
                    slytherinStudent[j].getName() + " " + slytherinStudent[j].getSurname();
            witchcraft[gryffindorStudent.length + puffenduyStudent.length + kogtevranStudent.length +j] =
                    slytherinStudent[j].getWitchCraft();
            transgression[gryffindorStudent.length + puffenduyStudent.length + kogtevranStudent.length +j] =
                    slytherinStudent[j].getTransgression();
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