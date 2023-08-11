import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Mr. lal enters a number (containing maximum 3 digits) in his computer.
// Write a program to decide whether a number entered by
// him is a single digit number, twodigit number or a three digits number.
public class Digits{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number  ");
        int num = Integer.parseInt(br.readLine());

        if(num<=10){
            System.out.println("Number is single digit ");
        } else if (num<=99) {
            System.out.println("number is two digits");
        }
        else if(num<=999){
            System.out.println("number is three digits");
        }else {
            System.out.println("number is four and more digits ");
        }


    }
}