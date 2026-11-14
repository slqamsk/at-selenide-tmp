import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Selenide;

public class TmpTests {
    @Test
    void test01() {
        Selenide.open("https://slqa.ru/demo/slshop/v02/");
    }
}
