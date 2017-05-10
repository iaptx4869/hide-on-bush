import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class TreeSetDemo {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>(new MyComparator());

        set.add("f");  
        set.add("a");  
        set.add("b");  
        set.add("c");  
        set.add("d");  
        set.add("e");  
        set.add("A");

        for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
            System.out.print(iterator.next() + " ");
        }
    }
}

class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        return o2.compareTo(o1);//降序排列  
    }

}