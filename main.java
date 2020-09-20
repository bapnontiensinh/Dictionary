public class main {
    public static void main(String[] args) {
        String inputNum = args[0];

        inputNewWord newWord = new inputNewWord();
        inputNewMeaning newMeaning = new inputNewMeaning();

        int wordNum = Integer.parseInt(inputNum);

        for (int i = 1; i < wordNum * 2 + 1; i = i + 2 ) {
            newWord.addNewWord(args[i]);
            newMeaning.addNewMeaning(args[i+1]);
        }

        DictionaryManagement insertData = new DictionaryManagement(wordNum,newWord,newMeaning);

        insertData.insertFromCommandline();
    }
}
