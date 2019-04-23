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

    
}
