import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StudentFlatTest {

    StudentFlat mayflower;

    @BeforeEach
    void setUp(){
        mayflower = new StudentFlat("CityWorks",
                "Southampton",
                LocalDate.of(2015,10,15),
                6,
                9);
    }

    @Test
    void hasConstructionInformation(){
        assertThat(mayflower.constructionInformation()).isEqualTo("Mayflower " +
                "was constructed in 2015-10-15 by CityWorks and is located in Southampton.");
    }

    @Test
    void hasFurtherInformation(){
        assertThat(mayflower.furtherInformation()).isEqualTo("Mayflower is a 6 bedroom student flat.");
    }

    @Test
    void isAPartyFlat(){
        assertThat(mayflower.typeOfFlat()).isEqualTo("Quiet Flat!");
    }


}

