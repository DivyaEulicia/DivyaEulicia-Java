
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Write a program in Java to accept a number and check
// whether the number is a perfect square or not.
public class PerfectSq {
    public static void main(String[] args) throws IOException
    {
        System.out.println("enter the number  ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int i;
        for(i=1;i<=num/2;i++)
        {
            if(num*num==0)
            {
                sum += i;
            }
        } if(sum == num)
    {
        System.out.println(num + " is a perfect square");
    }else
    {
        System.out.println(num + " is not a perfect square");
    }
    }
}
