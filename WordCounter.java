class WordCounter {
    static String language = "English";

    void countWords(String sentence) {
        String text = sentence.trim();

        int count = 0;

        if (!text.isEmpty()) {
            String[] words = text.split("\\s+");
            count = words.length;
        }

        System.out.println("Language: " + language);
        System.out.println("Number of words = " + count);
    }

    public static void main(String[] args) {
        WordCounter w = new WordCounter();

        w.countWords("Java is easy to learn");
    }
}