import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {
    @Mock
    Feline feline;
    Cat cat;
    @Before
        public void setUp() {
        cat = new Cat(feline);
    }
    @Test
    public void getSoundTest(){
        String acturalResult = cat.getSound();
        String expextedResult = "Мяу";
        assertEquals(expextedResult, acturalResult);
    }
    @Test
    public void getFoodTest()throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        List<String> actualFood = cat.getFood();
        assertEquals(expectedFood, actualFood);
    }
}
