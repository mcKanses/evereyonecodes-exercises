package academy.everyonecodes.java.assignment.exercise1;

import java.util.ArrayList;
import java.util.List;

public class NumberNameShifter extends NumberNamesDictionary {
    public List<String> shift(List<String> numNames) {
        List<String> shifted = new ArrayList<String>();

        numNames.stream().forEach(numName -> {
            int numeric = (this.getNumber(numName).get()) + 1;
            if (numeric >= 0 && numeric <= 9) {
                String name = this.getName(numeric).get();
                shifted.add(name);
            }
        });

        return shifted;
    }
}
