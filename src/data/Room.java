package data;

public class Room {
    private int number;
    private double currentTemperature;
    private double volume;
    private AirConditioner airConditioner;

    public Room(int number, double currentTemperature, double volume, int setAirConditionerTemp, boolean isProCooling) {
        this.number = number;
        this.currentTemperature = currentTemperature;
        this.volume = volume;
        if(isProCooling)
            this.airConditioner =  new ProAirConditioner(setAirConditionerTemp,this);
        else
            this.airConditioner =  new BasicAirConditioner(setAirConditionerTemp,this);
    }

    public int getNumber() {
        return number;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }
}
