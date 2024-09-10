import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Hvilken tid på dagen? (dag, aften, nat)");
        String time = input.nextLine();
        System.out.println("Høt eller lav trafikmængde? (høj eller lav)");
        String traffic = input.nextLine();
        System.out.println("Hvilket område er det? (bolig, erhverv, blandet");
        String areaType = input.nextLine();
        System.out.println("Nødstilfælde (true eller false)");
        boolean emergency = input.nextBoolean();




    }
}