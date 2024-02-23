package behavioral.template_method;

import java.util.Scanner;

public abstract class TextConverter {

    static final String WELCOME_MESSAGE = "Wpisz zdanie - postaram się, wyświetlić je od tyłu :)";
    static final String RESULT_MESSAGE = "Twoje zdanie:";


    public final void runConverter() {
        String sentence = readSentence();
        String sentenceBackward = reverseSentence(sentence);
        showResults(sentenceBackward);
    }

    abstract String readSentence();

    private String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sentenceBackward = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            sentenceBackward.append(word).append(" ");
        }
        return sentenceBackward.toString();
    }
    abstract void showResults(String sentenceBackward);
}
