import java.util.Scanner; //importing the required package
public class TakingInput03 {
    public static void main(String[] args) {
/*Taking User from input is simple task in Java but just a little lengthy
*  1. We need to import java.util.Scanner package. Scanner class is useful in taking the input of the user.
* 2. Then we need to create the object of the Scanner class and then
* 3. We can demand the input from the user using next functions,,...
* */
        Scanner sc = new Scanner(System.in);//creating an object as name sc and then mentioning it to take System.input...
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println();
        System.out.println("Value of a is: " + a);





    }

}
