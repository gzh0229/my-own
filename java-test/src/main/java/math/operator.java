package math;

import org.junit.Test;

public class operator {

    @Test
    public void test01() {
        System.out.println(7 / 3);
        System.out.println(~2);  //	TODO 位运算符？？？
    }

    @Test
    public void test02() {
        int a = 1;
        int b = 1;
        // 后置自增运算符，先输出再自增
        System.out.println(a++);
        System.out.println(a);
        // 前置自增运算符，先自增再输出
        System.out.println(++b);
        System.out.println(b);
    }

    @Test
    public void test0201() {
        int a = 3;
        int b = 3;
        int c = 3;
        a += 1;// 相当于a=a+1
        b = +1;// “=+”没有意义，此处的“+”只是正号
        c = -1;// 没有“=-”这种运算方式，此处的“-”只是负号
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    @Test
    public void test03() {
        char a = '天';
        int b = 1;
        int c = a - b;
        System.out.println((int)a);
        System.out.println(c);
    }

    @Test
    public void test04() {
        int a = 129;
        byte b = (byte) a;
        // 数值越界溢出
        System.out.println(b);
    }

    @Test
    public void test05() {
        int a = 3;
        // 三元运算符
        int b = a < 2 ? 11 : 22;
        System.out.println(b);
    }

    @Test
    public void test06() {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(a < b && b < c); //true
    }

    @Test
    public void test07() {
        int a = 16;
        // 关系运算符
        System.out.println("a是奇数？" + (a % 2 == 1)); //false
    }

    @Test
    public void test08() {
        boolean a = 1 > 2 ? true : false;
        System.out.println(a);  //false
    }

}
