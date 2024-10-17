import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the amount of units used: ");
        int totalUnits = sc.nextInt();

        double unitCost;

        if (totalUnits >= 100) {
            unitCost = 26.7;
        } else {
            unitCost = 15.6;
        }

        double totalCost = totalUnits * unitCost;
        System.out.println(totalCost + "p");
    }
}