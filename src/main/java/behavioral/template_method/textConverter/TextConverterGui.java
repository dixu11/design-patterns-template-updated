package behavioral.template_method.textConverter;

import javax.swing.*;

public class TextConverterGui extends  TextConverter{
    @Override
    public String readSentence(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    @Override
    public void showSentence(String sentence) {
        JOptionPane.showMessageDialog(null, "Twoje zdanie: " + sentence);
    }
}
