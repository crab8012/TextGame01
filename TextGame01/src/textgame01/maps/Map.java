package textgame01.maps;

import textgame01.maps.tiles.Tile;

public abstract class Map {
    public abstract Tile getTile(int x, int y);
}
