package week2;
import  java.util.Scanner;
public class bt2
{
    public static void main(String[] args){
        Scanner in = new  Scanner(System.in);
        System.out.print("nhap hai canh cua hinh chu nhat ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("dien tich hinh chu nhat la "+ a*b);
        System.out.println("chu vi hinh chua nhat la " + (a+b)*2);
        System.out.println("chieu rong hinh chu nhat la " + Math.min(a,b));

    }
}
