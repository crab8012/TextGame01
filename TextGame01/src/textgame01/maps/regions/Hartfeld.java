package textgame01.maps.regions;

import textgame01.maps.Map;
import textgame01.maps.tiles.Tile;
import textgame01.maps.tiles.TownHall;

public class Hartfeld extends Map{
    //This is the starting region. It will be filled with stuff.
    //+----------++--------------------------+-----------------------+
    //|A==B==C==D||A:Town Hall               |":Road, Vertical       |
    //|"=E==F==G=||B:Player Bank             |=:Road, Horizontal     |
    //|"==H==I=J=||C:Blade Weapons Shop      |W:Wilderness           |
    //|WWWWWWWWWW||D:Ranged Weapons Shop     |Z:Player House         |
    //|WWWWWWWWWW||E:Food Shop               |                       |
    //|WWWWWWWWWW||F:Player Marketplace      |                       |
    //|WWWWWWWWWW||G:Combat Technology Shop  |                       |
    //|WWWWWWWWWW||H:Region Teleporter       |                       |
    //|WWWWWWWWWW||I:Real-Estate Broker      |                       |
    //|WWWWWWWWWW||J:Safe House              |                       |
    //+----------++--------------------------+-----------------------+
    
    private static Tile[][] regionMap = new Tile[10][10];
    public Hartfeld(){
        regionMap[0][0] = new TownHall("Archton Town Hall");
    }
    public Tile getTile(int x, int y){
        return regionMap[x][y];
    }
}

