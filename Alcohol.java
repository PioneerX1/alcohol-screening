import java.io.Console;

//initial message - must be 21
//read in user age
//compare age with conditional statement
//output result

public class Alcohol {
  public static void main(String[] args) {
    System.out.print("You must be 21 to drink. Please enter your age: ");
    Integer age = inputAge();
    compareAge(age);
  }
  public static Integer inputAge() {
    Console myConsole = System.console();
    return Integer.parseInt(myConsole.readLine());
  }
  public static void compareAge(int age) {
    if (age >= 21) {
      System.out.println("You are " + age + " so you can drink!");
    } else {
      System.out.println("You are only " + age + " and therefore cannot drink. Sorry!");
     }
  }

}
