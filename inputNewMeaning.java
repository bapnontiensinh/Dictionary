public class inputNewMeaning {
    String[] newMeaning;
    int count;

    public inputNewMeaning() {
        count = 0;
        newMeaning = new String[1000];
    }

    public void addNewMeaning(String s) {
        newMeaning[count] = s;
        ++count;
    }
}
