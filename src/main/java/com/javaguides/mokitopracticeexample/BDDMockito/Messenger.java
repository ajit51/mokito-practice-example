package com.javaguides.mokitopracticeexample.BDDMockito;

public class Messenger {
    public String sendMessage(String recipient, String message) {
        // Real-world scenarios would involve sending a message to a recipient
        return "Message sent to " + recipient;
    }

    public String sendMessage(String message) {
        // In a real-world application, this might send a message to a server or user
        return "Message sent: " + message;
    }
}
