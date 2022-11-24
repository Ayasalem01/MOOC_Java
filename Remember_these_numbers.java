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
                for(int i=0;i<l.size();i++){
                    System.out.println(l.get(i));
                }
                break;
            }
        }

    }
}
