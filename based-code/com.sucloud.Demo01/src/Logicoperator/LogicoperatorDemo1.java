package Logicoperator;

import java.util.Scanner;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        //1.&并且
        //两边都为真，结果才是真
        //2.|或与
        //两边都为假，结果才是假
//短路运算符:&& 同且同为真才是真,
// ||同为假才是假.同或
        /*int a = 10;
        int b = 10;
        boolean result = a++>5 && b++<6;
        System.out.println(result);*/
        /*自练习数字6
需求:
数字6是一个真正伟大的数字，键盘录入两个整数。如果其中一个为6，最终结果输出true。
如果它们的和为6的倍数。最终结果输出true。其他情况都是false。
*/
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean result = a == 6 || b ==6 || (a + b) % 6 == 0;
        System.out.println(result);
    }
}
