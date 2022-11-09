package com.guavus.others;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String word = "Haresh";
        Optional<String> checkNull = Optional.ofNullable(word);
        System.out.println(checkNull.empty());
        System.out.println(checkNull.of("Something"));
        System.out.println(checkNull.ofNullable("Janmejay"));
        if (checkNull.isPresent()) {
            String word1 = word.toLowerCase();
            System.out.print(word1);
        }
        else
            System.out.println("word is null");
    }
}
