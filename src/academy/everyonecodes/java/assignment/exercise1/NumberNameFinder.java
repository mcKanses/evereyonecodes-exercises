package academy.everyonecodes.java.assignment.exercise1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class NumberNameFinder extends NumberNamesDictionary {

    public String find(List<String> numNames) {
        List<String> filtered = new ArrayList<String>();

        numNames.stream().forEach(numName -> {
           int numeric = this.getNumber(numName).orElse(-1);

           if (numeric >= 0 && numeric <= 9) {
               String name = this.getName(numeric).get();
               filtered.add(name);
           }
        });

        filtered.stream().sorted(Comparator.comparing(String::toString).reversed());

        String lastValue = filtered.stream().findFirst().get().toUpperCase(Locale.ROOT);
        System.out.println(lastValue);

        return lastValue;
    }
}