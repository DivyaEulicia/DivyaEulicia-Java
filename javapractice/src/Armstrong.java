//153=1^3+5^3+3^3=1+125+27=153

public class Armstrong{
  public static void main(String[] args){
    int num=153;
    int temp=num;
    int rem,cube;
    int arm=0;
    while(num>0){
        rem=num%10;
        cube=rem*rem*rem;
        arm=arm+cube;
        num=num/10;
    }
    if(arm==temp){
       System.out.println("Armstrong num");
    }
    else{
       System.out.println("Not Armstrong num");
    }
}
}