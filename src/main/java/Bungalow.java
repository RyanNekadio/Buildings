import java.time.LocalDate;

public class Bungalow extends Building{

    private boolean central_heating;
    public Bungalow(String companyName,
                    String location,
                    LocalDate dateOfConstruction,
                    int numberOfRooms,
                    boolean central_heating){
        super(companyName,
                location,
                LocalDate.of(1989, 05, 13),
                5);
        this.central_heating = central_heating;
    }
    @Override
    public String constructionInformation(){
        return "This bungalow was constructed in " + this.dateOfConstruction +
                " by " + this.companyName + " and is located in " + this.location + ".";
    }

    @Override
    public String furtherInformation(){
        return "This is a " + this.numberOfRooms + " bedroom bungalow.";
    }

    public boolean getCentralHeating() {
        return this.central_heating;
    }
}
