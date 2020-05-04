package data;

public class AirConditioner {
    private double temperature;
    private Room room;
    private int power;

    public AirConditioner(double temperature, Room room) {
        this.temperature = temperature;
        this.room = room;
        this.power = 0;
    }

    public void decreaseTemperature(){
        if(power==0) return;
        double  currentTemperature = getRoom().getCurrentTemperature(),
                newTemperature = currentTemperature - (power/getRoom().getVolume());
        if(temperature < newTemperature){
            getRoom().setCurrentTemperature(newTemperature);
            System.out.println("Pokój nr: " + getRoom().getNumber() +
                    " schłodzony, aktualna temperatura: " +
                    getRoom().getCurrentTemperature());
        }else{
            getRoom().setCurrentTemperature(getTemperature());
            System.out.println("W pokoju nr: " + getRoom().getNumber() +
                    " nie można już obniżyć temperatury - osiągnięto limit: " +
                    getRoom().getCurrentTemperature());
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public Room getRoom() {
        return room;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
