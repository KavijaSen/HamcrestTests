package org.kss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    @Test
    public void testGetUserById() {
        UserService userService = new UserService();
        assertEquals("user123@example.com", userService.getUserById("123").getEmail());
    }
}

