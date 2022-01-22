import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.bonus.BonusService;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    void shouldCalculateCsvFileSource(String testName, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();
    }
}