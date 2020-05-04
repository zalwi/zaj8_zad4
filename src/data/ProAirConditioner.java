package data;

public class ProAirConditioner extends AirConditioner{

    public ProAirConditioner(double temperature, Room room) {
        super(temperature, room);
        super.setPower(2);
    }

}
