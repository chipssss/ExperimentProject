package e1;

/**
 * @author: chips
 * @date: 2019-05-02
 * @description:
 **/
public class GcdTest {

    public static int getGcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int result = a % b;
        if (result != 0) {
            return getGcd(b, result);
        }
        return b;
    }

    public static int getGcd(int a, int b, int c) {
        return getGcd(a, getGcd(b,c));
    }

    public static int getLcm(int a, int b) {
        return a*b/getGcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println("两个数的最大公约数：");
        System.out.println("4,3 : " + getGcd(4,3));
        System.out.println("6,3 : " + getGcd(6,3));
        System.out.println("26460,12375 : " + getGcd(26460,12375));

        System.out.println();

        System.out.println("两个数的最小公倍数：");
        System.out.println("4,3 : " + getLcm(4,3));
        System.out.println("22,20 : " + getLcm(22, 20));

        System.out.println();

        System.out.println("三个数的最大公约数：");
        System.out.println("20,20,10 : " + getGcd(20, 20, 10));
        System.out.println("444, 555, 999 : " + getGcd(444, 555, 999));
    }
}
