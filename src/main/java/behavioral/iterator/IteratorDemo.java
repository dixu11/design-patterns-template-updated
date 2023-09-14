package behavioral.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("a","b","c"));
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("a")) {
                iterator.remove(); // umozliwia usuniecie w trakcie iteracji (dla ArrayList)
                //strings.remove(element);
            }
        }

        for (String string : strings) {
            System.out.println(string);
            if (string.equals("a")) {
                strings.remove(string); // wysypie sie bo w for-each nie nalezy zmieniac struktury zbioru
            }
        }
    }
}
