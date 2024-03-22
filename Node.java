public class Node implements Comparable<Node>{
    public String firstName;
    public String lastName;
    public int[] rented;
    public int numRented;
    public long phoneNumber;
    public Node next;

    public Node (String firstName, String lastName, long phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.rented = null;
        this.next = null;
        this.numRented = 0;
    }

    public int compareTo(Node other){
        if(this.firstName.compareTo(other.firstName) > 0) return 1;
        return -1;
    }



}