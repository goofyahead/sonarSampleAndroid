package gof.com.sonarqubesample.userlist;

public class UserListViewModel {

    public int getCountOfLetters(char letter, String sentence){
        int count = 0;
        char [] sentenceArray = sentence.toCharArray();

        for (int x = 0; x < sentenceArray.length; x++) {
            if (sentenceArray[x] == letter) count++;
        }

        return count;
    }
}
