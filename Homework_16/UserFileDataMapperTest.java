package Homework_16;

import Homework_12.EntityUser;
import Homework_12.UserDataMapper;
import Homework_12.UserFileDataMapper;
import Homework_12.UserFileNotFoundException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserFileDataMapperTest {

    private UserDataMapper dm;

    @Before
    public void setUp() {
        dm = new UserFileDataMapper();
    }

    @Test
    public void TestGetAll() {
        assertEquals("Incorrect number of items", "4", dm.getAll().size());
    }

    @Test
    public void TestFindUserById() {
        EntityUser actualUser = dm.findUserById("3");
        EntityUser expectedUser = new EntityUser("3", "Vlad", "", "venture123", "");

        assertEquals("Objects are not equal", actualUser, expectedUser);
    }

    @Test(expected = UserFileNotFoundException.class)
    public void testFindByNonExistingId() {
        dm.findUserById("3");
        }
    }


