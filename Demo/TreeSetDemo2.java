import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class TreeSetDemo2 {

    public static void main(String[] args) {
        Set<Person> set = new TreeSet<Person>(new PersonComparator());

        Person p1 = new Person(10);
        Person p2 = new Person(20);
        Person p3 = new Person(30);
        Person p4 = new Person(40);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        for (Iterator<Person> iterator = set.iterator(); iterator.hasNext();) {
            System.out.print(iterator.next().score + " ");
        }
    }
}

class Person {
    int score;

    public Person(int score) {
        this.score = score;
    }

    public String toString() {
        return String.valueOf(this.score);
    }
}

class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        return o1.score - o2.score;
    }

}