import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int month = 0;
        String trash = "";

        System.out.println("What is your birth month [Enter a number 1-12]");
        if(in.hasNextInt()){
            month = in.nextInt();
            if(month > 0 && month < 13){
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("\nYou said your birth month was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
        }
    }
}