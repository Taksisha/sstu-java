public class House {
    private int floors;

    House(int floors){
        if(floors<0){
            throw new IllegalArgumentException("Номер этажа не может быть отрицательным");
        }
        this.floors = floors;
    }

    public String toString() {
        if (floors % 10 == 1 && floors % 100 != 11) {
            return "дом с " + floors + " этажем";
//Если количество этажей заканчивается на числа от 2 до 4, но не попадает в исключения 10-20 (например, 2-4, 22-24, 32-34 и т.д.)
        } else if (floors % 10 >= 2 && floors % 10 <= 4 && (floors % 100 < 10 || floors % 100 >= 20)) {
            return "дом с " + floors + " этажами";
        } else {
            return "дом с " + floors + " этажами";
        }
    }
}
