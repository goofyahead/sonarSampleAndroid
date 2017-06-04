package gof.com.sonarqubesample.userlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserListViewModelTest {
    @Test
    public void getCountOfLetters() throws Exception {
        UserListViewModel model = new UserListViewModel();
        int result = model.getCountOfLetters('c', "camion");
        assertEquals(1, result);
    }

}