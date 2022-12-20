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
public class LionTest {

    @Mock
    Food food;

    @Mock
    Kittens kittensCount;

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(food);
        Mockito.when(food.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> actualFood = lion.getFood();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getKittensTestStab(){
        Lion lion = new Lion(kittensCount);
        Mockito.when(kittensCount.getKittens()).thenReturn(1);
        int actualKittenCount = lion.getKittens();
        int expectedKittenCount = 1;
        Assert.assertEquals(expectedKittenCount, actualKittenCount);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        String sex = "Самец";
        Lion lion = new Lion(sex);
        Boolean actual = lion.doesHaveMane();
        assertEquals(actual,true);
    }

    @Test
    public void doesNotHaveManeTest() throws Exception {
        String sex = "Самка";
        Lion lion = new Lion(sex);
        Boolean actual = lion.doesHaveMane();
        assertEquals(actual,false);
    }
}