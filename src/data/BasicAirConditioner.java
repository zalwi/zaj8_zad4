package data;

public class BasicAirConditioner extends AirConditioner{

    private static final int COOLING=1;

    public BasicAirConditioner(double temperature, Room room) {
        super(temperature, room);
        super.setPower(1);
    }
}
