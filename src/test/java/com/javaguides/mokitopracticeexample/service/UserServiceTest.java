package com.javaguides.mokitopracticeexample.service;

import com.javaguides.mokitopracticeexample.dto.UserData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserService userServiceMock;
    @Captor
    private ArgumentCaptor<UserData> userDataArgumentCaptor;

    @Test
    public void saveUserTest() {
        UserData userData = new UserData("John Doe");
        userServiceMock.saveUser(userData);
        // Capture the argument passed to the saveUser method
        verify(userServiceMock).saveUser(userDataArgumentCaptor.capture());
        UserData capturedUser = userDataArgumentCaptor.getValue();
        Assertions.assertEquals("John Doe", capturedUser.getName());
    }
}
