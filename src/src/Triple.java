public class Triple implements Comparable<Triple> {

    private ComputerNode Ci, Cj;
    private int tk;

    public Triple(ComputerNode Ci, ComputerNode Cj, int tk) {
        this.Ci = Ci;
        this.Cj = Cj;
        this.tk = tk;
    }

    @Override
    public int compareTo(Triple o) {
        return 0; //TODO
    }

    public ComputerNode getCi() {
        return Ci;
    }

    public ComputerNode getCj() {
        return Cj;
    }

    public int getTk() {
        return tk;
    }
}    