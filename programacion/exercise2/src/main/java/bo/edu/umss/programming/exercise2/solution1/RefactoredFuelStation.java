package bo.edu.umss.programming.exercise2.solution1;

import java.util.List;

public class RefactoredFuelStation implements SiteAsset{
    private String location;
    private List<Asset> assets;

    @Override
    public String name() {
        return "Fuel Dispenser";
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public List<Asset> getAssets() {
        return assets;
    }

    @Override
    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    @Override
    public String toString() {
        return "RefactoredFuelStation{" +
                "location='" + location + '\'' +
                ", assets=" + assets +
                '}';
    }
}