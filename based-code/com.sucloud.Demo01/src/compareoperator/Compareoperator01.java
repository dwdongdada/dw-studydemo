package compareoperator;

import java.util.Scanner;

public class Compareoperator01 {
    //需求:
    //需求：
    //您和您的约会对象在餐厅里面正在约会。
    //您和您的约会对象在餐厅里面正在约会.
    //键盘录入两个整数，表示你和你约会对象衣服的时髦度。(手动录入0~10之间的整数，不能录其他)如果你的时髦程度大于你对象的时髦程度，相亲就成功，输出true。
    //键盘录入两个整数，表示你和你约会对象衣服的时髦度.(手动录入0~10之间的整数，不能录其他)如果你的时髦程度大于你对象的时髦程度，相亲就成功，输出true.)
    //否则输出false。
    //否则输出假。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你对象的时髦度");
        int a = sc.nextInt();
        System.out.println("请输入你的时髦度");
        int b = sc.nextInt();
        boolean result = a>b;
       System.out.println(result);

    }
}
