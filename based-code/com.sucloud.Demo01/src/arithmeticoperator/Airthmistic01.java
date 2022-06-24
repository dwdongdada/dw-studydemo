package arithmeticoperator;

import java.util.Scanner;

public class Airthmistic01 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("个位是"+a%10);
        System.out.println("个位是"+a/100%10);

    }
}
