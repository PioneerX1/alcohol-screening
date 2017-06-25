import java.io.Console;

//initial message - must be 21
//read in user age
//compare age with conditional statement
//output result

public class Alcohol {
  public static void main(String[] args) {
    System.out.print("You must be 21 to drink. Please enter your age: ");
    Integer age = inputAge();
    Boolean oldEnough = compareAge(age);
    if (oldEnough == true) {
      System.out.println("Since you are " + age + " years old, you are old enough to drink - hooray!");
    } else {
      System.out.println("Sorry, you are only " + age + " years old, and not enough to drink.");
    }
  }
  public static Integer inputAge() {
    Console myConsole = System.console();
    return Integer.parseInt(myConsole.readLine());
  }
  public static Boolean compareAge(int age) {
    if (age >= 21) {
      return true;
    } else {
      return false;
     }
  }

}
