package app.view;

import java.util.function.Consumer;

import static java.lang.String.format;

public class UIOperator {
    private static final Consumer<String> PRINTER = System.out::println;

    public static <T> void getOutput(String description, T output) {
        PRINTER.accept(format("%s: %s", description, output.toString()));
    }
}
