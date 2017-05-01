package textgame01;

import java.util.Scanner;
import textgame01.entities.Player;
import textgame01.maps.Map;
import textgame01.maps.WorldMap;
import textgame01.maps.tiles.Tile;

public class TextGame01 {

    private static Scanner reader = new Scanner(System.in);//Setup the User Input
    public static Player player;
    public static WorldMap map = new WorldMap();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This game is currently a work in progress. Please keep that in mind as you play through it. \n");
        playerSetup();
        
    }
    public static void playerSetup(){
        System.out.println("What is your player's name?");
        String name = reader.nextLine();
        System.out.println("You have selected " + name + " as your player's name. Good luck!");
        int[] location = {0,0, 0, 0};
        player = new Player(name, 5, 10, 1, location, 100);
        System.out.println("Your player is: \n" + player);
        System.out.println("\n You will now spawn into the game world. Good Luck, " + player.getName() +"\n");
    }
    
    public static void describeSurroundings(){
        Map region = map.getRegion(player.getLocation()[0], player.getLocation()[1]);
        Tile x = region.getTile(0, 0);
        System.out.println("You are currentily at the " + x.toString());
    }
    
    public static void saveList(){
        //GameSaves will be supported in the future
        //Remember to implement java.io.Serializable
    }
    
}
