package Task5;

public class Main {
    public static void main(String[] args) {
        SportCar ferrari = new SportCar(650,350,true,4,"red","Ferrari","Ferrari S.p.A.");
        Suv hammer = new Suv(315,150,true,4,"black","Hammer","H2");
        ElectroScoter electroScoter = new ElectroScoter(100,"Dualtron 2","Ultra",true);
        RegularScooter regularScooter = new RegularScooter(30,"Razor","Beast V6",false);
        MountainBike mountainBike = new MountainBike(20,"Cube","Acid 29", 12);
        RoadBike roadBike = new RoadBike(40,"Scott Foil","RC Pro", 24);

        System.out.println(ferrari.color);
        System.out.println(hammer.model);
        System.out.println(electroScoter.brand);
        System.out.println(regularScooter.speed);
        System.out.println(mountainBike.howManySpeeds);
        System.out.println(roadBike.speed);
    }
}
