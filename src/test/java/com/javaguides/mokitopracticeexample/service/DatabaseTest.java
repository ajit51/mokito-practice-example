package com.javaguides.mokitopracticeexample.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DatabaseTest {
    @Test
    public void testDoAnswer() {
        // Create a mock of Database
        Database mockDatabase = Mockito.mock(Database.class);
        // Implement the doAnswer logic
        Mockito.doAnswer(invocation -> {
            String data = invocation.getArgument(0);
            Callback callback = invocation.getArgument(1);
            if ("validData".equals(data)) {
                callback.onSuccess();
            } else {
                callback.onFailure("Invalid Data");
            }
            return null; // Since our save method has a void return type
        }).when(mockDatabase).save("validData", new Callback() {
            @Override
            public void onSuccess() {
                System.out.println("Data Saved Successfully!");
            }

            @Override
            public void onFailure(String reason) {
                System.out.println("Data Saving Failed: " + reason);
            }
        });
        // Invoke the method
        mockDatabase.save("validData", new Callback() {
            @Override
            public void onSuccess() {
                System.out.println("Data Saved Successfully!");
            }

            @Override
            public void onFailure(String reason) {
                System.out.println("Data Saving Failed: " + reason);
            }
        });
    }
}
