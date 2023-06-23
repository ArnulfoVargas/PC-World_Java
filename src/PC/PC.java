package PC;
import InputDevices.*;
import OutputDevices.Monitor;

public class PC
{
    private int idComputer;
    private static int cCount;
    private String name;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    PC(){
        setIdComputer(PC.cCount++);
        setName("");
        setKeyboard(null);
        setMouse(null);
        setMonitor(null);
    }
    public PC(String name, Keyboard keyboard, Mouse mouse, Monitor monitor){
        setIdComputer(PC.cCount++);
        this.setName(name);
        this.setKeyboard(keyboard);
        this.setMouse(mouse);
        this.setMonitor(monitor);
    }

    public int getIdComputer()
    {
        return idComputer;
    }

    public void setIdComputer(int idComputer)
    {
        this.idComputer = idComputer;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard)
    {
        this.keyboard = keyboard;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public void setMouse(Mouse mouse)
    {
        this.mouse = mouse;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }

    public void setMonitor(Monitor monitor)
    {
        this.monitor = monitor;
    }

    @Override
    public String toString()
    {
        StringBuilder sB = new StringBuilder();
        sB.append("PC ID: ").append(idComputer)
                .append("\nName: ").append(name).append("\n")
                .append(keyboard.toString()).append("\n")
                .append(mouse.toString()).append("\n")
                .append(monitor.toString()).append("\n");

        return sB.toString();
    }
}
