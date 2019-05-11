//Alexander Urbanyak
//CS 1302
//Generate 37 random numbers
//Display number, prime status, divisible integers

public class Assignment_1 {

    public static boolean isPrime(int number) {   //check prime method
        for (int divisor = 2; divisor <= number / 2; divisor++) {
          if (number % divisor == 0)
           return false;
        }
        return true;
    }//end prime method
    
        public static int[] divisor(int number) {   //check disivor method
          int[] array = new int[101];
          //make sure 1 gets a divisor as itself
             if (number == 1) 
              array[1] = 1;
            ////////////////// 
            for (int j = 2; j <= number; j++) {
             if (number % j == 0)
              array[j] += j;
            }
          return array;
        }//end divisor method
    
    public static void main(String[] args) {
      //Header
      System.out.println("Number\t" + "Prime\t" + "Integers Divisible");
      //Number generate loop
        for(int i = 0; i < 37; i++){
         int number = 1 + (int)(Math.random() * 100); //generate random numbers 1-99
         String prime;
          if (isPrime(number) == true)
              prime = "Prime";
          else 
              prime = "No";
          //Divisor string
          String str = "";
          //extract non-zero numbers from the array
          for (int m = 0; m <= 100; m++) {
              if (divisor(number)[m] != 0)
                 str += (" " + Integer.toString(m));
          }
          System.out.println(number + "\t" + prime + "\t" + str);
          //System.out.println(args[0]);
        }
    }
    
}
