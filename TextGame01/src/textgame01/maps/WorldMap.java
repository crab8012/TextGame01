package textgame01.maps;

import textgame01.maps.regions.*;

public class WorldMap {
    public Map[][] worldMap = new Map[4][4];//Create a new World Map with 4 smaller region maps.
    
    public WorldMap(){
        //Add all of the region maps to the world maps.
        
        //+-----------------------------------+
        //|::::::::::::Region Maps::::::::::::|
        //+-------+--------+--------+---------+
        //|Archton|Entrine |Instrain|Mintfresh|
        //|Bentray|Farshale|Jokestyn|Norflocks|
        //|Cartent|Greatwin|Keldon  |Octonine |
        //|Dornaw |Hartfeld|Limmermo|Pertained|
        //+-------+--------+--------+---------+
        
        //Row 1
        worldMap[0][0] = new Archton();
        worldMap[0][1] = new Bentray();
        worldMap[0][2] = new Cartent();
        worldMap[0][3] = new Dornaw();
        
        //Row 2
        worldMap[1][0] = new Entrine();
        worldMap[1][1] = new Farshale();
        worldMap[1][2] = new Greatwin();
        worldMap[1][3] = new Hartfeld();
        
        //Row 3
        worldMap[2][0] = new Instrain();
        worldMap[2][1] = new Jokestyn();
        worldMap[2][2] = new Keldon();
        worldMap[2][3] = new Limmermo();
        
        //Row 4
        worldMap[3][0] = new Mintfresh();
        worldMap[3][1] = new Norflocks();
        worldMap[3][2] = new Octonine();
        worldMap[3][3] = new Pertained();
    }
    
    public Map getRegion(int x, int y){
            return this.worldMap[x][y];
    }
}
