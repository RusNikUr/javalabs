package task1;

public class House {
    private int floors;

    public House(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        String word;

        int lastTwo = floors % 100;
        int lastOne = floors % 10;

        if (lastTwo >= 11 && lastTwo <= 14) {
            word = "этажами";
        } else if (lastOne == 1) {
            word = "этажом";
        } else {
            word = "этажами";
        }

        return "дом с " + floors + " " + word;
    }
}
