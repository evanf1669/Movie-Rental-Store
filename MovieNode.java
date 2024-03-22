public class MovieNode implements Comparable<MovieNode>{
    public String barcode;
    public String name;
    public boolean rented;
    public MovieNode next;
    public long renter;

    public MovieNode(String barcode, String name){
        this.barcode = barcode;
        this.name = name;
        this.rented = false;
        this.next = null;
        this.renter = 0;
    }

    public int compareTo(MovieNode other){
        if(this.barcode.compareTo(other.barcode) > 0) return 1;
        return -1;
    }

    public String toString(MovieNode m){
        return m.barcode + " : " + m.name;
    }

}
