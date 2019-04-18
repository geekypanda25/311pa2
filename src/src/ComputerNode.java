import java.util.LinkedList;
import java.util.List;

public class ComputerNode {

    private int ID, timestamp;
    private List<ComputerNode> outNeighbors;

    public ComputerNode(int ID, int timestamp) {
        this.ID = ID;
        this.timestamp = timestamp;
        this.outNeighbors = new LinkedList<>();
    }


    public int getID() {
        return ID;
    }


    public int getTimestamp() {
        return timestamp;
    }


    public List<ComputerNode> getOutNeighbors() {
        return outNeighbors;
    }

    //--------------HELPER METHODS GO BELOW------------------------


}
