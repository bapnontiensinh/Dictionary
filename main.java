import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the numbers of word:");
        int inputNum = scanner.nextInt();
        scanner.nextLine();
        inputNewWord newWord = new inputNewWord();
        inputNewMeaning newMeaning = new inputNewMeaning();
        System.out.println("Input the Words and Meanings : ");
        for (int i = 0; i < inputNum; i++) {
            String tmp1 = scanner.nextLine();
            newWord.addNewWord(tmp1);
            String tmp2 = scanner.nextLine();
            newMeaning.addNewMeaning(tmp2);
        }
        DictionaryManagement insertData = new DictionaryManagement(inputNum, newWord, newMeaning);
        DictionaryCommandline display = new DictionaryCommandline();
        display.dictionaryBasic(insertData);
    }
}
