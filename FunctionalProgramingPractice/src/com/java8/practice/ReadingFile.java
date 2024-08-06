package com.java8.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
		Files.lines(Paths.get("file.txt"))
		.map(str -> str.split(" "))
		.flatMap(Arrays::stream)
		.distinct()
		.forEach(System.out::println);

	}

}
