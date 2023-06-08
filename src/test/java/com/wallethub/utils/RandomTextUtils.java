package com.wallethub.utils;

import org.apache.commons.lang3.RandomStringUtils;
public class RandomTextUtils {
    public static final String RANDOM_WORDS = generateRandomStringWithSpaces(250, 3, 10);
    public static final String generateRandomStringWithSpaces(int wordCount, int minLength, int maxLength) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < wordCount; i++) {
            int length = (int) (Math.random() * (maxLength - minLength + 1) + minLength);
            String word = RandomStringUtils.random(length, true, false);
            stringBuilder.append(word);
            if (i < wordCount - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

}
