import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Write a program in Java to find the sum of the series.
//S=1+a+a^2+a^3..........+a^10 , where a=2
public class Series {
    {
        int a =2;
        int num = 10;
        int sum = 0;
        for (int i=0;i<=num;i++)
        {
            sum+=Math.pow(a,i);
        }
        System.out.println(sum);
    }
    public static int ins(int a)
    {
        return a;
    }

    public static void main(String[] args) {
        System.out.println();

    }

}

