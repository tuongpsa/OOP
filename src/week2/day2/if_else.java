package week2.day2;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao thu nhap ");
        int a = in.nextInt();
        if (a < 10) System.out.println("khong can dong thue");
        else if (a >= 10 && a <= 15) {
            System.out.println("so tien can dong la " + a * 15 / 100);
        } else if (a > 15 && a <= 30) {
            System.out.println(" so tien can dong la " + a * 20 / 100);
        } else System.out.println("so tien can dong la " + a * 50 / 100);
        in.close();
    }

}
