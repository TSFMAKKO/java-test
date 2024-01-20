class test1219 {
    private static int result = 0;

    public static void main(String[] args) {
        test1219.talk("alex", "hello");

        result= BasicMath.add(2,3);
        // BasicMath.multiply(3,4);
        displayResult();
    }

    static void talk(String name, String msg) {

        System.out.println(name + ":" + msg);
    }


    static void displayResult() {
        System.out.println("Result: " + result);
    }


}

class BasicMath{
    static void add(int n1, int n2) {
        int result = n1 + n2;
        System.out.println(result);
    }

    static void multiply(int n1, int n2) {
        int result = n1 * n2;
        System.out.println(result);
    }
}