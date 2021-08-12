import com.techreturners.BubbleTeaOrderService.*;
import org.junit.Test;
import testHelpers.DummySimpleLogger;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BubbleTeaOrderRequestServiceShould {

    @Test
    public void create_bubble_tea_order_request_when_createOrderRequest_is_called() {

        //Arrange
        DebitCard testDebitCard = new DebitCard("0123456789");
        PaymentDetails paymentDetails = new PaymentDetails("hello kitty", "sanrio puroland", testDebitCard);
        BubbleTea bubbleTea = new BubbleTea(BubbleTeaTypeEnum.OolongMilkTea, 4.5);
        BubbleTeaRequest bubbleTeaRequest = new BubbleTeaRequest(paymentDetails, bubbleTea);
        DummySimpleLogger dummySimpleLogger = new DummySimpleLogger();
        BubbleTeaMessenger mockMessenger = mock(BubbleTeaMessenger.class);

        //Dummy Simple Logger injected into BubbleTeaOrderService
        //mockMessenger injected into BubbleTeaOrderService
        BubbleTeaOrderService bubbleTeaOrderService = new BubbleTeaOrderService(dummySimpleLogger, mockMessenger);

        //Act
        BubbleTeaOrderRequest result = bubbleTeaOrderService.createOrderRequest(bubbleTeaRequest);

        BubbleTeaOrderRequest expectedResult = new BubbleTeaOrderRequest(
                "hello kitty",
                "sanrio puroland",
                "0123456789",
                BubbleTeaTypeEnum.OolongMilkTea);

        //Assert
        assertEquals(expectedResult.getName(), result.getName());
        assertEquals(expectedResult.getAddress(), result.getAddress());
        assertEquals(expectedResult.getDebitCardDigits(), result.getDebitCardDigits());
        assertEquals(expectedResult.getBubbleTeaType(), result.getBubbleTeaType());

        //Verify Mock was called with BubbleTeaOrderRequest result
        verify(mockMessenger).sendBubbleTeaOrderRequestEmail(result);
        verify(mockMessenger, times(1)).sendBubbleTeaOrderRequestEmail(result);
    }

}
