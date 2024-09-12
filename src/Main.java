import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Hvilken tid på dagen? (dag, aften, nat)");
        String time = input.nextLine();
        System.out.println("Høj eller lav trafikmængde? (høj, lav)");
        String traffic = input.nextLine();
        System.out.println("Hvilket område er det? (bolig, erhverv, blandet)");
        String areaType = input.nextLine();
        System.out.println("Nødstilfælde (true eller false)");
        boolean emergency = input.nextBoolean();
        String string1 = "";
        String string2 = "";

        // grøn
        if (time.equals("dag") && (traffic.equals("lav")) || emergency) {
            //System.out.println("Trafiklyset er grønt");
            string1 = "Trafiklyset er grønt";
            System.out.println(string1);
        }
        // gul
        else if (time.equals("aften") && (traffic.equals("lav")) || time.equals("nat") && (traffic.equals("lav"))) {
            //System.out.println("Trafiklyset er gult");
            string1 = "Trafiklyset er gult";
            System.out.println(string1);
        }
        // rød
        else if (time.equals("nat") && (traffic.equals("høj")) || (areaType.equals("bolig")) && (traffic.equals("høj"))) {
            //System.out.println("Trafiklyset er rødt");
            string1 = "Trafiklyset er rødt";
            System.out.println(string1);
        }
        // adgang tilladt
        if (areaType.equals("blandet") && traffic.equals(("lav")) || areaType.equals("erhverv") && traffic.equals("lav")) {
            //System.out.println("Adgang tilladt");
            string2 = "Adgang tilladt";
            System.out.println(string2);
        }
        // adgang forbudt
        if (time.equals("nat") && (areaType.equals("bolig")) && !emergency)
        {
            //System.out.println("Adgang forbudt");
            string2 = "Adgang forbudt";
            System.out.println(string2);
        }
        else  {
            string2 = "Adgang tilladt";
            System.out.println(string2);

        }



    }
}