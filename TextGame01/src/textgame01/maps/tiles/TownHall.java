package textgame01.maps.tiles;

public class TownHall extends Tile{
    private String name;
    private String description;
    
    public TownHall(String name){
        this.name = name;
        this.description = "A town hall, such as this one, can provide helpful information as well as resources, instruction, and updates. It would be wise to visit a town hall every now and then.";
        
    }
    public TownHall(String name, String description){
        this.name = name;
        this.description = description;
    }
    
    public String toString(){
        return(name + ": " + description);
    }
}
