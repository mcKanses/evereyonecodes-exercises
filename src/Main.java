import academy.everyonecodes.java.assignment.exercise1.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        NumberNameShifter numNameShifter = new NumberNameShifter();
        NumberNameFinder numNameFinder = new NumberNameFinder();

        List<String> shiftedNumNames = numNameShifter.shift(List.of("one", "two", "nine"));
        shiftedNumNames.stream().forEach(System.out::println);
        numNameFinder.find(List.of("four", "arda", "nine", "two"));

    }
}
