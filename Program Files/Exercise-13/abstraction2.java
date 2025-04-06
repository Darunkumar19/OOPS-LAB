abstract class SmartDevice {
    abstract void turnOn();
    abstract void turnOff();
}

class SmartTV extends SmartDevice {
    void turnOn() {
        System.out.println("Smart TV is now ON.");
    }
    void turnOff() {
        System.out.println("Smart TV is now OFF.");
    }
}

class SmartSpeaker extends SmartDevice {
    void turnOn() {
        System.out.println("Smart Speaker is now ON.");
    }
    void turnOff() {
        System.out.println("Smart Speaker is now OFF.");
    }
}

public class abstraction2 {
    public static void main(String[] args) {
        SmartDevice d1 = new SmartTV();
        SmartDevice d2 = new SmartSpeaker();
        d1.turnOn();
        d1.turnOff();
        d2.turnOn();
        d2.turnOff();
    }
}
