package structural.adapter.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RookTest {

    @Test
    public void rookMovesCorrectly() {
        Rook rook = new Rook(3,4);
       Assertions.assertTrue(rook.move(3,5));
       Assertions.assertTrue(rook.move(3,3));
       Assertions.assertTrue(rook.move(5,4));
       Assertions.assertTrue(rook.move(1,4));
       Assertions.assertFalse(rook.move(5,5));
       Assertions.assertFalse(rook.move(3,4));
    }
  
}
