package behavioral.template_method.textConverter;

public abstract class TextConverter {

    public final void runConverter(){
        String sentence = readSentence("Wpisz zdanie - postaram się, wyświetlić je od tyłu :)");
        String sentenceBackward = convert(sentence);
        showSentence(sentenceBackward);
    }

     abstract String readSentence(String prompt);

    private String convert(String sentence) {
        //krok 2: przetworzenie zdania
        String[] words = sentence.split(" ");
        String sentenceBackward = "";
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            sentenceBackward += word + " ";
        }
        return sentenceBackward;
    }

     abstract void showSentence(String sentence);

}
