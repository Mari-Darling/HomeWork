package Task2;

public class Elevator {

    public final static int capcity = 200;
    public final static int maxFloor = 18;
    int currentFloor;


    public Elevator(int curtFloor) {
        this.currentFloor = curtFloor;
    }

    void move(int bFloor, int toFloor) {
        if(toFloor > bFloor){
            for (int i = bFloor; i <= toFloor; i++) {
                System.out.println("вы на этаже " + i);
            }
        } else if (toFloor < bFloor) {
            for (int i = bFloor; i >= toFloor; i--) {
                System.out.println("вы на этаже " + i);
            }
        }
        else {
            System.out.println("вы уже на этаже " + bFloor);
        }

    }

    static boolean isAllowableWeight(int weight) {
        return weight <= capcity;
    }

    static boolean isAllowableFloor(int floor) {
        return floor <= maxFloor;
    }

}
