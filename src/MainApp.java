import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {


    public static void main(String[] args) {

        Budget budget = new Budget();

        Scanner scan = new Scanner(System.in);

        int monthlyBudget;

        System.out.println("Enter your starting monthly budget: ");
        monthlyBudget = scan.nextInt();
        scan.nextLine();

        System.out.println();

        ArrayList<String> budgetCategories = new ArrayList<String>();     //ESTABLISH BUDGET CATEGORY NAMES + AMOUNTS
        String nameThis = "x";
        double[] categoryAmount = new double[10];
        double catAmount = 0;
        budget.establishBudget(nameThis, catAmount, budgetCategories, categoryAmount);  //ESTABLISH BUDGET CATEGORY NAMES + AMOUNTS

        System.out.println();

        System.out.println("Here's your monthly budget:");

        System.out.println();

        budget.printBudgetTable(budgetCategories, categoryAmount);   //PRINT MONTHLY BUDGET TABLE

        System.out.println();

        System.out.println("Enter a category number to save a transaction: ");      //ENTER EXPENSES PER CATEGORY
        int toEdit = scan.nextInt();
        System.out.println("Enter amount spent in this category: ");
        int deductAmount = scan.nextInt();

        budget.enterTransations(toEdit, deductAmount, categoryAmount);             //ENTER EXPENSES PER CATEGORY

        System.out.println();

        System.out.println("Here is your updated monthly budget:");

        System.out.println();

        budget.printBudgetTable(budgetCategories, categoryAmount);          //PRINT MONTHLY BUDGET TABLE



    }


}
