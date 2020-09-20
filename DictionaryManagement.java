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

    public void insertFromCommandline() {
        for (int i = 0; i < wordNum; ++i) {
            dict.addWord(word.newWord[i], meaning.newMeaning[i]);
        }
    }
}
