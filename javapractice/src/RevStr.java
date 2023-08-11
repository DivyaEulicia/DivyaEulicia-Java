public class RevStr{
  public static void main(String[] args){
     String str= "India is my country";
     char[] ch= str.toCharArray();
     int left=0;
     int right=ch.length-1;
     char temp;
     while(left<right){
        temp=ch[left];
        ch[left]=ch[right];
        ch[right]=temp;
        left++;
        right--; 
     }
     String rev= new String(ch);
     System.out.println(rev);

}
}


