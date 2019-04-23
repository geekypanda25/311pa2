public class Triple implements Comparable<Triple> {

    private int Ci, Cj;
    private int tk;

    public Triple(int Ci, int Cj, int tk) {
        this.Ci = Ci;
        this.Cj = Cj;
        this.tk = tk;
    }

    @Override
    public int compareTo(Triple o) {
        return 0; //TODO
    }

    public int getCi() {
        return Ci;
    }

    public int getCj() {
        return Cj;
    }

    public int getTk() {
        return tk;
    }
}    