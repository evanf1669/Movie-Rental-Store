public class LinkedList {
    MovieNode head;
    int count;

    //O(1)
    public LinkedList(){
        this.head = null;
        count = 0;
    }

    //O(1)
    public void addToFront(MovieNode n){
        n.next = head;
        head = n;
        count++;
    }

    //O(n)
    public void insert(MovieNode n){

        //is list empty?
        if(head==null){
            addToFront(n);
            return;
        }

        //Should the new Node go first?
        if(n.compareTo(head)<0){
            addToFront(n);
            return;
        }

        MovieNode current = head;
        while(current.next != null){
            //New Node goes before next one?
            if(n.compareTo(current.next)<0){
                n.next = current.next;
                current.next = n;
                count++;
                return;
            }
            current = current.next;
        }
        current.next = n;
    }

    //O(n)
    public MovieNode nameSearch(String search){
        MovieNode current = head;
        while(current.next != null){
            if (current.name.equals(search)){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    //O(n)
    public void renterSearch(String search, CustomerList cl){
        MovieNode mn = nameSearch(search);
        if(mn.rented == false) {
            System.out.println("This movie is not currently rented.");
            return;
        }
        long phonenum = mn.renter;
        Node n = cl.search(phonenum);
        System.out.println(mn.name + " is being rented by " + n.firstName + " " + n.lastName + "\nPhone Number: " + n.phoneNumber);
    }

    //O(n)
    public MovieNode barcodeSearch(String barcode){
        MovieNode current = head;
        while(current.next != null){
            if ((current.barcode.equals(barcode))){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void printR(){
        printR(head);
    }

    public void printR(MovieNode n){
        if(n == null) return;

        System.out.println(n.name + " : " + n.barcode);
        printR(n.next);
    }

}
