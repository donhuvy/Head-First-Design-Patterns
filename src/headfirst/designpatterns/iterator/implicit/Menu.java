package headfirst.designpatterns.iterator.implicit;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
