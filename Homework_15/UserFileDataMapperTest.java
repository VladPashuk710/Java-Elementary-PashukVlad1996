package Homework_15;

import Homework_12.EntityUser;
import Homework_12.UserFileDataMapper;
import Homework_12.UserDataMapper;
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
    public void testGetAll() {
        assertEquals("Incorrect number of items", "4", dm.getAll().size());
    }

    @Test
    public void testFindUserById() {
        EntityUser actualUser = dm.findUserById("3");
        EntityUser expectedUser = new EntityUser("3", "Vlad", "pasukvlad0@gmail.com", "venture123", "gamer");
        assertEquals("Objects are not equal", actualUser, expectedUser);
    }

    @Test
    public void testFindUserByUsername() {
        EntityUser actualUser = dm.findUserByUsername("Vlad");
        EntityUser expectedUser = new EntityUser("3", "Vlad", "pasukvlad0@gmail.com", "venture123", "gamer");
        assertEquals("Objects are not equal", actualUser, expectedUser);
    }

    @Test
    public void testFindUserByEmail() {
        EntityUser actualUser = dm.findUserByEmail("pasukvlad0@gmail.com");
        EntityUser expectedUser = new EntityUser("3", "Vlad", "pasukvlad0@gmail.com", "venture123", "gamer");
        assertEquals("Objects are not equal", actualUser, expectedUser);
    }


    @Test
    public void testFindUserByPassword() {
        EntityUser actualUser = dm.findUserByPassword("venture123");
        EntityUser expectedUser = new EntityUser("3", "Vlad", "pasukvlad0@gmail.com", "venture123", "gamer");
        assertEquals("Objects are not equal", actualUser, expectedUser);
    }

    @Test
    public void testFindUserByRole() {
        EntityUser actualUser = dm.findUserByRole("gamer");
        EntityUser expectedUser = new EntityUser("3", "Vlad", "pasukvlad0@gmail.com", "venture123", "gamer");
        assertEquals("Objects are not equal", actualUser, expectedUser);
    }

    @Test(expected = UserFileNotFoundException.class)
    public void testFindByNonExistingId() {
        dm.findUserById("3");
        }
    }


