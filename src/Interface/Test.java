package Interface;

public class Test {
    public static void main(String[] args) {

                ClimateControl acSystem = new Airconditioningsystem();
                acSystem.setTemperature(22);
                acSystem.startCooling();

                EntertainmentSystem audiosystem = new audiosystem();
                audiosystem.playMedia("Music");
                audiosystem.adjustVolume(20);
            }
        }


