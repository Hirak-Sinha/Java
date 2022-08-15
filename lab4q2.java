public class lab4q2 {
    public static void main (String[] args) {
        for(int i =0; i< args.length; i++){
            int num = Integer.parseInt(args[i]);
            if(num%2 == 0)
            {
                System.out.println("Even");
            }
            else
            {
                System.out.println("Odd");
            }
        }
    }
}
    
