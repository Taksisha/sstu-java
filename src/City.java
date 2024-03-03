import java.util.ArrayList;

public class City {
    String name;
    ArrayList<arrayCity> arrayCities;

    public City(String name){
        this.name = name;
        this.arrayCities = new ArrayList<>();
    }

    public String toString(){
        String result = "Из города " + name + " можно поехать в города: \n";
        for (arrayCity arrayCity : arrayCities){
            result += arrayCity + "\n";
        }
        return result;
    }
}
