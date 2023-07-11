package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome! \n");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.print(i + " ");
        }
        System.out.println();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> even = new ArrayList<>();
        List<Integer> odd =  new ArrayList<>();
        List<Integer> quad = new ArrayList<>();
        list.stream().filter(x -> x % 2 == 0).forEach(even::add);
        list.stream().filter(x -> x % 2 == 1).forEach(odd::add);
        list.stream().map(x -> x * x).forEach(quad::add);
        System.out.print(even);
        System.out.println();
        System.out.print(odd);
        System.out.println();
        System.out.print(quad);
        System.out.println();
    }
}