package behavioral.template_method.textConverter;

import java.util.Scanner;

public class TextConverterConsole extends TextConverter{

    @Override
    public String readSentence(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        return scanner.nextLine();
    }

    @Override
    public void showSentence(String sentence) {
        System.out.println("Twoje zdanie: ");
        System.out.println(sentence);
    }
}
