import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BungalowTest {

    Bungalow bungalow;

    @BeforeEach
    void setUp(){
        bungalow = new Bungalow("JBG",
                "Epping Forest",
                LocalDate.of(1989, 05, 13),
                5,
                false);
    }

    @Test
    void hasConstructionInformation(){
        assertThat(bungalow.constructionInformation()).isEqualTo("This bungalow " +
                "was constructed in 1989-05-13 by JBG and is located in Epping Forest.");
    }

    @Test
    void hasFurtherInformation(){
        assertThat(bungalow.furtherInformation()).isEqualTo("This is a 5 bedroom bungalow.");
    }

    @Test
    void hasHeatingInstalled(){
        assertThat(bungalow.getCentralHeating()).isEqualTo(false);
    }

}
