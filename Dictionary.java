public class Dictionary {
    private Word[] wordList = new Word[1000];
    private int count;

    public Dictionary() {
        count = 0;
    }

    public void addWord(String word, String meaning) {
        wordList[count] = new Word(word,meaning);
        ++count;
    }

    public void print() {
        for (int i= 0; i < count; ++i) {
            System.out.println(wordList[i].getWord_target() + "      " + wordList[i].getWorld_explain());
        }
    }
}
