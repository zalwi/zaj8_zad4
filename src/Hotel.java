import data.AirConditioner;
import data.Room;

public class Hotel {
    public static void main(String[] args) {
        Room    room1 = new Room(1,23,10, 21, true),
                room2 = new Room(2,22,10, 21, false);

        System.out.println("Pokój 1 - temperatura początkowa: " + room1.getCurrentTemperature());
            for(int i=0; i<11; i++){room1.getAirConditioner().decreaseTemperature();}
        System.out.println("-----\n" +
                            "Pokój 2 - temperatura początkowa: " + room2.getCurrentTemperature());
            for(int i=0; i<10; i++){room2.getAirConditioner().decreaseTemperature();}

    }
}
