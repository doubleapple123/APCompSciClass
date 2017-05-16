import java.util.Scanner;

public class Lesson5_3 {
    static String Math;
    static String Science;
    static String English;
    static String CompSci;
    static String Chemistry;
    static String History;
    static String BioTech;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your letter grades for: Math, Science, English, CompSci, Chemistry, History, and Biotech.");
        Math = kb.next();
        Science = kb.next();
        English = kb.next();
        CompSci = kb.next();
        Chemistry = kb.next();
        History = kb.next();
        BioTech = kb.next();

        double gPoints = calcPoints(Math) + calcPoints(Science) + calcPoints(CompSci) + calcPoints(English) + calcPoints(Chemistry) + calcPoints(History) + calcPoints(BioTech);

        System.out.println(gPoints / 7);


    }

    public static double calcPoints(String grade) {
        if (grade.equals("A")) {
            return 4.0;
        } else if (grade.equals("B")) {
            return 3.0;
        } else if (grade.equals("C")) {
            return 2.0;
        } else if (grade.equals("D")) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}