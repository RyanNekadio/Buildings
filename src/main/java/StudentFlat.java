import java.time.LocalDate;

public class StudentFlat extends Building {

    private long numberOfPartiesHosted;

    public StudentFlat(String companyName,
                       String location,
                       LocalDate dateOfConstruction,
                       int numberOfRooms,
                       long numberOfPartiesHosted){
        super(companyName,
                location,
                dateOfConstruction,
                numberOfRooms);
        this.numberOfPartiesHosted = numberOfPartiesHosted;
    }

    @Override
    public String constructionInformation(){
        return "Mayflower was constructed in " + this.dateOfConstruction +
                " by " + this.companyName + " and is located in " + this.location + ".";
    }

    @Override
    public String furtherInformation(){
        return "Mayflower is a " + this.numberOfRooms + " bedroom student flat.";
    }

    public String typeOfFlat() {
        return this.numberOfPartiesHosted > 10 ? "Party Flat!" : "Quiet Flat!";
    }

}
