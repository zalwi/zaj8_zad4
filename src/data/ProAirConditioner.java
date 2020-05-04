package data;

public class ProAirConditioner extends AirConditioner{

    private static final int COOLING=2;

    public ProAirConditioner(double temperature, Room room) {
        super(temperature, room);
    }

    @Override
    public void decreaseTemperature(){
        double  currentTemperature = getRoom().getCurrentTemperature(),
                newTemperature = currentTemperature - (this.COOLING/getRoom().getVolume());
        if(currentTemperature > newTemperature){
            getRoom().setCurrentTemperature(newTemperature);
            System.out.println("Pokój nr: " + getRoom().getNumber() +
                                " schłodzony, aktualna temperatura: " +
                                getRoom().getCurrentTemperature());
        }else{
            getRoom().setCurrentTemperature(super.getTemperature());
            System.out.println("W pokoju nr: " + getRoom().getNumber() +
                                " nie można już obniżyć temperatury - osiągnięto limit: " +
                                getRoom().getCurrentTemperature());
        }
    }

}
