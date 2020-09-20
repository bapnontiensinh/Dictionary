public class inputNewWord {
    String[] newWord;
    int count;

    public inputNewWord() {
        count = 0;
        newWord = new String[1000];
    }

    public void addNewWord(String s) {
        newWord[count] = s;
        ++count;
    }
}
