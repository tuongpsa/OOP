package week2.day2;
import java.util.Arrays;
import java.util.Scanner;
public class mang {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size;
        size = in.nextInt();
        int [] a =new int[size];
        for(int i=0;i<size;i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println(a[0]);
        System.out.println(a[size-1]);
    }
}
