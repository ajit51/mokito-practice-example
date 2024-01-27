package com.javaguides.mokitopracticeexample.BDDMockito;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;

public class PrinterServiceBDDTest {
    @Test
    public void testPrintMessage() {
        // Given: Setting up the scenario
        PrinterService mockPrinter = BDDMockito.mock(PrinterService.class);
        // Using willDoNothing() to ensure the void method doesn't execute its original behavior
        BDDMockito.willDoNothing().given(mockPrinter).printMessage(ArgumentMatchers.anyString());
        // When: Executing the action
        mockPrinter.printMessage("Hello, World!");
        // Then: No output is produced, confirming our mock's behavior
        System.out.println("Finished testing printMessage method.");
    }
}
