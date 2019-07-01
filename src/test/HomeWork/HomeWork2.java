package test.HomeWork;

public class HomeWork2 {
    public static void main(String[] args) {

        //Task1


        if(false) {
            System.out.println("FALSE");
        }
        else {
            System.out.println("TRUE");
        }


        //Task2

        String name = "Solo";
        if (name.length() ==4) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


            //Task3

        int x=8;
        int y=2;
        int sum = x+y;
        for (int i=1; i<=3; i++) {
            sum += i;
        }
        System.out.println(sum);


            //Task4


        int k=1;
        sum = 10;
        while (k!=5) {
            sum += k;
            k++;
        }
        System.out.println(sum);

            //Task5

        int z = 1;
        for (int i=1; i<5; i++) {
            System.out.println(z+i);
        }
        System.out.println("=====");


            //Task6 ????


            //Task7


       // int [] a ={1,2,3};
       // int p = 0;
       // for (int = 0; i < 3; i++) {
       //     p*= a[i];
       // }
       // System.out.println(p);



        //Task8

        int [] arr = {3,4,2,1};
        int m = arr[0];
        for (int n=0;n < 4; n++) {
            if (arr[n] >m) {
                m = arr[n];
            }
        }
        System.out.println(m);


        //Task9

        int[] b = {5,6,3,8,7};
        for (int i:b) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("====" );


        //Task10
















    }
    }