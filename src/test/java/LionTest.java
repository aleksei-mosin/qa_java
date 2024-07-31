import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {
    @Mock
    Feline feline;
    Lion lion;
    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самка", feline);
    }
    @Test
    public void checkMaleTest() throws Exception {
        lion = new Lion("Самец",feline);
        assertTrue(lion.doesHaveMane());
    }
    @Test
    public void checkFemaleTest() {
       assertFalse(lion.doesHaveMane());
    }
    @Test
    public void checkGermaphroditeTest() {
        assertThrows(Exception.class,()-> new Lion("Гермафродит",feline));

    }
    @Test
    public void getKittensLionTest(){
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }
    @Test
    public void getFoodLionTest() throws Exception{
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedList);
        Assert.assertEquals(expectedList, lion.getFood());
    }
}
