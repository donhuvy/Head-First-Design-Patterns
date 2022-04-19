package headfirst.designpatterns.flyweight;

import java.time.LocalDate;
import java.time.Month;

public interface Tree {
    void display(int x, int y);

    default boolean isWithinRange(LocalDate aDate) {
        Month month = aDate.getMonth();
        return (month.getValue() > 2) && (month.getValue() < 11);
    }
}