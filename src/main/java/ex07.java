import java.util.Scanner;

public class ex07 {
    public static void main (String[] args){

        Scanner input1 = new Scanner(System.in),
                input2 = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        String l = input1.next();
        System.out.print("What is the width of the room in feet? ");
        String w = input2.next();
        System.out.println("You entered dimensions of " + l + " feet by " + w + " feet.");

        int length = Integer.parseInt(l);
        int width = Integer.parseInt(w);
        double area_feet = length * width;
        final double AREA_METERS = area_feet * 0.09290304;

        System.out.printf("The area is\n%.0f square feet\n%.3f square meters",
                          area_feet, AREA_METERS);
    }
}