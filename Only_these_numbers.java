public class MOOC {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //creating the ArrayList
        ArrayList<Integer> l = new ArrayList<>();
        System.out.println("please enter a string element for the list");

        while (true) {
            //asking user for input 
            
            Integer n = scan.nextInt();

            //if n is not empty, we add it to the list, else, the program quit and prints the first element
            if (n !=-1) {
                l.add(n);
            } else {
                
                //ask for starting point 
                System.out.println("From where?");
                Integer s=scan.nextInt();
                
                //ask for last point range
                System.out.println("From where?");
                Integer f=scan.nextInt();
                
                for(int i=s;i<=f;i++){
                    System.out.println(l.get(i));
                }
                break;
            }
        }

    }
}
