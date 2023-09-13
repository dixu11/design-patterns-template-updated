package structural.adapter.example;

import java.util.ArrayList;
import java.util.List;

public class ChessDemo {
    public static void main(String[] args) {
        //Wzorca adapter używamy wtedy, kiedy mamy do czynienia z implementacją która jest niezgodna z oczekiwanym interfejsem
        //i niewskazane jest modyfikowanie oryginalnej klasy


        List<Figure> figures = new ArrayList<>();
        figures.add(new Rook(0,0));
        figures.add(new Rook(0,7));
        figures.add(new JokerAdapter(new Joker(1,1))); // implementacja poprzez opakowanie (wzorcowa)
        figures.add(new JokerAdapter2(1,1)); // implementacja poprzez dziedziczenie
        //nie zalecam bo: zajmuje slota na dziedziczenie, docelowa klasa może być final, opakowywany obiekt może być gdzieś jeszcze używany
    }
}
