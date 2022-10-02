package uet.oop.bomberman.map;

import java.util.ArrayList;
import java.util.List;

public class Map extends loadMap {
    protected int Level;
    protected static List<String> map = new ArrayList<>();

    public Map() {
    }

    public Map(int level) {
        this.Level = level;
        map = load(level);
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public void setMap(List<String> map) {
        this.map = map;
    }

    public List<String> getMap() {
        return map;
    }

    public void printMap() {
        map = Map.load(Level);
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }
    }
}
