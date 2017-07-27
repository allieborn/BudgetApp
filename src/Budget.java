import java.util.ArrayList;
import java.util.Scanner;

public class Budget {

    public void printBudgetTable(ArrayList budgetCategories, double[] categoryAmount) {
        for (int i = 0; i < budgetCategories.size(); i++) {
            System.out.print((i + 1) + ". ");
            System.out.print(budgetCategories.get(i) + "  ");
            System.out.println(categoryAmount[i]);
        }
    }

    public void establishBudget(String namethis, double catAmount, ArrayList budgetCategories, double[] categoryAmount){
        System.out.println("Enter the names of your budget categories here; press 'x' when finished.");
        Scanner scan = new Scanner(System.in);

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

        //double[] categoryAmount = new double[10];

        for (int i = 0; i < budgetCategories.size(); i++) {
            System.out.println();
            System.out.println(budgetCategories.get(i));
            System.out.println("Enter amount for this category: ");
            catAmount = scan.nextDouble();
            categoryAmount[i] = catAmount;
        }
    }

    public void enterTransations(int toEdit, int deductAmount, double[] categoryAmount){
        if (toEdit == 1) {
            categoryAmount[toEdit - 1] = categoryAmount[toEdit - 1] - deductAmount;
        } else if (toEdit == 2) {
            categoryAmount[toEdit - 1] = categoryAmount[toEdit - 1] - deductAmount;
        } else if (toEdit == 3) {
            categoryAmount[toEdit - 1] = categoryAmount[toEdit - 1] - deductAmount;
        }
    }



}
