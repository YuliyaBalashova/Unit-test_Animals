import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.example.*;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@RunWith(Parameterized.class)
public class FelineTest {

    private final String animalKind;
    private final int kittensCount;

    //конструктор тестового класса
    public FelineTest(String animalKind, int kittensCount) {
        this.animalKind = animalKind;
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters()
    public static Object[][] getData() {
        //тестовые данные
        return new Object[][] {
                {"Хищник", 1},
                {"Хищник", 0},
                {"Хищник", 2},
                //  {"Птица", 5},
                {"Травоядное", 40},
        };
    }

    Feline testFeline = new Feline();

    // проверка, что метод List<String> getFood("Хищник") выводит ("Животные", "Птицы", "Рыба"/"Трава", "Различные растения")
    @Test
    public void getFoodFelineReturn() throws Exception {
        List<String> actual = testFeline.getFood(animalKind);
        if (Objects.equals(animalKind, "Хищник")) {
            List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
            assertEquals(actual, expected);
        } if (Objects.equals(animalKind, "Травоядное")) {
            List<String> expected = Arrays.asList("Трава", "Различные растения");
            assertEquals(actual, expected);
        }
    }

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

    // проверка возвращения значения, заданного как параметр (параметризованный тест)
    @Test
    public void getKittensCountReturn() {
        int actual = testFeline.getKittens(kittensCount);
        int expected = kittensCount;
        assertEquals(expected, actual);
    }
}