import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/** 
 * 一个不包含重复元素的 collection。更确切地讲，set 不包含满足 e1.equals(e2) 的元素对 e1 和 e2， 
 * @author Owner 
 * 
 */
class HashSetDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        set.add("e");//不能放入重复数据  

        /** 
         * 遍历方法一，迭代遍历 
         */
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        System.out.println("********************");

        /** 
         * for增强循环遍历 
         */
        for (String value : set) {
            System.out.print(value + " ");
        }
    }
}