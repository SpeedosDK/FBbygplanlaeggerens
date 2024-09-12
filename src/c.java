import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hvilken tid på dagen? (dag, aften, nat)");
        String time = input.nextLine();
        System.out.println("Høj eller lav trafikmængde? (høj, lav)");
        String traffic = input.nextLine();
        System.out.println("Hvilket område er det? (bolig, erhverv, blandet)");
        String areaType = input.nextLine();
        System.out.println("Nødstilfælde (true eller false)");
        boolean emergency = input.nextBoolean();

        // grøn
        if (time.equals("dag") && (traffic.equals("lav")) || emergency) {
            System.out.println("Trafiklyset er grønt");
        }
        // gul
        else if (time.equals("aften") && (traffic.equals("lav")) || time.equals("nat") && (traffic.equals("lav"))) {
            System.out.println("Trafiklyset er gult");
        }
        // rød
        else if (time.equals("nat") && (traffic.equals("høj"))  || (areaType.equals("bolig") && traffic.equals("høj"))) {
            System.out.println("Trafiklyset er rødt");
        }
        // adgang tilladt
        if (areaType.equals("blandet") && traffic.equals(("lav")) || areaType.equals("erhverv") && traffic.equals("lav"))
        {
            System.out.println("Adgang tilladt");
        }
        // adgang forbudt medmindre emergency
        if (emergency) {
            System.out.println("Adgang tilladt");
        }
        else
        {
            if (time.equals("nat") && (areaType.equals("bolig")))
            {
            System.out.println("Adgang forbudt");
            }

            }
        }
    }
