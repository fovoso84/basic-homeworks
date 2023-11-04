package home.work5;

import java.util.Arrays;

public class hk5 {
    public static void main(String[] args) {
        m1(5, "компот");
        m2();
        m3(5, new int[10]);
        m4(7, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        m5(new int[]{1, 2, 3, 4, 5, 6, 7, 9, 1, 2});


    }

    public static void m1(int a, String str) {
        for (int i = 1; i <= a; i++) {
            System.out.println(i + " " + str);
        }

    }

    public static void m2() {
        int[] a = {1, 2, 5, 7, 9, 15};

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 5) {
                sum += a[i];
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(sum);


    }


    public static void m3(int s, int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = s;

        }
        System.out.println(Arrays.toString(a));

    }

    public static void m4(int s, int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] += s;

        }
        System.out.println(Arrays.toString(a));
    }

    public static void m5(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length / 2; i++) {
            sum += a[i];


        }
        int sum2 = 0;
        for (int i = a.length / 2; i < a.length; i++) {
            sum2 += a[i];

        }
        if (sum > sum2) {
            System.out.println("первая половина больше");
        } else {
            System.out.println("вторая половина больше");
        }


    }

}









