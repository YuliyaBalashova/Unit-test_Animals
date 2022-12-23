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
public class LionAlexTest {

    @Mock
    Food food;

    @Mock
    Kittens kittens;

    @Test
    public void getFoodTest() throws Exception {
        String sex = "Самец";
        LionAlex lionAlex = new LionAlex(sex, kittens, food);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(food.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lionAlex.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getKittensTest(){
        LionAlex lionAlex = new LionAlex();
        int actual = lionAlex.getKittens();
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    public void doesHaveMane(){
        LionAlex lionAlex = new LionAlex();
        boolean actual = lionAlex.doesHaveMane();
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    public void getFriendsTest(){
        LionAlex lionAlex = new LionAlex();
        List<String> actual = lionAlex.getFriends();
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        assertEquals(expected,actual);
    }

    @Test
    public void getPlaceOfLivingTest(){
        LionAlex lionAlex = new LionAlex();
        String actual = lionAlex.getPlaceOfLiving();
        String expected = "Нью-Йоркский зоопарк";
        assertEquals(expected,actual);
    }
}
