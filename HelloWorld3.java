public class HelloWorld3 {
    // public static String getHelloWorld(String Name,int age) {
    // return Name+" Hello, World!"+"Your age is "+age;
    // }

    public static void main(String[] args) {
        // String message = getHelloWorld(args[0],Integer.parseInt(args[1]));
        // System.out.println(message);
        // System.out.println(args[0]);
        
        if (args.length >= 2) {
            try{
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            
            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
            }
            catch(NumberFormatException e)
            {
                System.out.println("請輸入num");
            }

        } 
        else {
            System.out.println("Please provide two integers as command line arguments.");
        }
    }
}