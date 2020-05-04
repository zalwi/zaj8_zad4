import data.AirConditioner;
import data.Room;

public class Hotel {
    public static void main(String[] args) {
        Room    room1 = new Room(1,23,10, 21, true),
                room2 = new Room(2,22,10, 21, false);

        for(int i=0; i<12; i++){
            room1.getAirConditioner().decreaseTemperature();
            //room2.getAirConditioner().decreaseTemperature();
        }
    }
}
