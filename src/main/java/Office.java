import java.time.LocalDate;

public class Office extends Building {

    public Office(String companyName,
                  String location,
                  LocalDate dateOfConstruction,
                  int numberOfRooms) {
        super(companyName,
                location,
                dateOfConstruction,
                numberOfRooms);
    }

    @Override
    public String constructionInformation(){
        return "This office was constructed in " + this.dateOfConstruction +
                " by " + this.companyName + " and is located in " + this.location + ".";
    }

    @Override
    public String furtherInformation(){
        return "This office has " + this.numberOfRooms + " rooms.";
    }







}
