
public class VideoGame extends Item
{
    private String studio;
    public VideoGame(String theTitle, String studio){
        super(theTitle);
        this.studio=studio;
    }
    
    public void print(){
        super.print();
        System.out.println("studio: "+studio);
    }
}
        
    