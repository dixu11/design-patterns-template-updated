package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jan");
        names.add("Joanna");
        names.add("Marcin");

       // List<String> toRemove = new ArrayList<>();
       /* for (String name : new ArrayList<>(names)) {
            System.out.println(name);
            if (name.equals("Jan")) {
                names.remove(name);
            }
        }*/

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals("Jan")) {
                names.remove(names.get(i));
                i--;
            }
        }
       // names.removeAll(toRemove);

        System.out.println(names);

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("Marcin")) {
               iterator.remove();
            }
        }
        System.out.println(names);
    }
}
