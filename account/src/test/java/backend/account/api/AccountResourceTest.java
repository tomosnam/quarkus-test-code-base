package backend.account.api;


import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class AccountResourceTest {
    @Test
    void getUserProfile() {
        assertEquals("UserTest", "UserTest");
    }

}