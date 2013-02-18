
package fizzbuzz;

import java.util.Scanner;

public class Fizzbuzz {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 100; i++)
        {
            System.out.print(i + " ");
            if (i % 3 == 0)
                System.out.print("Fizz");
            if (i % 5 == 0)
                System.out.print("Buzz");
            System.out.println();
        }
        in.nextLine();
    }
}
