import com.techreturners.bubbleteaordersystem.service.BubbleTeaRouletteService;
import com.techreturners.bubbleteaordersystem.model.BubbleTeaTypeEnum;

import org.junit.jupiter.api.Test;
import testhelper.RandomStub;

import static org.junit.Assert.assertEquals;

public class BubbleTeaRouletteServiceTest {

    @Test
    public void generate_a_random_bubble_tea_type_when_getRandomBubbleTeaType_is_called() {

        //Arrange
        RandomStub randomStub = new RandomStub(1);
        BubbleTeaRouletteService bubbleTeaRouletteService = new BubbleTeaRouletteService(randomStub);

        //Act
        var actualResult = bubbleTeaRouletteService.getRandomBubbleTeaType();
        var expectedResult = BubbleTeaTypeEnum.JasmineMilkTea;

        //Assert
        assertEquals(expectedResult, actualResult);

    }
}
