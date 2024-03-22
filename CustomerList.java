public class CustomerList {
    Node head;
    int count;

    //O(1)
    public CustomerList(){
        this.head = null;
        count = 0;
    }
    //O(1)
    public void addToFront(Node n){
        n.next = head;
        head = n;
        count++;
    }

    //O(n)
    public void insert(Node n){

        if(head==null){
            addToFront(n);
            return;
        }

        if(n.compareTo(head)<0){
            addToFront(n);
            return;
        }

        Node current = head;
        while(current.next != null){
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
    public Node search(long phoneNumber){
        Node current = head;
        while(current != null){
            if (current.phoneNumber == phoneNumber){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void printR(){
        printR(head);
    }

    public void printR(Node n){
        if(n == null) return;

        System.out.println(n.firstName + " " + n.lastName);
        printR(n.next);
    }

    //O(n)
    public void rturn(String barcode, LinkedList movieList, long phoneNumber){
        MovieNode  mn = movieList.barcodeSearch(barcode);

        
        Node n = search(phoneNumber);
        if(n == null){
            System.out.println("Sorry, you are not the renter nor do you have an account with us.");
            return;
        }
        if(mn.renter != n.phoneNumber){
            System.out.println("Sorry, you are not the renter of this movie.");
            return;
        }
        n.numRented -= 1;
        mn.renter = 0;
        mn.rented = false;
        System.out.println("Success, thank you for returning the movie.");
        return;
    }

    //O(n)
    public void rent(String barcode, LinkedList movieList, long phoneNumber){
        MovieNode  mn = movieList.barcodeSearch(barcode);
        Node n = search(phoneNumber);
        if(n == null) {
            System.out.println("You are not in our system, please make an account with us.");
            return;
        }
        if(mn == null){
            System.out.println("Sorry, we dont have that movie!");
            return;
        } 
        if(mn.rented == true){
            System.out.println("Sorry, someone else has this rented.");
            return;
        } 
        if (n.numRented == 3){
            System.out.println("Sorry you can only rent 3 movies at a time.");
            return;
        }
        mn.rented = true;
        n.numRented += 1;
        mn.renter = n.phoneNumber;
        System.out.println("Success, you have rented the movie!");
        return;
    }
}
