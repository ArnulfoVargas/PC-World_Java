import PC.PC;
import InputDevices.*;
import OutputDevices.Monitor;

public class Main
{
    public static void main(String[] args)
    {
        Keyboard keyboard1 = new Keyboard("USB", "Corsair");
        Keyboard keyboard2 = new Keyboard("USB-C", "Razer");

        Mouse mouse1 = new Mouse("USB", "Logitech");
        Mouse mouse2 = new Mouse("USB", "Cooler Master");

        Monitor monitor1 = new Monitor("AOC", 24);
        Monitor monitor2 = new Monitor("LG", 26);

        PC pc1 = new PC("Terminator", keyboard2, mouse1, monitor2);
        PC pc2 = new PC("Beginator", keyboard1, mouse2, monitor1);

        System.out.println(pc1);
        System.out.println(pc2);
    }
}