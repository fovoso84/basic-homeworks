package home.work5;

import java.util.Arrays;

public class hk5 {
    public static void main(String[] args) {
        m1();m2();m3(5 , new int[10]);m4(7 , new int[]{1,2,3,4,5,6,7,8,9});
        m5(new int[] {1,2,3,4,5,6,7,8,9,10} );



    }
    public static void m1(){
        for (int i = 0 ;i < 5; i++){
            System.out.println(i + " компот" );
        }

    }
    public static void m2(){
        int [] a = {1,2,5,7,9,15};

        int sum = 0;
        for (int i = 0; i < a.length; i ++){
           if (a[i] > 5){
               sum += a [i];
           }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(sum);





    }


    public static void m3(int s, int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = s;

        }
        System.out.println(Arrays.toString(a));

    }
    public static void m4(int s , int[] a){
        for (int i = 0; i < a.length; i++ ) {
            a[i] += s;

        }
        System.out.println(Arrays.toString(a));
    }

    public static void m5(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length/2; i++) {
            sum += a[i];


        }
        int sum2 =0;
        for (int i = a.length/2; i < a.length; i++) {
            sum2 += a[i];

        }
        if (sum > sum2){
            System.out.println(sum);
        } else {
            System.out.println(sum2);
        }
        System.out.println(Arrays.toString(a));
        Math.max(sum , sum2);
        System.out.println(Math.max(sum,sum2));

    }
    public static void m6(){
        int[] a = {1,1,1};
        int[] b = {2,2,2,2};
        int[] c = {3,3,3,3,3,3,3};
        int[] res = new int[a.length + b.length + c.length];
    }








}
