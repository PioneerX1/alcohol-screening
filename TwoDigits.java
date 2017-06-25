import java.io.Console;

public class TwoDigits {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.print("Give me a number and I will tell you if it has two digits. Go on, give it to me! ");

    int userNumber = Integer.parseInt(myConsole.readLine());

    Boolean isTwoDigits = checkNumber(userNumber);

    if (isTwoDigits == true) {
      System.out.println("Congrats, your beloved number " + userNumber + " is two digits and will be spared during the great number purge.");
    } else {
      System.out.println("I'm sorry, but your feeble number " + userNumber + " does not meet the criteria of our two digit society. Now up against the wall!");
    }
  }
  public static Boolean checkNumber(int number) {
    if (number > 9 && number < 100) {
      return true;
    } else if (number < -9 && number > -100) {
      return true;
    } else { return false; }
  }
}
