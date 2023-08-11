import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switchcase {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter tha value of a");
            int a = Integer.parseInt(br.readLine());
            System.out.println("Enter the value of b");
            int b = Integer.parseInt(br.readLine());
            char operator;
            System.out.println("Enter the operator");
            operator = br.readLine().charAt(0);
            switch (operator) {
                case '+':
                    System.out.println("a+b is "+(a + b));
                    break;
                case '-':
                    System.out.println("a-b is "+(a - b));
                    break;
                case '*':
                    System.out.println("a*b is "+(a * b));
                    break;
                case '/':
                    System.out.println("a/b is "+(a / b));
                    break;
                default:
                    System.out.println("Enter valid operator");
            }
        }
}
