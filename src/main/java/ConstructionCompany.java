import java.util.ArrayList;

public class ConstructionCompany {

    private ArrayList<Building> buildings;

    public ConstructionCompany(){
        this.buildings = new ArrayList<>();
    }

    public int countBuildings(){
        return this.buildings.size();
    }

    public void addBuilding(Building building){
        this.buildings.add(building);
    }

}
