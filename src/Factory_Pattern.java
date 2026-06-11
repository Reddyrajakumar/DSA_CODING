public class Factory_Pattern {
    public static void main(String[] args) {
        vehicle obj=VehicleFactory.getVehicle("car");
        obj.drive();
    }
}

interface vehicle{
    void drive();
}

class car implements vehicle{
    public void drive(){
        System.out.println("Driving car");
    }
}
class bike implements vehicle{
    public void drive(){
        System.out.println("Drive bike");
    }
}

class VehicleFactory {
    public static vehicle getVehicle(String s){
        if(s.equalsIgnoreCase("car")){
            return new car();
        } else if (s.equalsIgnoreCase("bike")) {
            return new bike();
        }
        return null;
    }
}
