package OutputDevices;

public class Monitor
{
    private int idMonitor;
    private static int mCount;
    private String brand;
    private float size;

    Monitor(){
        setIdMonitor(Monitor.mCount++);
        setBrand("");
        setSize(0);
    }

    public Monitor(String brand, float size){
        setIdMonitor(Monitor.mCount++);
        setBrand(brand);
        setSize(size);
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public float getSize()
    {
        return size;
    }

    public void setSize(float size)
    {
        this.size = size;
    }

    public int getIdMonitor()
    {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor)
    {
        this.idMonitor = idMonitor;
    }

    @Override
    public String toString()
    {
        StringBuilder sB = new StringBuilder();
        sB.append("Monitor ID: ").append(idMonitor)
                .append("\nBrand: ").append(brand)
                .append("\nSize: ").append(size);

        return sB.toString();
    }
}
