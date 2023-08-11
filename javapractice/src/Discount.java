// A cloth show room has announced the following festival
// discounts on the purchase of items based on the total cost of the items purchased :
// Total Cost.                             Discount
//Upto to 2000 rupees                   5%
//2001 to 5000 rupees.                 25%
//5000 to 10000 rupees                35%
//Above 10000 rupees                   50%
//Write a program in Java to input the total cost and to
// compute and display the amount to be paid by the customer after availing the discount.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Discount
{
    public static void main(String[] args) throws IOException {
        System.out.println("enter the number  ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double totalcost, discount, amountobepaid;
        totalcost = Double.parseDouble(br.readLine());

        if(totalcost <= 2000) {
            discount = 0.05;
        } else if(totalcost <= 5000) {
            discount = 0.25;
        } else if(totalcost <= 10000) {
            discount = 0.35;
        } else {
            discount = 0.50;
        }

        amountobepaid = totalcost - (totalcost * discount);

        System.out.println("Amount to be paid after discount: " + amountobepaid);
    }

}
