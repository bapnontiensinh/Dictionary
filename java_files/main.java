import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        DictionaryManagement insertData = new DictionaryManagement();
        try{
            insertData.insertFromFile("dictionary_data.txt");
            insertData.dict.print();
        }
        catch (FileNotFoundException ex) {
            System.out.print("File not found");
        }
    }
}
