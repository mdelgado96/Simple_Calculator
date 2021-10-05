package calculator;

import java.util.Scanner;

/**
 *
 * @author marvindelgado
 */
public class Calculator 
{
    public static void main(String[] args) 
    {
        char userLoop = 'Y';
        do{
        double num1, num2, tot;
        char op;
        
        Scanner userIn = new Scanner(System.in);
        Scanner userOp = new Scanner(System.in);
        System.out.print("Hi, I am really good at math! ");
        System.out.println("Put me to the test.");
        System.out.print("Please enter two numbers " +
                         "and then press enter: ");
            num1 = userIn.nextDouble();                        //Get both numbers
            num2 = userIn.nextDouble();
        System.out.print("Please enter one of the operations "+
                         "+, -, / or * and press enter: ");
            op = userOp.next().charAt(0);                      //Get operation
           
        if (op == '+')                                         //Work with addition
        {
            tot = num1 + num2;
            System.out.print(num1 + " + " + num2 + " = ");
            System.out.printf("%.2f", tot);
            System.out.println("\nI'm great at addition!");
        }
        else if(op == '-')                                     //Work with subtraction
        {
            tot = num1 - num2;
            System.out.print(num1 + " - " + num2 + " = ");
            System.out.printf("%.2f", tot);
            System.out.println("\nI'm great at subtraction!");
        }
        else if(op == '*')                                     //Work with multiplication
        {
            tot = num1 * num2;
            System.out.print(num1 + " * " + num2 + " = ");
            System.out.printf("%.2f", tot);
            System.out.println("\nI'm great at multiplication!");
        }
        else if(op == '/')                                    //Work with division
        {
            tot = num1 / num2;
            System.out.print(num1 + " / " + num2 + " = ");
            System.out.printf("%.2f", tot);
            System.out.println("\nI'm great at division!");
        }
        else                                                  //Error if anything other than
        {                                                     //the four operations was entered.
            System.out.print("I can compute really well, ");
            System.out.println("but what you entered is not one of the operations I know...");
        }
        System.out.print("Play again [Y/N]? ");               //If yes then it loops again or if no
            userLoop = userIn.next().charAt(0);               //it ends the program with bye bye!
        if(userLoop == 'N' || userLoop == 'n')
        {
            System.out.println("Bye bye!");
        }
      }while(userLoop == 'Y' || userLoop == 'y');
    }
    
}
