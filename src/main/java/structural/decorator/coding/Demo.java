package structural.decorator.coding;


import structural.decorator.coding.table.ClassicTable;
import structural.decorator.coding.table.CompactTable;
import structural.decorator.coding.table.FoldingTable;
import structural.decorator.coding.table.Table;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ClassicTable table = new ClassicTable();
        table.putOnTable("szklanka");
        table.putOnTable("książka");
        table.putOnTable("karton");
       // table.putOnTable("świeczka");
        System.out.println(table.getItems());
        System.out.println(table.getItemLimit());


        CompactTable compactTable = new CompactTable(table);
        compactTable.removeLastItem();
        compactTable.removeLastItem();
        compactTable.removeLastItem();
        compactTable.compact();
        compactTable.uncompact();
        compactTable.putOnTable("Kot");



  /*      FoldingTable foldingTable = new FoldingTable(compactTable);
        System.out.println(foldingTable.getItems());
        System.out.println(foldingTable.getItemLimit());
        foldingTable.unfold();
        foldingTable.putOnTable("Świeczka");
        foldingTable.putOnTable("Lampka");
        System.out.println(foldingTable.getItems());
        foldingTable.removeLastItem();
        foldingTable.removeLastItem();
        foldingTable.fold();
        foldingTable.putOnTable("Laptop");*/

        FileInputStream fileInputStream = new FileInputStream("file.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectInputStream.readObject();









    }
}
