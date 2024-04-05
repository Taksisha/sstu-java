import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class City {
    String name;
    Map<City, Integer> roads;

    public City(String name) {
        this.name = name;
        this.roads = new HashMap<>();
    }

    public void addRoad(City city, int cost) {
        roads.put(city, cost);
        city.roads.put(this, cost); // Ensure bidirectional road
    }

    public void removeRoad(City city) {
        roads.remove(city);
        city.roads.remove(this);
    }

    @Override
    public String toString() {
        String result = "From city " + name + " you can travel to: \n";
        for (Map.Entry<City, Integer> entry : roads.entrySet()) {
            result += entry.getKey().name + ": cost " + entry.getValue() + "\n";
        }
        return result;
    }
}