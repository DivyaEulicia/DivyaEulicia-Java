public class Prime{
  public static void main(String[] args){
        int num = 100, i, mod;
     if (num==0 && num==1){
         System.out.println("Not a prime num");
     }
     else{
          for(i=2;i<=10;i++){
             mod=num%i; 
              if(mod==0){
                 System.out.println("Not a prime num");
                 break;
               }
              else{
                 System.out.println("Prime num");
                 break;
                }
          } 
      }
      

}
}