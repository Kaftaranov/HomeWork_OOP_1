public class Main {
    private static final String[] gryffindorStudentsList = new String[] {"Harry Potter", "Germiona Granger", "Rohn Weasley"};
    private static final String[] slytherinStudentsList = new String[] {"Dracko Malfoy", "Graham Montegue", "Gregory Goyle"};
    private static final String[] puffenduyStudentsList = new String[] {"Zakharia Smith", "Sadrick Diggory", "Justin Finch-Fletchlie"};
    private static final String[] kogtevranStudentsList = new String[] {"Chzhou Chang", "Padma Mateel", "Markus Balbie"};
    private static Gryffindor[] gryffindorStudent = new Gryffindor[gryffindorStudentsList.length];
    private static Puffenduy[] puffenduyStudent = new Puffenduy[puffenduyStudentsList.length];
    private static Kogtevran[] kogtevranStudent = new Kogtevran[kogtevranStudentsList.length];
    private static Slytherin[] slytherinStudent = new Slytherin[slytherinStudentsList.length];

    private static void gryffindorAdmission(String[] namesList) {
        for (int i = 0; i < namesList.length; i++) {
            gryffindorStudent[i] = new Gryffindor(namesList[i].split(" ")[0], namesList[i].split(" ")[1]);
        }
    }
    private static Gryffindor bestGryffindorStudent(){
        int maxScore = gryffindorStudent[0].getStudentScore();
        Gryffindor student = gryffindorStudent[0];
        for (int i = 0; i < gryffindorStudent.length; i++) {
            if (gryffindorStudent[i].getStudentScore() > maxScore) {maxScore = gryffindorStudent[i].getStudentScore();}
        }
        return student;
    }
    private static void puffenduyadmission (String[] namesList) {
        for (int i = 0; i < namesList.length; i++) {
            puffenduyStudent[i] = new Puffenduy(namesList[i].split(" ")[0], namesList[i].split(" ")[1]);
        }
    }
    private  static Puffenduy bestPuffenduyStudent() {
        int maxScore = puffenduyStudent[0].getStudentScore();
        Puffenduy student = puffenduyStudent[0];
        for (int i = 0; i < puffenduyStudent.length; i++) {
            if (puffenduyStudent[i].getStudentScore() > maxScore) {
                maxScore = puffenduyStudent[i].getStudentScore();
            }
        }
        return student;
    }

    private static void kogtevranAdmission (String[] namesList) {
        for (int i = 0; i < namesList.length; i++) {
            kogtevranStudent[i] = new Kogtevran(namesList[i].split(" ")[0], namesList[i].split(" ")[1]);
        }
    }
    private static Kogtevran bestKogtevranStudent(){
        int maxScore = kogtevranStudent[0].getStudentScore();
        Kogtevran student = kogtevranStudent[0];
        for (int i = 0; i < kogtevranStudent.length; i++) {
            if (kogtevranStudent[i].getStudentScore()>maxScore){maxScore = kogtevranStudent[i].getStudentScore();}
        }
        return student;
    }

    private static void slytherinAdmission (String[]namesList) {
        for (int i = 0; i < namesList.length; i++) {
            slytherinStudent[i] = new Slytherin(namesList[i].split(" ")[0], namesList[i].split(" ")[1]);
        }
    }
    private static Slytherin bestSlytherinStudent(){
        int maxScore = slytherinStudent[0] .getStudentScore();
        Slytherin student = slytherinStudent[0];
        for (int i = 0; i < slytherinStudent.length; i++) {
            if (slytherinStudent[i].getStudentScore()>maxScore){maxScore = slytherinStudent[i].getStudentScore();}
        }
        return student;
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
        String headingForName = "| Puffenduy Student ";
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
            System.out.print(puffenduy.getName() + " " + puffenduy.getSurname());
            System.out.print("\t\t  " + puffenduy.getWitchCraft() + "\t  |");
            System.out.print("\t\t  " + puffenduy.getTransgression() + "\t      |");
            System.out.print("\t\t  " + puffenduy.getDiligence() + "\t |");
            System.out.print("\t\t  " + puffenduy.getHonesty() + "   |");
            System.out.println("\t\t  " + puffenduy.getLoyalty() + "   |");
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
                headingForWisdom.length() + headingForWit.length() + headingForClever.length();
        printFooter(headingLength);
        System.out.println(headingForName + headingForWitchcraft+headingForTransgression+ headingForClever +
                headingForWit + headingForWisdom + headingForCreative);
        printFooter(headingLength);
        for (Kogtevran kogtevran : kogtevranStudent) {
            System.out.print(kogtevran.getName() + " " + kogtevran.getSurname() + "\t  |");
            System.out.print("\t\t  " + kogtevran.getWitchCraft() + "\t      |");
            System.out.print("\t\t  " + kogtevran.getTransgression() + "\t |");
            System.out.print("\t\t  " + kogtevran.getClever() + "   |");
            System.out.print("\t\t  " + kogtevran.getWit() + "   |");
            System.out.print("\t\t  " + kogtevran.getWisdom() + "   |");
            System.out.println("\t\t  " + kogtevran.getCreative() + "   |");
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
            System.out.print(slytherin.getName() + " " + slytherin.getSurname() + "\t  |");
            System.out.print("\t\t  " + slytherin.getWitchCraft() + "\t      |");
            System.out.print("\t\t  " + slytherin.getTransgression() + "\t      |");
            System.out.print("\t\t  " + slytherin.getTrick() + "   |");
            System.out.print("\t\t  " + slytherin.getDetermination()  + "   |");
            System.out.print("\t\t  " + slytherin.getAmbition() + "   |");
            System.out.print("\t\t  " + slytherin.getIngenuity() + "   |");
            System.out.println("\t\t : " + slytherin.getPower_thirsty() + "   |");
        }
        printFooter(headingLength);
    }

    public static void main(String[] args) {
        gryffindorAdmission(gryffindorStudentsList);
        printGryffindorStudents();
        puffenduyadmission(puffenduyStudentsList);
        printPuffenduyStudents();
        kogtevranAdmission(kogtevranStudentsList);
        printKogtevranStudents();
        slytherinAdmission(slytherinStudentsList);
        printSlytherinStudents();
    }
}