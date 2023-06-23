package InputDevices;

public class InputDevice
{
    protected String inputType;
    protected String brand;

    public InputDevice(String inputType, String brand){
        this.inputType = inputType;
        this.brand = brand;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getInputType()
    {
        return inputType;
    }

    public void setInputType(String inputType)
    {
        this.inputType = inputType;
    }
}
