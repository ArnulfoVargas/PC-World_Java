package Order;

import PC.PC;

public class Order
{
    private static int idCounter;
    private int id;
    private int indexCounter;
    private final static int MaxPC = 10;
    private PC PCs[];

    public Order(){
        this.id = Order.idCounter++;
        this.indexCounter = 0;
        this.PCs = new PC[Order.MaxPC];
    }

    public void AddPC(PC pc){
        if (indexCounter < Order.MaxPC)
            this.PCs[this.indexCounter++] = pc;
    }

    public void ShowOrder(){
        for (int i = 0; i < indexCounter; i++)
        {
            System.out.println("PC " + i + ": " + this.PCs[i].toString() + "\n");
        }
    }
}
