package com.javaguides.mokitopracticeexample.service;

public interface Callback {
    void onSuccess();

    void onFailure(String reason);
}
