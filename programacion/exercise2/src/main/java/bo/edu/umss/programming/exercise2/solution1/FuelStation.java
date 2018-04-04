package bo.edu.umss.programming.exercise2.solution1;

import java.util.List;

public class FuelStation implements Site {
    private String location;
    private List<Asset> assets;

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
        return "FuelStation{" +
                "location='" + location + '\'' +
                ", assets=" + assets +
                '}';
    }
}
