import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int monthlyBudget;

        System.out.println("Enter your starting monthly budget: ");
        monthlyBudget = scan.nextInt();
        scan.nextLine();

        System.out.println();

        ArrayList<String> budgetCategories = new ArrayList<String>();          //ESTABLISH BUDGET CATEGORY NAMES + AMOUNTS
        System.out.println("Enter the names of your budget categories here; press 'x' when finished.");

        String nameThis = "x";
        do {
            System.out.println();
            System.out.println("Enter a name for this category:");
            nameThis = scan.nextLine();
            budgetCategories.add(nameThis);
            if (nameThis.equalsIgnoreCase("x")){
                budgetCategories.remove(nameThis);
            }
        } while (!nameThis.equalsIgnoreCase("x"));

        double[] categoryAmount = new double[10];

        for (int i = 0; i < budgetCategories.size(); i++) {
            System.out.println();
            System.out.println(budgetCategories.get(i));
            System.out.println("Enter amount for this category: ");
            double catAmount = scan.nextDouble();
            categoryAmount[i] = catAmount;
        }                                                               //ESTABLISH BUDGET CATEGORY NAMES + AMOUNTS

        System.out.println();

        System.out.println("Here's your monthly budget:");              //PRINT MONTHLY BUDGET TABLE

        System.out.println();

        for (int i = 0; i < budgetCategories.size(); i++) {
            System.out.print((i + 1) + ". ");
            System.out.print(budgetCategories.get(i) + "  ");
            System.out.println(categoryAmount[i]);

        }                                                               //PRINT MONTHLY BUDGET TABLE

        System.out.println();
        scan.nextLine();

        System.out.println("Enter a category number to save a transaction: ");      //ENTER EXPENSES PER CATEGORY
        int toEdit = scan.nextInt();
        System.out.println("Enter amount spent in this category: ");
        int deductAmount = scan.nextInt();

        if (toEdit == 1) {
            categoryAmount[toEdit - 1] = categoryAmount[toEdit - 1] - deductAmount;
        } else if (toEdit == 2) {
            categoryAmount[toEdit - 1] = categoryAmount[toEdit - 1] - deductAmount;
        } else if (toEdit == 3) {
            categoryAmount[toEdit - 1] = categoryAmount[toEdit - 1] - deductAmount;
        }                                                                           //ENTER EXPENSES PER CATEGORY

        System.out.println();

        System.out.println("Here is your updated monthly budget:");

        System.out.println();

        for (int i = 0; i < budgetCategories.size(); i++) {
            System.out.print((i + 1) + ". ");
            System.out.print(budgetCategories.get(i) + "  ");
            System.out.println(categoryAmount[i]);

        }


    }


}
