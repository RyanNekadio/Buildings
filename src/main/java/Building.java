import java.time.LocalDate;

public abstract class Building {

    protected String companyName;
    protected String location;
    protected LocalDate dateOfConstruction;
    protected int numberOfRooms;

    public Building(String companyName,
                    String location,
                    LocalDate dateOfConstruction,
                    int numberOfRooms){
        this.companyName = companyName;
        this.location = location;
        this.dateOfConstruction = dateOfConstruction;
        this.numberOfRooms = numberOfRooms;
    }

    public Building(){
    }

    public String constructionInformation(){
        return "This building was constructed in " + this.dateOfConstruction +
                " by " + this.companyName + " and is located in " + this.location + ".";
    }

    public String furtherInformation(){
        return "This building has " + this.numberOfRooms + " rooms.";
    }

}
