package testHelpers;

import com.techreturners.BubbleTeaOrderService.SimpleLoggerImpl;

//This is a DummySimpleLogger
//Represents the Test Double type Dummy

public class DummySimpleLogger implements SimpleLoggerImpl {

    @Override
    public void addLoggingText(String loggingText) {
    }

}
