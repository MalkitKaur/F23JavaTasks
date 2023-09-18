package com.example.f23javatasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User newUser;
    @BeforeEach
    void setUp() {
        newUser = new User("fred@rocks.com","Fred","705-555-1234");
    }

    @Test
    void setEmail() {
        newUser.setEmail("fred@georgian.ca");
        assertEquals("fred@georgian.ca",newUser.getEmail());
    }
    @Test
    void setInvalidEmail(){
        Assertions.assertThrows(IllegalAccessException.class,()->{
            newUser.setUserName("");
        });
        Assertions.assertThrows(IllegalAccessException.class,()->{
            newUser.setUserName("test");
        });
        Assertions.assertThrows(IllegalAccessException.class,()->{
            newUser.setUserName("@.stuff");
        });
    }


    @Test
    void setUserName() {
        newUser.setUserName("Barney");
        assertEquals("Barney",newUser.getUserName());
    }
    @Test
    void setInitialUserName(){
        Assertions.assertThrows(IllegalAccessException.class,()->{
            newUser.setUserName("");
        });
        Assertions.assertThrows(IllegalAccessException.class,()->{
            newUser.setUserName("   ");
        });
        Assertions.assertThrows(IllegalAccessException.class,()->{
            newUser.setUserName(" Fred Flinstone ");
        });
    }

    @Test
    void setPhone() {
    }
}