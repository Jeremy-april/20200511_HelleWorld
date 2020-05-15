/**
 * @author Jeremy
 * @date 2020/5/13 20:55
 */
public class TestCodeSeg {
//    静态代码块在类加载时执行，且只执行一次
    static {
        System.out.println("1");
    }
//对象代码块创建对象时执行，优先级高于构造器
    {
        System.out.println("2");
    }
//构造器创建对象时执行，优先级小于对象代码块。顺序与预料的不同并不是因为err和out的区别导致，而是因为他们是两个流，由于缓存原因导致输出顺序不同。
    public TestCodeSeg() {
        System.err.println("3");
    }

    public static void main(String[] args) {
        new TestCodeSeg();
    }
}
