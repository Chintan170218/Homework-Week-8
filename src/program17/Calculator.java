package program17;

// Calculator Class to calculate Total Cost

public class Calculator {

    // Creating methods for floor and carpet to call into the main class
    public Floor floor;
    public Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {

        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){

        return floor.getArea() * carpet.getCost();
    }
}


