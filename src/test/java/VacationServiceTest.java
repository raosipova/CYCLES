import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.mvnjava.javamvn.service.VacationService;

public class VacationServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Test.csv")
    public void testCalculateCount(int income, int expenses, int threshold, int expected) {
        VacationService calc = new VacationService();
        //int expected = 3;
        int actual = calc.calculation(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}


