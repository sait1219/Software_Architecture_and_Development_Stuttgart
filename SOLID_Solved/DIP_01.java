package SOLID;


public class DIP_01 {

    
    public interface Switchable {
        void turnOn();
        void turnOff();
    }

    
    public static class LightBulb implements Switchable {
        @Override
        public void turnOn() {
            System.out.println("Light is ON!");
        }

        @Override
        public void turnOff() {
            System.out.println("Light is OFF!");
        }
    }

    
    public static class Switch {
        private Switchable device;
        private boolean isOn = false;

        public Switch(Switchable device) {
            this.device = device;
        }

        public void operate() {
            if (isOn) {
                device.turnOff();
            } else {
                device.turnOn();
            }
            isOn = !isOn;
        }
    }

    public static void main(String[] args) {
        Switchable bulb = new LightBulb();          
        Switch lightSwitch = new Switch(bulb);      
        lightSwitch.operate();                      
        lightSwitch.operate();                      
    }
}
