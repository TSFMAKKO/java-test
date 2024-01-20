public class HelloWorld2 {
    public static String getHelloWorld(String Name,int age) {
        return Name+" Hello, World!"+"Your age is "+age;
    }

    public static void main(String[] args) {
        String message = getHelloWorld(args[0],Integer.parseInt(args[1]));
        System.out.println(message);
        System.out.println(args[0]);
    }
}