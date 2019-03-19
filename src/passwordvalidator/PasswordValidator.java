
package passwordvalidator;

import java.util.Scanner;

/**
 * The code to be used as starter code for ICE 4.
 * Use the 3 requirements given in the ICE 4
 * description to complete the code and then
 * export it as a zip and submit to the DropBox
 * Do not commit anything to the repository!
 * @author dancye, 2019
 */
public class PasswordValidator {

   
    /**
     * In the main method, we create a Scanner 
     * and ask the user for a password as a String.
     * We then call our methods under test to 
     * complete each of the requirements.
     * @param args 
     */
    public static void main(String[] args) 
    {
        boolean isValid = false;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Please enter a password. To be valid, it must have:");
            System.out.println("A length of at least 8");
            System.out.println("At least one special character");
            System.out.println("At least one uppercase letter");
            String pass = sc.nextLine();
            if (checkLength(pass))//here you will add && conditions for the other two method calls
            {
               isValid=true;
            }
        }while(!isValid);
        System.out.println("Valid password, accepted!");
    }
    
    /**
     * A method to check whether a password is at least length 8
     * @param pass - the String to check
     * @return true if length is greater than or equsl to 8 and false otherwise
     */
    public static boolean checkLength(String pass)
    {
        if(pass.length()>=8)
        {
            return true;
        }
        return false;
    }
    
}

