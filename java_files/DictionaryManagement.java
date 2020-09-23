import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DictionaryManagement {
    int wordNum;
    inputNewWord word;
    inputNewMeaning meaning;

    Dictionary dict = new Dictionary();

    public DictionaryManagement(int wordNum, inputNewWord word, inputNewMeaning meaning) {
        this.wordNum = wordNum;
        this.word = word;
        this.meaning = meaning;
    }

    public DictionaryManagement() {

    }

    public void insertFromCommandline() {
        for (int i = 0; i < wordNum; ++i) {
            dict.addWord(word.newWord[i], meaning.newMeaning[i]);
        }
    }

    public void insertFromFile(String file) throws FileNotFoundException {
        File wordList = new File(file);

        try {
            Scanner scanner = new Scanner(wordList);
            inputNewWord newWord = new inputNewWord();
            inputNewMeaning newMeaning = new inputNewMeaning();
            int inputNum = 0;
            String input;

            while (scanner.hasNext()) {
                input = scanner.next();
                input = scanner.next();
                newWord.addNewWord(input);
                input = scanner.next();
                newMeaning.addNewMeaning(input);
                ++inputNum;

                scanner.nextLine();
            }

            for (int i = 0; i < inputNum; ++i) {
                dict.addWord(newWord.newWord[i], newMeaning.newMeaning[i]);
            }
        }
        catch (FileNotFoundException ex) {
            System.out.print("File not found");
        }
    }
}
