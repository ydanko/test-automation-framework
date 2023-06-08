package com.wallethub.pages_utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProfileCompanyUtils {

    public static boolean compareLastWords(String actualValue, String userValue) {
        List<String> actualWords = Arrays.stream(actualValue.split(" ")).collect(Collectors.toList());
        List<String> userWords = Arrays.stream(userValue.split(" ")).collect(Collectors.toList());
        String lastActualWord = actualWords.get(actualWords.size() - 2);
        String lastUserWord = userWords.get(userWords.size() - 2);
        return lastActualWord.equals(lastUserWord);
    }

    public static boolean compareFirstWords(String actualValue, String userValue) {
        String actualWord = actualValue.split("\\s+")[0];
        String userWord = userValue.split("\\s+")[0];
        return actualWord.equals(userWord);
    }

}
