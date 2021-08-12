import com.techreturners.bubbleteaordersystem.model.*;
import com.techreturners.bubbleteaordersystem.service.BubbleTeaMessenger;
import com.techreturners.bubbleteaordersystem.service.BubbleTeaOrderService;
import org.junit.jupiter.api.Test;
import testhelper.DummySimpleLogger;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BubbleTeaOrderRequestServiceTest {

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

    @Test
    public void create_bubble_tea_order_request_and_send_email_when_createOrderRequest_is_called() {

        //Arrange
        DebitCard testDebitCard = new DebitCard("0123456789");
        PaymentDetails paymentDetails = new PaymentDetails("hello kitty", "sanrio puroland", testDebitCard);
        BubbleTea bubbleTea = new BubbleTea(BubbleTeaTypeEnum.OolongMilkTea, 4.5);
        BubbleTeaRequest bubbleTeaRequest = new BubbleTeaRequest(paymentDetails, bubbleTea);
        DummySimpleLogger dummySimpleLogger = new DummySimpleLogger();
        BubbleTeaMessenger spiedMessenger = spy(new BubbleTeaMessenger(dummySimpleLogger));

        //Dummy Simple Logger injected into BubbleTeaOrderService
        //mockMessenger injected into BubbleTeaOrderService
        BubbleTeaOrderService bubbleTeaOrderService = new BubbleTeaOrderService(dummySimpleLogger, spiedMessenger);

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

        //Check the spied messenger was called with BubbleTeaOrderRequest result
        verify(spiedMessenger).sendBubbleTeaOrderRequestEmail(result);
        verify(spiedMessenger, times(1)).sendBubbleTeaOrderRequestEmail(result);
    }

}
