import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConstructionCompanyTest {

    ConstructionCompany constructionCompany;

    @BeforeEach
    void setUp(){
        constructionCompany = new ConstructionCompany();
    }

    @Test
    void canCountBuildings() {
        assertThat(constructionCompany.countBuildings()).isEqualTo(0);
    }

    @Test
    void canAddMultipleBuildings() {
        Bungalow bungalow = new Bungalow("CityWorks",
                "London",
                LocalDate.of(1965,06,14),
                5,
                true);
        StudentFlat mayflower = new StudentFlat("Arcadis",
                "Southampton",
                LocalDate.of(2016, 4, 20),
                7,
                11);
        constructionCompany.addBuilding(bungalow);
        constructionCompany.addBuilding(mayflower);
        assertThat(constructionCompany.countBuildings()).isEqualTo(2);
    }

}
