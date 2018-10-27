package com.codecool.thehistory;

import java.util.*;

public class TheHistoryArrayList implements TheHistory {
    /**
     * This implementation should use a String ArrayList so don't change that!
     */
    private List<String> wordsArrayList = new ArrayList<>();

    @Override
    public void add(String text) {
        //TODO: check the TheHistory interface for more information
        List<String> splitText = Arrays.asList(text.split(" "));

        wordsArrayList.addAll(splitText);
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        //TODO: check the TheHistory interface for more information
        Iterator itr = wordsArrayList.iterator();

        while(itr.hasNext()) {
            Object element = itr.next();
            if(element.equals(wordToBeRemoved)) {
                itr.remove();
            }
        }
    }

    @Override
    public int size() {
        //TODO: check the TheHistory interface for more information
        return wordsArrayList.size();
    }

    @Override
    public void clear() {
        //TODO: check the TheHistory interface for more information
        wordsArrayList.clear();
    }

    @Override
    public void replaceOneWord(String from, String to) {
        //TODO: check the TheHistory interface for more information
        for(int i=0;i<wordsArrayList.size();i++) {
            if(wordsArrayList.get(i).equals(from)) {
                wordsArrayList.set(i,to);
            }
        }
        /*Iterator itr = wordsArrayList.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            if (element.equals(from)) {
                wordsArrayList.set(to);
            }
        }*/
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArrayList) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }

}
