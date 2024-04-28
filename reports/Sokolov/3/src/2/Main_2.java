public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        // Добавление слов
        dictionary.addWord("hello", "привет", 10);
        dictionary.addWord("world", "мир", 20);
        dictionary.addWord("java", "ява", 15);

        // Печать словаря в алфавитном порядке
        System.out.println("Словарь в алфавитном порядке:");
        dictionary.printAlphabetical();

        // Печать словаря по количеству обращений
        System.out.println("\nСловарь по количеству обращений:");
        dictionary.printByCount();

        // Поиск слова
        Word foundWord = dictionary.findWord("hello");
        if (foundWord != null) {
            System.out.println("\nНайдено слово: " + foundWord.english + " - " + foundWord.russian + " - " + foundWord.count);
        }

        // Удаление слова
        dictionary.removeWord("world");

        // Печать словаря в алфавитном порядке после удаления слова
        System.out.println("\nСловарь в алфавитном порядке после удаления слова:");
        dictionary.printAlphabetical();
    }
}