package Task4;

public abstract class AirTransport extends Vehicle{

    private boolean isFlying;
    public AirTransport(int horsePower, int speed, boolean hadEngine, boolean isFlying) {
        super(horsePower, speed, hadEngine);
        this.isFlying = isFlying;
    }
    public void isOnAir(){
        System.out.println(this.isFlying);
    }
}
