package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String result1 = str.substring(0,5);
        String result2 = str.substring(5,9);
        System.out.println("filename = "+result1);
        System.out.println("extName = "+result2);
    }
}
