/**
 * @author Jeremy
 * @date 2020/5/13 20:35
 */
public class HelloWorld {
    private Object object = new Object();
    private static int i = 0;
    private static String s = "HelloWorld!";
    public int add(){
        int a = 1;
        int b = 2;
        int c = (a + b) * 100;
        return c;
    }
    public static void main(String[] args){
        HelloWorld app = new HelloWorld();
        int result = app.add();
        System.out.println(result);
    }
}
