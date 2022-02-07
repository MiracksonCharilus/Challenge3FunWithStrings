/**
 * @author 5716504
 * (Mirackson Charilus)
 *
 * Title: Challenge #3 Fun with Strings
 * Semester: COP3804 - Spring 2021
 * Professor's Name: Prof. Charters
 * Description of Program’s Functionality: This program manupliate strings.
 */

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class FunWithStrings {
    //creating a global variable
    public static String userWord;

    /**
     * (This main method calls the other methods)
     *
     * @param
     * @param
     * @return
     * Preconditions:
     * Postconditions:
     */
    public static void main(String[] args){
        userString();
        funWithAString();

    }
    /**
     * (This method has the user enter a word)
     *
     * @param
     * @param
     * @return
     * Preconditions:
     * Postconditions:
     */
    public static void userString()
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a word");
        userWord = keyboard.nextLine();

    }
    /**
     * (This method manuiplate the string and prints them out)
     *
     * @param
     * @param
     * @return
     * Preconditions:
     * Postconditions:
     */
    public static void funWithAString()
    {
        Random myRand = new Random();
        //change global variable to a local variable
        String parameter = userWord;

        //step 1
        int wordLength = parameter.length();
        System.out.println("The length of the String " + parameter + " is " + wordLength);

        //step 2
        int lastLoc = parameter.lastIndexOf("i");
        System.out.println("The last 'i' is " + parameter + " is located in position " + lastLoc);

        //step 3
        int firstLoc = parameter.indexOf("e");
        System.out.println("The first 'e' in " + parameter + " is located at position " + firstLoc);

        //step 4
        int charMidNum = wordLength / 2;
        char charMid = parameter.charAt(charMidNum);
        System.out.println("The character in the middle of " + parameter + " is " + charMid);

        //step 5
        int midOfString = wordLength / 2;
        String firstHalf = parameter.substring(0, midOfString);
        System.out.println("The first half of " + parameter + " is " + firstHalf);

        //step 6
        String secondHalf = parameter.substring(midOfString);
        System.out.println("The second half of " + parameter + " is " + secondHalf);

        //step 7
        System.out.println("Switched halves: " + secondHalf + firstHalf);

        //step 8
        String upperParam = parameter.toUpperCase();
        System.out.println("The " + parameter + " in upper case is " + upperParam);

        //step 9
        double wordSqrt = Math.sqrt(wordLength);
        double randomNumber1 = myRand.nextDouble(wordSqrt);
        System.out.println("The square of the length of " + parameter + " is " + wordSqrt
        + " and a random number between 1 and " + wordSqrt + " is " + randomNumber1);

        //step 10
        int randomNumber2 = myRand.nextInt(100) +1;
        System.out.println("Congratulations, you just won $" + randomNumber2 + "! You can go out and treat yourself to a nice dinner!");

    }
}
