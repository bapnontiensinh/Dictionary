public class DictionaryCommandline {
    public void showAllWord(Dictionary dict) {
        System.out.println("NO\t\t|English\t|Vietnamese");
        dict.print();
    }

    public void dictionaryBasic(DictionaryManagement insertData) {
        insertData.insertFromCommandline();
        showAllWord(insertData.dict);
    }
}
