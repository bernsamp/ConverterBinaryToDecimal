import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

                Scanner userInput= new Scanner(System.in);

                int binaryNumber = userInput.nextInt();

                String binaryNumberString= "" + binaryNumber;

                boolean isBinary = true;

                for(int i = 0 ; i < binaryNumberString.length() ; i++)
                {
                    if (!(binaryNumberString.charAt(i) == '0' || binaryNumberString.charAt(i) == '1')) {
                        isBinary = false;
                        break;
                    }
                }
                if(isBinary)
                {
                    int resultDecimal = converter(binaryNumber);
                    System.out.println("Decimal of " + binaryNumber + " is: "+resultDecimal);
                }
                else
                {
                    System.out.println("Something went wrong. Enter a binary number.");
                }
            }
    public static int converter(int number){

        int result = 0;
        int n = 0;

        while(true){
            if(number == 0){
                break;
            } else {
                int temp = number % 10;
                result += temp * Math.pow(2, n);
                number /= 10;
                n++;
            }
        }
        return result;
    }
}
