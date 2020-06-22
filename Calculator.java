import java.util.Scanner;

public class Calculator {
  public Calculator(){}

  //method for addition
  public int add(int a, int b){
    return a + b;
  }

  //method for subtraction
  public int subtract(int a, int b){
    return a - b;
  }

  //method for mutltiplcation
  public int multiply(int a, int b){
    return a * b;
  }

  //method for division
  public int divide(int a, int b){
    return a / b;
  }

  //method for modulo
  public int modulo(int a, int b){
    return a % b;
  }

  public String calculation(String type){
    String selection = type;
    switch(type){
      case "1":
        selection = "addition";
      case "2":
        selection = "subtraction";
      case "3":
        selection = "multiplication";
      case "4":
        selection = "division";
      case "5":
        selection = "modulus";
      default:
        break;
      }
    return selection;
  }

  public static void main(String[] args){
    Calculator myCalculator = new Calculator();

    Scanner userInput = new Scanner(System.in);

    System.out.println("Press 1 for addition");
    System.out.println("Press 2 for subtraction");
    System.out.println("Press 3 for multiplication");
    System.out.println("Press 4 for division");
    System.out.println("Press 5 for modulus");

    String calculationType = userInput.nextLine();
    System.out.println("You chose to " + myCalculator.calculation(calculationType));

    //test methods
    // System.out.println(myCalculator.add(5, 7));
    // System.out.println(myCalculator.subtract(45, 11));
    // System.out.println(myCalculator.multiply(3, 3));
  }

}
