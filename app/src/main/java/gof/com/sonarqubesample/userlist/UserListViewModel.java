package gof.com.sonarqubesample.userlist;

public class UserListViewModel {

    public int getCountOfLetters(char letter, String sentence) {
        int count = 0;
        char[] sentenceArray = sentence.toCharArray();

        for (char aSentenceArray : sentenceArray) {
            if (aSentenceArray == letter) {
                count++;
            }
        }

        return count;
    }
}
