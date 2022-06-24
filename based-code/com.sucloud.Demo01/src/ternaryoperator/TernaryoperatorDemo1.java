package ternaryoperator;

import java.util.Scanner;

public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
        //格式:关系表达式?表达式1:表达式2;
        //第一个是表达式,如果表达式的结果是真就直接执行第一个表达式,如果结果是假,就执行第二个///范例:求两个数的最大值
       /* int a = 6;
        int b = 5;
        int  res = a > b?a:b;
        System.out.println(res);
        练习两只老虎
        需求:动物园里有两只老虎，体重分别为通过键盘录入获得，请用程序实现判断两只老虎的体重是否相同。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        int a = sc.nextInt();
        System.out.println("请输入第二只老虎的体重");
        int b = sc.nextInt();
        String res = a == b?"相同":"不同";
        System.out.println(res);



    }
}
