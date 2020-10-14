import java.util.Scanner;

/**


 *
 * @author Cesar Gil
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an integer");
    int num = input.nextInt();
    System.out.println("Please enter another integer");
    int num2 = input.nextInt();
    // Which numbers go in ascending order
    if (num > num2){
      System.out.println("Your numbers in ascending order are " + num2 + "," + num);
    } else if ( num < num2) {
      System.out.println("Your numbers in ascending order are " + num + "," + num2);
    } if (num == num2) {
      System.out.println("Your numbers in ascending order are " + num + "," + num2);

    }
  }
}
