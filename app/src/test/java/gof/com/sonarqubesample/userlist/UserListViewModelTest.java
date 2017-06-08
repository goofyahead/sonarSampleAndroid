package gof.com.sonarqubesample.userlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserListViewModelTest {
    @Test
    public void getCountOfLetters1() throws Exception {

    }

    @Test
    public void getCharsLike() throws Exception {

    }

    @Test
    public void getCountOfLetters() throws Exception {
        UserListViewModel model = new UserListViewModel();
        int result = model.getCountOfLetters('c', "camion");
        assertEquals(1, result);
    }

}