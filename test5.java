import java.util.Scanner;
import java.util.Arrays;


class ccc {
    public static void main(String[] args) {
        // System.out.println(args[0]);

        System.out.println("請輸入有幾位學生");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int[] grades = new int[number];

        //

        System.out.println("請逐一輸入學生成績");
        //

        for (int i = 0; i < grades.length; i++) {
            grades[i] = s.nextInt();
        }

        //
        int total = 0;
        for (int i = 0; i < grades.length; i++) {
            total = total + grades[i];
        }

        int avg = total / grades.length;

        System.out.println("平均成績是:" + avg);
    }
}

class ddd {
    public static void main(String[] args) {
        // System.out.println(args[0]);

        System.out.println("請輸入有幾位學生");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int[] grades = new int[number];

        //

        System.out.println("請逐一輸入學生成績");
        //

        for (int i = 0; i < grades.length; i++) {
            grades[i] = s.nextInt();
        }

        //
        int total = 0;
        for (int i = 0; i < grades.length; i++) {
            total = total + grades[i];
        }
        System.out.println("total:" + total);
        System.out.println("length:" + grades.length);
        double avg = (double) total / grades.length;

        System.out.println("平均成績是:" + avg);
    }
}

class eee {
    public static void main(String[] args) {
        // System.out.println(args[0]);

        System.out.println("請輸入有幾位學生");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int[][] grades = new int[number][2];

        //

        System.out.println("請逐一輸入學生成績");
        //

        for (int i = 0; i < grades.length; i++) {
            System.out.println("學生 " + (i + 1) + " 的國文成績");
            grades[i][0] = s.nextInt();
            System.out.println("學生 " + (i + 1) + " 的數學成績");
            grades[i][1] = s.nextInt();
        }

        // System.out.println(Arrays.deepToString(grades));
        System.out.println("成績列表：" + Arrays.deepToString(grades));

        System.out.println("成績列表：");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("學生 " + (i + 1) + ": " + Arrays.toString(grades[i]));
        }

        //
        // int total = 0;
        // for (int i = 0; i < grades.length; i++) {
        // total = total + grades[i];
        // }
        // System.out.println("total:" + total);
        // System.out.println("length:" + grades.length);
        // double avg = (double)total / grades.length;

        // System.out.println("平均成績是:" + avg);
    }
}