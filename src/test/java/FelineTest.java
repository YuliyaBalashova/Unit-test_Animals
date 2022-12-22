import org.junit.Test;
import static org.junit.Assert.*;
import com.example.*;
import java.util.Arrays;
import java.util.List;

public class FelineTest {
    Feline testFeline = new Feline();

    // проверка, что метод возвращает ("Животные", "Птицы", "Рыба")
    @Test
    public void eatMeatReturn() throws Exception {
        List<String> actual = testFeline.eatMeat();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected,actual);
    }

    // проверка, что метод возвращает значение "Кошачьи"
    @Test
    public void getFamilyReturn() {
        String actual = testFeline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected,actual);
    }

    // проверка что метод возвращает значение 1
    @Test
    public void getKittensOneCountReturn() {
        int actual = testFeline.getKittens();
        int expected = 1;
        assertEquals(expected,actual);
    }
}