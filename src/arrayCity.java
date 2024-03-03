public class arrayCity {
    City toCity;
    int cost;

    public arrayCity(City toCity, int cost){
        this.toCity = toCity;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return toCity.name + ": стоимость " + cost;
    }
}
