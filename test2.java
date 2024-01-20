import java.util.Scanner;

class bbb{
    public static void main(String[] args){
        // System.out.println(args[0]);
        
        System.out.println("請輸入有幾位學生");
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int[] grades=new int[number];

        // 


        System.out.println("請逐一輸入學生成績");
        // 

        
        for (int i = 0; i < grades.length; i++) {
            grades[i]=s.nextInt();
        }

        // 
        int total=0;
        for (int i = 0; i < grades.length; i++) {
            total=total+grades[i];
        }

        int avg=total/grades.length;

        System.out.println("平均成績是:"+avg);
    }
}
