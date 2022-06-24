package assigningoperator;

public class AssigningoperatorDemo01 {
    public static void main(String[] args) {
        //+=
        //将左边和右边进行相加,然后再把结果赋值给左边
        int a = 10;
        int b = 20;
        a += b;
        System.out.println(a);
        System.out.println(b);
        //+=,-=,*=之类的里面都有强制转换
    }

}
