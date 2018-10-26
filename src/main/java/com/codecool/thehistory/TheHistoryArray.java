package com.codecool.thehistory;

import java.util.Arrays;

public class TheHistoryArray implements TheHistory {

    /**
     * This implementation should use a String array so don't change that!
     */
    private String[] wordsArray = new String[0];

    @Override
    public void add(String text) {
        //TODO: check the TheHistory interface for more information
        String[] textArray = text.split(" ");

        int newArrayLength = wordsArray.length + textArray.length;
        String[] newArray = new String[newArrayLength];

        System.arraycopy(wordsArray, 0, newArray, 0, wordsArray.length);
        System.arraycopy(textArray,0, newArray, wordsArray.length, textArray.length);

        wordsArray = newArray;

    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        //TODO: check the TheHistory interface for more information
        int occuranceCounter = 0;
        int j = 0;
        for(String item : wordsArray) {
            if (item.equals(wordToBeRemoved)) {
                occuranceCounter ++;
            }
        }
        System.out.println(occuranceCounter);

        String[] newArray = new String[wordsArray.length-occuranceCounter];
        for(String item : wordsArray) {
            if(! item.equals(wordToBeRemoved)) {
                newArray[j] = item;
                j++;
            }
        }
        wordsArray = newArray;
    }

    @Override
    public int size() {
        //TODO: check the TheHistory interface for more information
        int countWords = 0;
        for(String item : wordsArray) {
            countWords++;
        }
        return countWords;
    }

    @Override
    public void clear() {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public void replaceOneWord(String from, String to) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArray) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }
}
