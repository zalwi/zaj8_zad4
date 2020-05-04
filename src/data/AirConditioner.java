package data;

public class AirConditioner {
    private double temperature;
    private Room room;

    

    public AirConditioner(double temperature, Room room) {
        this.temperature = temperature;
        this.room = room;
    }
    public void decreaseTemperature(){

    }
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Room getRoom() {
        return room;
    }
}
