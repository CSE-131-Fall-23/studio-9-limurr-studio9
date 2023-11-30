package studio9;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import support.cse131.NotYetImplementedException;

public class WordCount {
	 public static Map<String, Integer> countWords(List<String> words) {
	        Map<String, Integer> wordCountMap = new HashMap<>();

	        for (String word : words) {
	            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
	        }

	        return wordCountMap;
	    }

	
	public static void main(String[] args) {
		
		List<String> wordList = new LinkedList<>();
		wordList.add("to");
		wordList.add("be");
		wordList.add("or");
		wordList.add("not");
		wordList.add("to");
		wordList.add("be");
		Map<String, Integer> words = countWords(wordList);
		
		for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }	
}
