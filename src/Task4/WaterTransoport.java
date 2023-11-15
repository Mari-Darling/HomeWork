package Task4;

public abstract class WaterTransoport extends Vehicle {
    private boolean underWater;
    public WaterTransoport(int horsePower, int speed, boolean hadEngine, boolean hasDrowned) {
        super(horsePower, speed, hadEngine);
        this.underWater = hasDrowned;
    }
    public void hasDrowned(){
        System.out.println(underWater);;
    }

}
