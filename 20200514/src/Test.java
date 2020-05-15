import com.sun.jdi.PathSearchingVirtualMachine;

import javax.naming.NameNotFoundException;
import javax.print.StreamPrintServiceFactory;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Jeremy
 * @date 2020/5/14 9:52
 */
public class Test {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Test.main");
        int m = 10;
        System.out.println("m = " + m);
        String[] arr = new String[]{"Tom","Marry","Kangkang"};
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(33);
        list.add(55);
        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(33);
        list.add(55);

        if (list == null) {
            
        }
        if (list != null) {
            
        }
        if (list != null) {

        }
        if (list == null) {

        }
        if (list != null) {
        psvm
        }

    }
}
