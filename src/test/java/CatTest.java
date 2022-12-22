import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;
import com.example.*;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

     @Mock
     Feline feline;

    @Test
    public void getFoodTest() throws Exception {
        Cat testCat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> actualFood = testCat.getFood();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, actualFood);
    }
    @Test
    public void getSoundTest() {
        Cat testCat = new Cat(feline);
        String actualSound = testCat.getSound();
        String expectedSound = "Мяу";
        assertEquals(expectedSound,actualSound);
    }
}