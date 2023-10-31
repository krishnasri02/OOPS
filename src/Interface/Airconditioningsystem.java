package Interface;

public class Airconditioningsystem implements ClimateControl{

    @Override
    public void setTemperature(int temperature) {
        System.out.println("AirConditioningsystem : The temperature is set to " + temperature);



    }

    @Override
    public void startCooling() {
        System.out.println("AirConditioningSystem : Cooling started");



    }

    @Override
    public void stopCooling() {
        System.out.println("AirConditioningSystem : Cooling stopped");



    }



}
