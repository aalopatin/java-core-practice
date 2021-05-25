package horstmann.my.chapter03.part0310arrays;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter interest rates separated by a space and press <Enter>:");
        String ratesStr = scan.nextLine();
        String[] rates = ratesStr.split(" ");

        System.out.println("Enter initial sum and press <Enter>:");
        double initialSum = scan.nextDouble();

        String[][] balances = new String[11][rates.length];

        int maxLength = 0;

        for (int i = 0; i < rates.length; i++) {

            balances[0][i] = rates[i] + "%";

            double rate  = Double.parseDouble(rates[i]);

            for (int j = 1; j < 11; j++) {

                balances[j][i] = String.format("%.2f",initialSum * Math.pow(1+rate/100,j));
                maxLength = maxLength > balances[j][i].length() ? maxLength : balances[j][i].length();

            }
        }

        System.out.println("Initial sum: " + initialSum);

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < rates.length; j++) {
                for (int k = 0; k < maxLength - balances[i][j].length(); k++) {
                    System.out.print(" ");
                }
                System.out.print(balances[i][j] + " ");
            }
            System.out.println();
        }

    }
}
