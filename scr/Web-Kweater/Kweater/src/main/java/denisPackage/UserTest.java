package denisPackage;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.testng.annotations.*;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    static User user1=new User("Den", "Kos", 19, Gender.Male,"den_prog");

    @Test
    void getNikname() {
        user1.createUser("G","fea",15,Gender.Female,"fesf");
        assertNotNull(user1);
        String str = user1.getNikname();

        assert (user1.getNikname()=="fesf");
        assert (user1.getSername()=="fea");
        assert (user1.getAge()==15);
        assert (user1.getGender()==Gender.Female);
    }

    @Test
    void TestUserisNotNull() {
        System.out.println(user1.toString());
    }

}