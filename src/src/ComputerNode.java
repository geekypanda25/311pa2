import org.junit.runner.Computer;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class ComputerNode {

    private int ID, timestamp;
    private List<ComputerNode> outNeighbors;

    // DFS variables
    private Color color;
    private ComputerNode prev;
    private int cc;

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

    public void addNeighbor(ComputerNode n){
        outNeighbors.add(n);
    }

    public void setPrev(ComputerNode prev){
        this.prev = prev;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public void setCC(int cc){
        this.cc = cc;
    }

    public Color getColor(){return color;}

    public int getCC(){return cc;}

    /**
     * Test ComputerNode equalit based on ID and timestamp fields
     * @param o - ComputerNode object to compare to
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {

        // Return true if object is compared with itself
        if(o == this) return true;

        // Return false if trying to compare with a non ComputerNode object
        if(!(o instanceof ComputerNode)) {
            return false;
        }

        // Typecast to ComputerNode
        ComputerNode other = (ComputerNode) o;

        // Compare with ID and timestamp
        return other.getID() == this.getID() &&
                other.getTimestamp() == this.getTimestamp();
    }
}
