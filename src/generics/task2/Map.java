package generics.task2;

public class Map {
    public Map() {
    }

    MyEntry<Map,Map> mapMyEntry = new MyEntry<>();
    Map map = new Map();

    public void setMap(Map map) {
        this.map = map;
    }

}
