package Task1;

import java.util.*;
import java.util.stream.Collectors;

public class MyWordCount {
	public static final String fileName = "data/fit.txt";
	private List<String> words = new ArrayList<>();

	public MyWordCount() {
		this.words.addAll(words);
	}

	public List<WordCount> getWordCounts() {
		List<WordCount> wordCounts = new ArrayList<>();
		Map<String, Integer> wordFrequency = new HashMap<>();

		for (String word : words) {
			wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
		}

		for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
			wordCounts.add(new WordCount(entry.getKey(), entry.getValue()));
		}

		return wordCounts;
	}

	public Set<String> getUniqueWords() {
		Map<String, Integer> wordFrequency = new HashMap<>();

		for (String word : words) {
			wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
		}
		return wordFrequency.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey)
				.collect(Collectors.toSet());
	}

	public Set<String> getDistinctWords() {
		return new HashSet<>(words);
	}

	public Set<WordCount> filterWords(String pattern) {
		List<WordCount> filteredWordCounts = new ArrayList<>();
		for (String word : words) {
			if (!word.startsWith(pattern)) {
				filteredWordCounts.add(new WordCount(word, 1));
			}
		}
		return new HashSet<>(filteredWordCounts);
	}

	public class WordCount {
		private String word;
		private int count;

		public WordCount(String word, int count) {
			this.word = word;
			this.count = count;
		}

		public String getWord() {
			return word;
		}

		public int getCount() {
			return count;
		}
	}

	public static void main(String[] args) {
	
	}
}
