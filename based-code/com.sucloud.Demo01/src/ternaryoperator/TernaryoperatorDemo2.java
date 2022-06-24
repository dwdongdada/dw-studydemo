package ternaryoperator;

import java.util.Scanner;

public class TernaryoperatorDemo2 {
    public static void main(String[] args) {

        /*需求。一座寺庙里住着三个和尚，已知他们的身高分别为150cm、21ecm、165cm,请用程序实现获取这三个和尚的最高身高.*/

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a > b ? a : b;
        int e = c > d ? c : d;
        System.out.println(e);


    }
}
