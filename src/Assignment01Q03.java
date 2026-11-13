public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int first = 1;
        int second = 1;
        int numOdd = 2;
        System.out.print(""+first+""); System.out.print(" "+second);
        for (int i = 3; i < x + 1; i++  ){
            int momo = first + second;
            System.out.print(" "+ momo);
            if (momo % 2 == 1){
                numOdd ++;
            }
            first = second;
            second = momo ;
        }
        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}