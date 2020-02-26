public class HelloNativeTest {
    static{
        System.loadLibrary("hello");
    }
    public static void main(String[] args){
        HelloNative.greeting();
    }
}
