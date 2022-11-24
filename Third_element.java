public class MOOC {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //creating the ArrayList
        ArrayList<String> l = new ArrayList<>();
        System.out.println("please enter a string element for the list");

        while (true) {
            //asking user for input 
            
            String n = scan.nextLine();

            //if n is not empty, we add it to the list, else, the program quit and prints the first element
            if (n != "") {
                l.add(n);
            } else {
                System.out.println(l.get(2));
                break;
            }
        }

    }
}
