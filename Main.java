import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        LinkedList movieList = new LinkedList();
        movieList.insert(new MovieNode("394828394923", "Star Wars"));
        movieList.insert(new MovieNode("382057828493", "La La Land"));
        movieList.insert(new MovieNode("893959287583", "Whiplash"));
        movieList.insert(new MovieNode("849382985983", "The Boy and the Heron"));
        movieList.insert(new MovieNode("285938495820", "Avatar"));
        movieList.printR();
        
        CustomerList cl = new CustomerList();
        cl.insert(new Node("Emily", "Frazier", 8293283498L));
        cl.insert(new Node("Ian", "Moscato", 3849282938L));
        
        while(true){
            System.out.print("What would you like to do? \n1 - Add customer \n2 - Add movie \n3 - Rent movie \n4 - Return movie \n5 - Search movie \n6 - Exit\n");
            int choice = scan.nextInt();
            scan.nextLine();
            if(choice == 1){
                System.out.println("What is your first name?");
                String firstName = scan.nextLine();
                System.out.println("What is your last name?");
                String lastName = scan.nextLine();
                System.out.println("What is your phone number?");
                long phoneNumber = scan.nextLong();
                scan.nextLine();
                Node n = new Node(firstName, lastName, phoneNumber);
                cl.insert(n);

            }
            if(choice == 2){
                System.out.println("What is the name of the movie?");
                String movie = scan.nextLine();
                System.out.println("What is the movie's barcode?");
                String barcode = scan.nextLine();
                MovieNode mn = new MovieNode(barcode, movie);
                movieList.insert(mn);

            }
            if(choice == 3){
                System.out.println("What is your phone number?");
                long phoneNumber = scan.nextLong();
                scan.nextLine();
                System.out.println("Which movie do you want to rent?");
                String movie = scan.nextLine();
                cl.rent(movie, movieList, phoneNumber);
            }
            if(choice == 4){
                System.out.println("What is your phone number?");
                long phoneNumber = scan.nextLong();
                scan.nextLine();
                System.out.println("Which movie do you want to return?");
                String movie = scan.nextLine();
                cl.rturn(movie, movieList, phoneNumber);

            }
            if(choice == 5){
                System.out.println("What movie are you looking for?");
                String movie = scan.nextLine();
                movieList.renterSearch(movie, cl);
            }
            if(choice == 6){

                return;
            }
        
        
    }
}
}
