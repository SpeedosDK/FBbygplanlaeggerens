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

        //
        // Grøn
        //
        if (time.equals("dag") && (traffic.equals("lav")) || emergency) {
            string1 = "Trafiklyset er grønt";
            System.out.println(string1);
        }
        //
        // Gul
        //
        else if (time.equals("aften") || time.equals("nat") && (traffic.equals("lav"))) {
            string1 = "Trafiklyset er gult";
            System.out.println(string1);
        }
        //
        // Rød
        //
        /*
        else if (time.equals("nat") && (traffic.equals("høj")) || (areaType.equals("bolig") || areaType.equals("blandet")) || areaType.equals("erhverv") && (traffic.equals("høj"))) {
            //System.out.println("Trafiklyset er rødt");
            string1 = "Trafiklyset er rødt";
            System.out.println(string1);
        }
         */

        // Vi indser at der er rødt lys med høj trafik lige meget situationen

        else if (traffic.equals("høj"))
        {
            string1 = "Trafiklyset er rødt";
            System.out.println(string1);
        }
        //
        // Adgang forbudt
        //
        if (time.equals("nat") && (areaType.equals("bolig")) && !emergency)
        {
            string2 = "Adgang forbudt";
            System.out.println(string2);
        }
        //
        // Adgang tilladt
        //
        else {
            string2 = "Adgang tilladt";
            System.out.println(string2);
        }

    }
}