import com.example.Animal;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;
import static org.junit.Assert.assertEquals;
public class FelineTest {
    @Mock
    Feline feline;
    @Before
    public void setUp(){
        feline = new Feline();
    }
    @Test
    public void getFamilyTest(){
        String actualResult = feline.getFamily();
        String expectedResult = "Кошачьи";
        assertEquals("",expectedResult,actualResult);
    }
    @Test
    public void eatMeatTest() throws Exception{
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected,actual);
    }
    @Test
    public void eatGrassTest() throws Exception{
        List<String> expected = List.of("Трава", "Различные растения");
        List<String> actual = feline.getFood("Травоядное");
        assertEquals(expected,actual);
    }
    @Test
    public void getKittensOne(){
        int expectedKittensOne = 1;
        int actualKittensOne = feline.getKittens();
        assertEquals("Колличество не сходится",expectedKittensOne,actualKittensOne);
    }
    @Test
    public void getKittensMoreOne(){
        int expectedKittensCount = 3;
        int actualKittensCount = feline.getKittens(3);
        assertEquals("Количество не сходится",expectedKittensCount,actualKittensCount);
    }
}
