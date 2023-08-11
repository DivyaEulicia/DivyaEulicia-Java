import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNum
{
    public static void primenumber(int num) {
        int count=0;
        for (int i = 2; i <= num-1; i++) {
            if (num % i == 0)
                count++;

        }
        if (count == 0) {
            System.out.println("is prime number");
        } else {
            System.out.println("is not prime number");
        }
    }
    public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        primenumber(num);
    }

}