package behavioral.template_method;

import java.util.Scanner;

class TextConverterConsole extends TextConverter{
    @Override
    String readSentence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        return scanner.nextLine();
    }

    @Override
    void showResults(String sentenceBackward) {
        System.out.println(RESULT_MESSAGE );
        System.out.println(sentenceBackward);
    }
}
