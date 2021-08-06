
package tasks.Task1;

import java.util.Scanner;

public class Task1 {
    static public void main(String[] args)
    {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        char[] character = line.toCharArray();
        for (int i = 0; i<character.length; i++)
        {
            if (Character.isDigit(character[i]))
            {
                sum += Character.digit(character[i],10);
            }
        }
        System.out.println(sum);
    }
}
