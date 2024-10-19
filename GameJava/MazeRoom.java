public class MazeRoom {
    private String description;
    private MazeRoom northExit, southExit, eastExit, westExit;

    public MazeRoom(String description) {
        this.description = description;
    }

    public void setExits(MazeRoom north, MazeRoom south, MazeRoom east, MazeRoom west) {
        northExit = north;
        southExit = south;
        eastExit = east;
        westExit = west;
    }

    public String getDescription() {
        return description;
    }

    public MazeRoom getExit(String direction) {
        if(direction.equals("north")) return northExit;
        if(direction.equals("south")) return southExit;
        if(direction.equals("east")) return eastExit;
        if(direction.equals("west")) return westExit;
        return null;
    }
}
