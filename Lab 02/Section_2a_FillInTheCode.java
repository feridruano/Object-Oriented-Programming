/**
 * @author Ferid Ruano
 * @version 9/4/2018
 */
public class Section_2a_FillInTheCode
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;
        double c;

        // Convert the following sentences to legal Java instructions
        // For each one print the values of variables and the result of the operation

        // #1 b gets a plus 3 minus 7
        System.out.println("The value of 'a' is: " + a);
        System.out.println("The value of 'b' is: " + b);
        b = a + 3 - 7;
        System.out.println("The result of 'b gets a plus 3 minus 7' is: " + b);

        // #2 b gets a times 4
        System.out.println("The value assigned to variable 'a' is: " + a);
        System.out.println("The value assigned to variable 'b' is: " + b);
        b = a * 4;
        System.out.println("The result of 'b gets a times 4' is: " + b);

        // #3 a is incremented by 1 using a shortcut operator
        System.out.println("The value assigned to variable 'a' is: " + a);
        a++;
        System.out.println("The result of 'a' incremented by 1 is: " + a);

        // #4 a gets b times the sum of a plus 5
        System.out.println("The value assigned to variable 'a' is: " + a);
        System.out.println("The value assigned to variable 'b' is: " + b);
        a = b * (a + 5);
        System.out.println("The result of 'a gets b times the sum of a plus 5' is: " + a);

        // #5 b gets the quotient of the division of a by 2
        System.out.println("The value assigned to variable 'a' is: " + a);
        System.out.println("The value assigned to variable 'b' is: " + b);
        b = a / 2;
        System.out.println("The result of 'b gets the quotient of the division of a by 2' is: " + b);

        // #6 b gets the remainder of the division of a by 3
        System.out.println("The value assigned to variable 'a' is: " + a);
        System.out.println("The value assigned to variable 'b' is: " + b);
        b = a % 3;
        System.out.println("The result of 'b gets the remainder of the division of a by 3' is: " + b);

        // #7 c gets the average of a and b
        System.out.println("The value assigned to variable 'a' is: " + a);
        System.out.println("The value assigned to variable 'b' is: " + b);
        c = (double)(a + b) / 2;
        System.out.println("The result of 'c gets the average of a and b' is: " + c);

        // #8 c is decremented by 1 using a shortcut operator
        System.out.println("The value assigned to variable 'c' is: " + c);
        c--;
        System.out.println("The result of 'c is decremented by 1 using a shortcut operator' is: " + c);

        // #9 b is incremented by 5 using a shortcut operator
        System.out.println("The value assigned to variable 'b' is: " + b);
        b += 5;
        System.out.println("The result of 'b is incremented by 5 using a shortcut operator' is: " + b);

    }
}
