package InputDevices;

public class Keyboard extends InputDevice
{
    private int keyboardID;
    private static int kCount;

    public Keyboard(String inputType, String brand){
        super(inputType,brand);
        keyboardID = Keyboard.kCount++;
    }

    @Override
    public String toString()
    {
        StringBuilder sB = new StringBuilder();
        sB.append("Keyboard ID: ").append(keyboardID)
                .append("\nBrand: ").append(brand)
                .append("\nInput type: ").append(inputType);

        return sB.toString();
    }
}
