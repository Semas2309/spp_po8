import java.util.*;

class Word {
    String english;
    String russian;
    int count;

    Word(String english, String russian, int count) {
        this.english = english;
        this.russian = russian;
        this.count = count;
    }
}

class Dictionary {
    List<Word> words = new ArrayList<>();

    void addWord(String english, String russian, int count) {
        words.add(new Word(english, russian, count));
    }

    void removeWord(String english) {
        words.removeIf(word -> word.english.equals(english));
    }

    Word findWord(String english) {
        for (Word word : words) {
            if (word.english.equals(english)) {
                return word;
            }
        }
        return null;
    }

    void printAlphabetical() {
        words.sort(Comparator.comparing(word -> word.english));
        for (Word word : words) {
            System.out.println(word.english + " - " + word.russian + " - " + word.count);
        }
    }

    void printByCount() {
        words.sort(Comparator.comparing(word -> -word.count));
        for (Word word : words) {
            System.out.println(word.english + " - " + word.russian + " - " + word.count);
        }
    }
}
