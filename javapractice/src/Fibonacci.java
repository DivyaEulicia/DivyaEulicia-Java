//7= 0 1 1 2 3 5 8 13 21

public class Fibonacci{
  public static void main(String[] args){
      int num=7, num1=0, num2=1, num3, i;
      System.out.println(num1);
      System.out.println(num2);
      for(i=1;i<=num;i++){
           num3=num1+num2;
           num1=num2;
           num2=num3;
           System.out.println(num3);
      }

}
}