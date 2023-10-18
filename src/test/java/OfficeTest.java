import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OfficeTest {

    Office brightNetwork;

    @BeforeEach
    void setUp(){
        brightNetwork = new Office("Arcadis",
                "London",
                LocalDate.of(2005, 07, 20),
                10);
    }

    @Test
    void hasContactInformation(){
        assertThat(brightNetwork.constructionInformation()).isEqualTo(
                "This office " +
                        "was constructed in 2005-07-20 by Arcadis and is located in London.");
    }

    @Test
    void hasFurtherInformation(){
        assertThat(brightNetwork.furtherInformation()).isEqualTo("This office has 10 rooms.");
    }









}
