
public class Array {
    public static void main(String[] args) {
        int [] arr = {31,46,9,23,-1};
        int min = arr[0];
        for (int i=0;i<arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
