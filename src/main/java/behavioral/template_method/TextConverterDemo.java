package behavioral.template_method;

import behavioral.template_method.textConverter.TextConverter;
import behavioral.template_method.textConverter.TextConverterGui;

public class TextConverterDemo {
    public static void main(String[] args) {
        TextConverter textConverter = new TextConverterGui();
        textConverter.runConverter();
    }
}
