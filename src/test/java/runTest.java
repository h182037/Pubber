import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class runTest {

    @Test
    public void emptyTest() throws Exception {
        String s = "always green";
        assertThat(s).isEqualTo("always green");
    }
}
