import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int monthlyBudget;

        System.out.println("Enter your starting monthly budget: ");
        monthlyBudget = scan.nextInt();
        scan.nextLine();

        ArrayList<String> budgetCategories = new ArrayList<String>();
        budgetCategories.add("Housing");
        budgetCategories.add("Transportation");
        budgetCategories.add("Grocery");
        double [] categoryAmount = new double[10];

        for (int i = 0; i <budgetCategories.size(); i++){
            System.out.println(budgetCategories.get(i));
            System.out.println("Enter amount for this category: ");
            double catAmount = scan.nextDouble();
            categoryAmount[i] = catAmount;
        }

        System.out.println(); //PRINT MONTHLY BUDGET TABLE

        System.out.println("Here's your monthly budget:");

        System.out.println();

        for (int i=0; i < budgetCategories.size(); i++){
            System.out.print(budgetCategories.get(i) + "  ");
            System.out.println(categoryAmount[i]);

        }  //PRINT MONTHLY BUDGET TABLE







    }


}
