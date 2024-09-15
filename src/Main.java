import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Hvilken tid på dagen? (Skriv: 'dag', 'aften' eller 'nat')");
        String time = input.nextLine().toLowerCase();
        System.out.println("Høj eller lav trafikmængde? (Skriv: 'høj' eller 'lav')");
        String traffic = input.nextLine().toLowerCase();
        System.out.println("Hvilket område er det? (Skriv: 'bolig', 'erhverv' eller 'blandet')");
        String areaType = input.nextLine().toLowerCase();
        System.out.println("Nødstilfælde (Skriv 'true' eller 'false')");
        boolean emergency = input.nextBoolean();


        //
        // Vi tjekker om det er dag og der er lav trafik, og hvis det sandt er lyset grønt
        //
        if (time.equals("dag") && (traffic.equals("lav")) || emergency) {

            System.out.println("Trafiklyset er grønt");
        }
        //
        // Vi tjekker om det er aften eller at det er nat og der er lav trafik på samme tid, og hvis
        // det er sandt, er lyset gult
        //
        else if (time.equals("aften") || time.equals("nat") && (traffic.equals("lav"))) {
            System.out.println("Trafiklyset er gult");
        }
        // Rød
        /*
        else if (time.equals("nat") && (traffic.equals("høj")) || (areaType.equals("bolig") || areaType.equals("blandet")) || areaType.equals("erhverv") && (traffic.equals("høj"))) {
            //System.out.println("Trafiklyset er rødt");
            string1 = "Trafiklyset er rødt";
            System.out.println(string1);
        }
         */

        // Vi indser at der er rødt lys med høj trafik lige meget situationen
        // så vi tjekker om trafikken er høj.

        else if (traffic.equals("høj"))
        {
            System.out.println("Trafiklyset er rødt");
        }
        //
        // Adgang forbudt bliver tjekket ved at hvis tilstanden er nat og området er bolig
        // og det ikke er en emergency
        //
        if (time.equals("nat") && (areaType.equals("bolig")) && !emergency)
        {
            System.out.println("Adgang forbudt");
        }
        //
        // finder vi ud af om der er adgang tilladt, da den tjekker om der er forbudt først,
        // ved vi der er adgang tilladt hvis der ikke er forbudt
        //
        else {
            System.out.println("Adgang tilladt");
        }

    }
}