package week2;
import java.util.Scanner;
public class bt3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("nhap do dai canh hinh lap phuong" );
        int n = in.nextInt();
        System.out.print(" the tich hinh lap phuong la " + (int)Math.pow(n,3));
    }
}
