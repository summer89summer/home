package test.HomeWork;

public class Homework {
    public static void main(String[] args) {

        // Task 1

        int w = 3;
        int u = 2;
        w=u;
        System.out.println("Task1= " +w*u);

        // Task 2

        int r = 6;
        System.out.println("Task2= " +(++r));

        // Task3

        int x9 = 5;
        int y9 = 10;
        int z9 = ++x9 * y9--;
        System.out.println("Task3= " +z9);

        // Task4

        System.out.println("Task4= " +1 + ("1+1"));

        // Task5

        System.out.println("Task5= " + "1+2=" +1 + 2);
        System.out.println("       " + "1+2=" +(1 + 2));

        // Task6

        int a = 21;
        int b = 8;
        System.out.println("task6= " +(a/ ++b)%3);

        //Task7

        int x = 5;
        System.out.println("Task7= " +(++x));
        System.out.println("       " +(++x));

        //Task8

        int t = 14;
        int q = 7;
        t %=q;
        System.out.println("Task8= " +t++);

        //Task9

        int x1 = 4;
        int y1 = 2;
        System.out.println("");
        System.out.println("Task9= " +(x1++ * y1--));

        //Task10 ????

        int a1 = 16;
        int b1 = a1 % 5;
        a1 = 1;
        System.out.println("Task10= " +b1*a1);

        //Task11

        int m = 5;
        int n = m + m - m * m / m;
        System.out.println("Task11= " +n);

        //Task12

        int k = 1;
        int l = 2;
        l +=--k+l-k;
        System.out.println("Task12= " +l);

        //Task13

        int a2 = 7;
        int c2 = 5;
        a2 = c2%a2;
        System.out.println("Task13= " +(a2%c2));

        //Task14

        int i3 = 10;
        double d3 = 5.5;
        boolean b3 = (i3 == d3);
        System.out.println("Task14= " +b3);

        //Task15
        System.out.println("Task15= " + "one" + "two" );

        //Task16???



        //Task17

        int a4 = 5;
        int b4 = 4;
        a4 -=(b4++) + (++a4);
        System.out.println("Task17=" +a4);

        //Task18

        System.out.println("Task18=" +((5*6)%14+4));

        //Task19

        int s=5;
        System.out.println("Task19=" +(++s-s--));
        System.out.println("       " +s);

        //Task20

        int f= 16;
        int g= 3;
        g += ++f;
        System.out.println("Task20= " +(g++));


    }



}
