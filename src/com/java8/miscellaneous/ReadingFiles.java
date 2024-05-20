package com.java8.miscellaneous;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadingFiles {
    public static void main(String[] args) throws IOException {
        //printing contents of file
        Files.lines(Paths.get("testFile")).forEach(System.out::println);

        //printing all distinct words in a sorted manner
        Files.lines(Paths.get("testFile")).map(str -> str.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .sorted()
                .forEach(System.out::println);
//
        Files.list(Paths.get("./"))
                .filter(Files::isExecutable)
                .forEach(System.out::println);
    }
}
