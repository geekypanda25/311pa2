import java.awt.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class CommunicationsMonitor {

    private List<Triple> R;
    private int numComputers;
    private HashMap<Integer, List<ComputerNode>> hashMap;
    private boolean graphCreated = false;

    /**
     * Constructor with no parameters
     */
    public CommunicationsMonitor(){
        R = new LinkedList<Triple>();
        hashMap = new HashMap<Integer, List<ComputerNode>>();
        numComputers = 0;
    }

    /**
     * Takes as input two integers c1, c2, and a timestamp. This triple
     * represents the fact that the computers with IDs c1 and c2 have
     * communicated at the given timestamp. This method should run in O(1) time.
     * Any invocation of this method after createGraph() is called will be
     * @param c1
     * @param c2
     * @param timestamp
     */
    public void addCommunication(int c1, int c2, int timestamp){

        //Check to see if graph is already created
        if(graphCreated == false){

            //Add a new communication of two computers to the list "R"
            R.add(new Triple(c1, c2, timestamp));
        }
    }

    public void createGraph(){
        if (graphCreated == false){

            graphCreated = true;

        }
    }


    //--------------HELPER METHODS GO BELOW------------------------

    /**
     * Return the communication list
     * @return - List of connected computers and timestamps
     */
    public List<Triple> getR(){
        return R;
    }


    /**
     * Recursive helper for DFS
     *
     * @param node node hit at this level of recursion
     */
    private void DFSVisit(ComputerNode node){

        node.setColor(Color.GRAY);
        for(ComputerNode neighbor : node.getOutNeighbors()){
            neighbor.setCC(node.getCC());
            if (neighbor.getColor() == Color.WHITE){
                neighbor.setPrev(node);
                DFSVisit(neighbor);
            }
        }
        node.setColor(Color.BLACK);
    }

    /**
     * DFS but taking in a HashMap version of the graph
     * @param graph
     */
    public void DFS(HashMap<Integer, List<ComputerNode>> graph){

        for (List<ComputerNode> list : graph.values()){
            for(ComputerNode node : list){
                node.setColor(Color.WHITE);
                node.setPrev(null);
            }
        }

        int ctr = 1;
        for (List<ComputerNode> list : graph.values()){
            for(ComputerNode node : list){
                if (node.getColor() == Color.WHITE){
                    node.setCC(ctr);
                    ctr++;
                    DFSVisit(node);
                }
            }
        }
    }

    /**
     * Creates an infected path starting from start node to end node
     * @param start
     * @param end
     * @return
     */
    private List<ComputerNode> createInfectedPath(ComputerNode start, ComputerNode end) {

        ComputerNode curNode = end;
        List<ComputerNode> infectedPath = new LinkedList<ComputerNode>();

        while(curNode != start) {
            infectedPath.add(0, curNode);
            curNode = curNode.getPrev();
        }

        infectedPath.add(0, start);
        return infectedPath;
    }

}
