package com.sofiane;

import com.sofiane.utils.ConstantUtils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main( String[] args ) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<String> names = Arrays.asList("joe","freddy","alice");
        //TODO find a way to accept only Integer and String class type instead of Object class
        Consumer<Object> displayConsumer = t -> System.out.print(" " + t.toString().toUpperCase());

        System.out.println(ConstantUtils.TITLE + "NUMBER LIST");
        numbers.forEach(displayConsumer);
        System.out.println(ConstantUtils.SUB_TITLE + "EVEN NUMBER IN THE LIST");
        numbers.stream()
             .filter(x-> x%2 == 0)
             .forEach(displayConsumer);
        System.out.println(ConstantUtils.SUB_TITLE + "ODD NUMBER IN THE LIST");
        numbers.stream()
                .filter(x-> x%2 != 0)
                .forEach(displayConsumer);

        System.out.println(ConstantUtils.TITLE + "NAME LIST");
        names.forEach(displayConsumer);
        System.out.println(ConstantUtils.SUB_TITLE + "SORTED NAME LIST");
        names.stream()
                .sorted()
                .forEach(displayConsumer);

    }
}
