public class DurItem extends Item{
    private int playingTime;
    
    public DurItem(String theTitle, int time)
    {
        super(theTitle);
        playingTime = time;
    }

    

    /**
     * Print details about this item to the text terminal.
     */
    public void print()
    {
        super.print();
        System.out.println("Playing time: " + playingTime);
    }
}
