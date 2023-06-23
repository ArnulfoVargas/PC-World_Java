package InputDevices;

public class Mouse extends InputDevice
{
    private int mouseID;
    private static int mCount;

    public Mouse(String inputType, String brand){
        super(inputType, brand);

        mouseID = Mouse.mCount++;
    }

    @Override
    public String toString()
    {
        StringBuilder sB = new StringBuilder();
        sB.append("Mouse ID: ").append(mouseID)
                .append("\nBrand: ").append(brand)
                .append("\nInput type: ").append(inputType);

        return sB.toString();
    }
}
