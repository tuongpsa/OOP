package week2;
 import java.util.Scanner;
public class bt1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.printf("nhap ten sinh vien :");
        String name = in.nextLine();
        System.out.printf("nhap diem sinh vien :");
        int n = in.nextInt();
        System.out.println("sinh vien "+name + " co diem " + n);
    }
}
