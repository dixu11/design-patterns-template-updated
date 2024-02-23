package behavioral.template_method;

import javax.swing.*;

class TextConverterGui extends TextConverter {
    @Override
    String readSentence() {
        return JOptionPane.showInputDialog(WELCOME_MESSAGE);
    }

    @Override
    void showResults(String sentenceBackward) {
        JOptionPane.showMessageDialog(null,  RESULT_MESSAGE + "\n" + sentenceBackward);
    }
}
